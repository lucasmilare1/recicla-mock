package com.reciclaclub.mock.domain.exception;

public class FalhaBuscaResiduoException extends Exception{
    public FalhaBuscaResiduoException() {
    }

    public FalhaBuscaResiduoException(String message) {
        super(message);
    }

    public FalhaBuscaResiduoException(String message, Throwable cause) {
        super(message, cause);
    }

    public FalhaBuscaResiduoException(Throwable cause) {
        super(cause);
    }

    public FalhaBuscaResiduoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
