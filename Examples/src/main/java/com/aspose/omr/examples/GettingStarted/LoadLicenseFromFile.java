package com.aspose.omr.examples.GettingStarted;

import com.aspose.omr.License;

public class LoadLicenseFromFile {
    public static void run() throws Exception {
        // ExStart:1
        // Initialize license object
        License omrLicense = new License();
        // Set license
        // Pass valid license path
        omrLicense.setLicense("Aspose.OMR.lic");
        // ExEnd:1
        System.out.println("LoadLicenseFromFile executed successfully.\n\r");
    }
}
