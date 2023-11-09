package io.github.achachraf.interlay.formatter;

import io.github.achachraf.application.Formatter;

public class XmlFormatter implements Formatter {

    @Override
    public String formatDocument(String document) {
        System.out.println("Formatting document as XML");
        return document;
    }
}
