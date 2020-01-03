package com.aspose.omr.examples;

import java.io.File;

public class Utils {
    public static String combine(String path1, String path2)
    {
        File file1 = new File(path1);
        File file2 = new File(file1, path2);
        return file2.getPath();
    }

    public static String getSourceDirectory()
    {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        String srcDir = dir.toString() + File.separator + "01_SourceDirectory"+ File.separator;

        return srcDir;
    }

    public static String getOutputDirectory()
    {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        String outDir = dir.toString()+ File.separator + "02_OutputDirectory"+ File.separator;

        return outDir;
    }
}
