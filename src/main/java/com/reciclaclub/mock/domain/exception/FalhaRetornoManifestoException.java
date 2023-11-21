package com.reciclaclub.mock.domain.exception;

public class FalhaRetornoManifestoException extends Exception{

    public FalhaRetornoManifestoException() {
    }

    public FalhaRetornoManifestoException(String message) {
        super(message);
    }

    public FalhaRetornoManifestoException(String message, Throwable cause) {
        super(message, cause);
    }

    public FalhaRetornoManifestoException(Throwable cause) {
        super(cause);
    }

    public FalhaRetornoManifestoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
