package com.aspose.omr.examples.PerformOMR;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.RecognitionResult;
import com.aspose.omr.TemplateProcessor;
import com.aspose.omr.examples.Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PerformOMRWithThreshold {
    public static void run() throws FileNotFoundException {
        // ExStart:1
        String TemplateName = "Sheet.omr";
        String[] UserImages = new String[] { "Sheet1.jpg", "Sheet2.jpg" };
        String[] UserImagesNoExt = new String[] { "Sheet1", "Sheet2" };

        String sourceDirectory = Utils.getSourceDirectory();
        String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "Result");
        String templatePath = Utils.combine(Utils.getSourceDirectory(), TemplateName);

        int customThreshold = 40;

        // initialize engine and get template processor providing path to the .omr file
        OmrEngine engine = new OmrEngine();
        TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);
        System.out.println("Template loaded.");

        // images loop
        for (int i = 0; i < UserImages.length; i++) {
            // path to the image to be recognized
            String imagePath = Utils.combine(sourceDirectory, UserImages[i]);
            System.out.println("Processing image: " + imagePath);

            // recognize image and receive result
            RecognitionResult result = templateProcessor.recognizeImage(imagePath, customThreshold);

            // export results as csv string
            String csvResult = result.getCsv();

            String json = result.getJson();

            String outputName = Utils.combine(outputDirectory, UserImagesNoExt[i] + "_threashold.csv");

            // save csv to the output folder
            PrintWriter wr = new PrintWriter(new FileOutputStream(outputName), true);
            wr.println(csvResult);
            System.out.println("Generated File: " + outputName);
        }
        // ExEnd:1
        System.out.println("PerformOMRWithThreshold executed successfully.\n\r");
    }
}
