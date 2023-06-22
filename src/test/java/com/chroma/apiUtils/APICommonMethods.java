package com.chroma.apiUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class APICommonMethods {

    /**
     * This method will read a .json file and return it in a String type written in
     * json format - for passing REST payloads
     */

    public static String readJson(String fileName) {

        String jsonFile = null;
        try {
            jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonFile;
    }

}
