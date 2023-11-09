package io.github.achachraf.application;

/**
 * The factory has the responsibility of creating the correct formatter for a given document type.
 * The factory is also responsible for determining if it supports a given document type.
 * To learn more about the factory pattern,
 * see <a href="https://refactoring.guru/design-patterns/factory-method/java/example">Factory Method</a>
 */
public interface FormatterFactory {

    /**
     * Creates a formatter for a given document type.
     * The type is already known as each factory only supports one type.
     * @return a formatter
     */
    Formatter createFormatter();


    /**
     * Determines if the factory supports a given document type.
     * Used by the provider to find the correct factory.
     * @param documentType the document type
     * @return true if the factory supports the document type, false otherwise
     */
    boolean supports(String documentType);

}
