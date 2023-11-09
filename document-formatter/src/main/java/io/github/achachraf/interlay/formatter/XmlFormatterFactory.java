package io.github.achachraf.interlay.formatter;

import io.github.achachraf.application.Formatter;
import io.github.achachraf.application.FormatterFactory;

public class XmlFormatterFactory implements FormatterFactory {

    @Override
    public Formatter createFormatter() {
        return new XmlFormatter();
    }

    @Override
    public boolean supports(String documentType) {
        return "xml".equals(documentType);
    }
}
