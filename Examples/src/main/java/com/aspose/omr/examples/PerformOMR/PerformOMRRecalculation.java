package com.aspose.omr.examples.PerformOMR;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.RecognitionResult;
import com.aspose.omr.TemplateProcessor;
import com.aspose.omr.examples.Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import static com.aspose.omr.examples.Utils.combine;

public class PerformOMRRecalculation {
    public static void run() throws FileNotFoundException {
        // ExStart:1
        String TemplateName = "Sheet.omr";
        String[] UserImages = new String[] { "Sheet1.jpg", "Sheet2.jpg" };
        String[] UserImagesNoExt = new String[] { "Sheet1", "Sheet2" };

        String sourceDirectory = Utils.getSourceDirectory();
        String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "Result");
        String templatePath = Utils.combine(Utils.getSourceDirectory(), TemplateName);

        // init engine and get template processor
        OmrEngine engine = new OmrEngine();
        TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);
        System.out.println("Template loaded.");

        // Set custom threshold to use in recalculation
        // this value is in range (0..100)
        // represents the percentage of required black pixels on bubble image to be recognized
        // i.e. the lower the value - the less black pixels required for bubble to be counted as filled and vice versa
        int CustomThreshold = 40;

        // images loop
        for (int i = 0; i < UserImages.length; i++)
        {
            String image = UserImages[i];
            String imagePath = Utils.combine(sourceDirectory, image);
            System.out.println("Processing image: " + imagePath);

            // recognize image
            RecognitionResult result = templateProcessor.recognizeImage(imagePath);

            // get export csv string
            String stringRes = result.getCsv();

            // save csv to output folder
            String outputName = combine(outputDirectory, UserImagesNoExt[i] + ".csv");

            PrintWriter wr = new PrintWriter(new FileOutputStream(outputName), true);
            wr.println(stringRes);

            System.out.println("Export done. Path: " + outputName);

            // recalculate recognition results with custom threshold
            templateProcessor.recalculate(result, CustomThreshold);

            // get export csv string
            stringRes = result.getCsv();

            // save recalculated results
            outputName = combine(outputDirectory, UserImagesNoExt[i] + "_recalculated.csv");

            wr = new PrintWriter(new FileOutputStream(outputName), true);
            wr.println(stringRes);

            System.out.println("Recalculated result export done. Path: " + outputName);
            System.out.println();
        }
        // ExEnd:1
        System.out.println("PerformOMRRecalculation executed successfully.\n\r");
    }
}
