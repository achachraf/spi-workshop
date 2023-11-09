package io.github.achachraf.application;

/**
 * Main formatter interface
 */
public interface Formatter {


    /**
     * Formats the document
     * @param document document to be formatted
     * @return formatted document
     */
    String formatDocument(String document);

}
