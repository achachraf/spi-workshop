package io.github.achachraf.interlay.formatter;

import io.github.achachraf.application.FormatterFactory;

import java.util.ServiceLoader;

public class FormatterFactoryProvider {

    public FormatterFactory createFormatterFactory(String documentType) {
        Iterable<FormatterFactory> allFormatters = getListOfAllFormattersMagically();

        for (FormatterFactory formatterFactory : allFormatters) {
            if (formatterFactory.supports(documentType)) { // here we delegate the conditional to the FormatterFactory
                return formatterFactory;
            }
        }
        throw new IllegalArgumentException("No formatter found for document type " + documentType);
    }

    private Iterable<FormatterFactory> getListOfAllFormattersMagically() {
        ServiceLoader<FormatterFactory> loader = ServiceLoader.load(FormatterFactory.class); // This is SPI magic
        return loader;
    }
}
