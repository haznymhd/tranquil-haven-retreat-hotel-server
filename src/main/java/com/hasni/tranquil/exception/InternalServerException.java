package com.hasni.tranquil.exception;

/**
 * @author Hasni
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
