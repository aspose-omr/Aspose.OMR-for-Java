package com.aspose.omr.examples.GettingStarted;

import com.aspose.omr.License;

public class LoadLicenseFromStream {
    public static void run() throws Exception {
        // ExStart:1
        // Initialize license object
        License omrLicense = new License();
        // Set license
        // Pass valid license path
        omrLicense.setLicense(new java.io.FileInputStream("Aspose.OMR.lic"));
        // ExEnd:1
        System.out.println("LoadLicenseFromStream executed successfully.\n\r");
    }
}
