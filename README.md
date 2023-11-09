# SPI WORKSHOP

## Introduction

This is simple example to introduce SPI (Service Provider Interface) with a document formatter usecase. The example is divided into 2 parts:

1. The `document-formatter` module which contains the core logic of the document formatter.
2. The `document-formatter-cli` module which contains the CLI (Command Line Interface) to use the document formatter.

## Document Formatter

The document formatter is a simple interface which takes a `String` and returns a `String`. The `String` is the content of the document to format and the returned `String` is the formatted document.

```java
public interface Formatter {

    String formatDocument(String document);

}
```

## Document Formatter Implementations

The document formatter has 2 default provided implementations:

1. `XmlFormatter` which formats the document as XML.
2. `JsonFormatter` which formats the document as JSON.

## Extensibility

The purpose of this example is to show how to extend the document formatter with new implementations, without modifying the core logic of the document formatter.
The document formatter is designed to be extensible by using the SPI (Service Provider Interface) mechanism.

The document formatter factory provide ruses the `java.util.ServiceLoader` to load the implementations 
of the `FormatterFactory` interface. The implementations are loaded from the `META-INF/services` directory of the classpath.
    
Provider found at: io.github.achachraf.interlay.DocumentFormatterService


## How to register a new implementation

To register a new implementation of the document formatter, you need to create a new module which contains the implementation of the `Formatter` and `FormatterFactory` interfaces.

The `FormatterFactory` interface is responsible for creating the `Formatter` implementation.

```java

public class customFormatterFactory implements FormatterFactory {

    @Override
    public Formatter createFormatter() {
        return new CustomFormatter();
    }

    @Override
    public boolean supports(String documentType) {
        return "custom".equals(documentType); // add your custom condition here
    }

}
```

The `FormatterFactory` implementation must be registered in the `META-INF/services` directory of the classpath.

The file name must be the fully qualified name of the `FormatterFactory` interface:  `io.github.achachraf.application.FormatterFactory`




