---
title: Licensing
type: docs
weight: 60
url: /java/licensing/
---

## **Evaluation Version Limitations**
We want our customers to test our components thoroughly before buying so the evaluation version allows you to use it as you would normally.

**Limit of the Number of Questions that can be processed** 
The evaluation version (without a license initialization) provides full product functionality, but it has the following limitation: only five questions of any page can be recognized.
### **Setting a License**
The license can be loaded from a file or stream object. The examples provided below demonstrate how to set a license file in your application.
#### **Example 1**
The easiest way to apply a license is to put the license file in the same folder that contains the JARs of your application and specify just the filename without a path.

{{< gist "aspose-com-gists" "e23bf9c35822b97b61f2910829c5d045" "Examples-src-main-java-com-aspose-omr-examples-GettingStarted-LoadLicenseFromFile-1.java" >}}

{{% alert color="primary" %}} 

When you call the [SetLicense](https://apireference.aspose.com/java/omr/com.aspose.omr/License#setLicense-java.lang.String-) method, the license name that you pass should be that of your license file. For example, if you change the license file name to "Aspose.OMR.lic.xml" pass that filename to the [OMR.SetLicense(…)](https://apireference.aspose.com/java/omr/com.aspose.omr/License#setLicense-java.lang.String-) method. The license file can be specific for Aspose.OMR for Java or you can use Aspose.Total for Java license file.

{{% /alert %}} 
#### **Example 2**
The following example shows how to load a license from a stream.

{{< gist "aspose-com-gists" "e23bf9c35822b97b61f2910829c5d045" "Examples-src-main-java-com-aspose-omr-examples-GettingStarted-LoadLicenseFromStream-1.java" >}}
