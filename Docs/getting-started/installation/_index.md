---
title: Installation
type: docs
weight: 50
url: /java/installation/
---

## **Installing Aspose.OMR for Java from Maven Repository**
Aspose hosts all Java APIs on the [Maven repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose). You can easily use Aspose.OMR for Java API directly in your Maven Projects with simple configurations.
### **Specify Maven Repository Configuration**
First, you need to specify Aspose Maven Repository configuration/location in your Maven **pom.xml** as follows:

{{< highlight java >}}

 <repositories>

    <repository>

        <id>AsposeJavaAPI</id>

        <name>Aspose Java API</name>

        <url>http://repository.aspose.com/repo/</url>

    </repository>

</repositories>

{{< /highlight >}}
### **Define Aspose.OMR for Java API Dependency**
Then define Aspose.OMR for Java API dependency in your **pom.xml** as follows:

{{< highlight java >}}

 <dependency>

	<groupId>com.aspose</groupId>

	<artifactId>aspose-omr</artifactId>

	<version>19.12</version>

	<classifier>jdk6</classifier>

</dependency>

<dependency>

	<groupId>com.aspose</groupId>

	<artifactId>aspose-omr</artifactId>

	<version>19.12</version>

	<classifier>javadoc</classifier>

</dependency>

{{< /highlight >}}

After performing the above steps, Aspose.OMR for Java dependency will finally be defined in your Maven Project.
## **Technical Support**
Aspose provides unlimited free technical support for all its products. The support is available to all users, including evaluation.

If you need help with Aspose.OMR, consider the following:

- The main avenue for support is the [Aspose.Forums](https://forum.aspose.com/). Post your question in the [Aspose.OMR Support Forum](https://forum.aspose.com/c/omr) and it will be answered within a few hours.
- Please note, Aspose does not provide technical support over the phone. Phone support is only available for sales and purchase questions.
- When expecting a reply in the forums, please allow for time zone differences.

If you have an issue with Aspose.OMR, follow these simple steps to make sure it is resolved in the most efficient way:

- Make sure you use the latest Aspose.OMR version before reporting the issue.
- Have a look through the forums, this documentation, and API Reference before reporting the issue; maybe your question was already answered.
- When reporting an issue, please include the original document and possibly a fragment of your code that causes the problem. If you need to attach multiple files, zip them into one. It is safe to attach your documents in Aspose.Forums if the thread is marked/created as Private since only you and Aspose developers will have access to the attached files.
- Please try to report one issue per thread. If you have another issue, report it in a separate thread.
