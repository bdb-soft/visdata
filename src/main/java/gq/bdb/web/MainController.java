package gq.bdb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(name = "/index", method = RequestMethod.GET)
    public String showIndex() {
        System.out.println("MainController.showIndex done");
        return "index";
    }

}
