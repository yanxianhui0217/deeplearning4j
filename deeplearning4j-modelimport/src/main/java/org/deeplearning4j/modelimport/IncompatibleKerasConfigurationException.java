package org.deeplearning4j.modelimport;


public class IncompatibleKerasConfigurationException extends RuntimeException {
    public IncompatibleKerasConfigurationException(String message) { super(message); }

    public IncompatibleKerasConfigurationException(String message, Throwable cause) { super(message, cause); }

    public IncompatibleKerasConfigurationException(Throwable cause) {
        super(cause);
    }
}