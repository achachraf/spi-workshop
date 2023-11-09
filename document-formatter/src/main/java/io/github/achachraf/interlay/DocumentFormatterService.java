package io.github.achachraf.interlay;

import io.github.achachraf.application.FormatterFactory;
import io.github.achachraf.application.Formatter;
import io.github.achachraf.interlay.formatter.FormatterFactoryProvider;

/**
 * Exposed resource for formatting documents.
 */
public class DocumentFormatterService {

    private final FormatterFactoryProvider formatterFactoryProvider;

    public DocumentFormatterService() {
        this.formatterFactoryProvider = new FormatterFactoryProvider();
    }

    public String formatDocument(String document, String documentType) {
        FormatterFactory formatterFactory = formatterFactoryProvider.createFormatterFactory(documentType);
        Formatter formatter = formatterFactory.createFormatter();
        return formatter.formatDocument(document);
    }
}
