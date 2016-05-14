package gq.bdb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class MainController {

    @RequestMapping(name = "/index", method = RequestMethod.GET)
    public String showIndex() {
        System.out.println("MainController.showIndex done");
        return "index";
    }

    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String showHelp() {
        System.out.println("MainController.showHelp done");
        return "help";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file, ModelMap model) {

        String name = null;

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                name = file.getOriginalFilename();

                String rootPath = "D:\\DEV\\temp\\visdata";
                File dir = new File(rootPath + File.separator + "loadFiles");

                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File uploadedFile = new File(dir.getAbsolutePath() + File.separator + name);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
                stream.write(bytes);
                stream.flush();
                stream.close();

//                logger.info("uploaded: " + uploadedFile.getAbsolutePath());
                model.addAttribute("fileName", name);
                return "uploadFile";

            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }
}
