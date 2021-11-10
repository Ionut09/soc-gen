package com.java._5_strings;

import java.util.Arrays;

/**
 * File
 * un mod de a intercatiuna cu un path
 * /Users/ionut/workspace/soc-gen/settings.gradle
 */
public class Filepath {

    private String absolutePath; // /Users/ionut/workspace/soc-gen/settings.gradle

    private String separator;  // '/'

    public Filepath(String absolutePath, String separator) {
        this.absolutePath = absolutePath;
        this.separator = separator;
    }

    public String filename() {
        var lastIndexOfSeparator = absolutePath.lastIndexOf('/');
        return absolutePath.substring(lastIndexOfSeparator + 1);
    }

    public String fileExtension() {
        var filename = filename();
        var lastIndexOfExtensionSeparator = filename.lastIndexOf(".");
        return filename.substring(lastIndexOfExtensionSeparator + 1);
    }

    public int pathLength() {
        String[] elements = absolutePath.split("/");
        return elements.length - 1;
    }

    public static void main(String... args) {
        var path = "/Users/ionut/workspace/soc-gen/settings.gradle";
        path.split("");//String[] cu toate caracterele
        path.toCharArray();//char[] cu toate caracterele

        System.out.println(Arrays.toString(path.split("/")));

        Filepath filepath = new Filepath(path, "/");
        System.out.println(filepath.filename());
        System.out.println(filepath.fileExtension());
        System.out.println(filepath.pathLength());
    }

}
