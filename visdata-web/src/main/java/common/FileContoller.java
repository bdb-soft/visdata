package common;

import org.apache.commons.io.FilenameUtils;

import java.util.Arrays;

public class FileContoller {

    private static final String[] CORRECT_EXTENSION_ARRAY = {"csv", "xml", "json", "txt"};

    public static boolean checkFileExtension(String fileName) {
        String fileExtension = FilenameUtils.getExtension(fileName);
        if (Arrays.asList(CORRECT_EXTENSION_ARRAY).contains(fileExtension)) {
            return true;
        }
        return false;
    }
}
