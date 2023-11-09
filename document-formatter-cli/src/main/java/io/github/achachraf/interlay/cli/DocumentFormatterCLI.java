package io.github.achachraf.interlay.cli;

import io.github.achachraf.interlay.DocumentFormatterService;

public class DocumentFormatterCLI {

    public static void main(String[] args) {
        String document = "{\"field\":\"value\"}";
        DocumentFormatterService documentFormatterService = new DocumentFormatterService();
        String formattedDocument = documentFormatterService.formatDocument(document, "json");
        System.out.println(formattedDocument);
    }
}