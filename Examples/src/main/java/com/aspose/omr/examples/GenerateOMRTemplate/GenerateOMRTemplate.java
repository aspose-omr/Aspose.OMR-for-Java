package com.aspose.omr.examples.GenerateOMRTemplate;

import com.aspose.omr.GenerationResult;
import com.aspose.omr.OmrEngine;
import com.aspose.omr.examples.Utils;

public class GenerateOMRTemplate {
    public static void run() {
        // ExStart:1
        String sourceDirectory = Utils.combine(Utils.getSourceDirectory(), "Generation");
        String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "GenerationResult");

        String[] GenerationMarkups = new String[] { "Sheet.txt", "Grid.txt", "AsposeTest.txt" };
        String[] GenerationMarkupsNoExt = new String[] { "Sheet", "Grid", "AsposeTest" };

        OmrEngine engine = new OmrEngine();

        for (int i = 0; i < GenerationMarkups.length; i++)
        {
            // call template generation providing path to the txt file with markup
            GenerationResult res = engine.generateTemplate(Utils.combine(sourceDirectory, GenerationMarkups[i]));

            // check in case of errors
            if (res.getErrorCode() != 0)
            {
                System.out.println("ERROR CODE: " + res.getErrorCode());
            }

            // save generation result: image and .omr template
            res.save(outputDirectory, GenerationMarkupsNoExt[i]);
        }
        // ExEnd:1
        System.out.println("GenerateOMRTemplate executed successfully.\n\r");
    }
}
