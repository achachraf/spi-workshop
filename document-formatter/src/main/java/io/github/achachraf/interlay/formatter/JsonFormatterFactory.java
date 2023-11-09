package io.github.achachraf.interlay.formatter;

import io.github.achachraf.application.Formatter;
import io.github.achachraf.application.FormatterFactory;

public class JsonFormatterFactory implements FormatterFactory {

    @Override
    public Formatter createFormatter() {
        return new JsonFormatter();
    }

    @Override
    public boolean supports(String documentType) {
        return "json".equals(documentType);
    }
}
