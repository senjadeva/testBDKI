package com.test.testbdki.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Base64;

public class FileUtil {

    private byte[] byteArray;

    public FileUtil(String base64ImageString) {
        String delims = "[,]";
        String[] parts = base64ImageString.split(delims);

        String imageString = "";
        if(parts.length > 1) {
            imageString = parts[1];
        } else {
            imageString = base64ImageString;
        }
        byteArray = Base64.getDecoder().decode(imageString);
    }

    public String getFileExtension() {
        InputStream is = new ByteArrayInputStream(byteArray);
        String mimeType = null;
        String extension = null;
        try {
            mimeType= URLConnection.guessContentTypeFromStream(is);
            String delimeter = "[/]";
            String[] tokens = mimeType.split(delimeter);
            extension = tokens[1];
            return extension.toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }



}
