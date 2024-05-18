package com.hasni.tranquil.exception;

/**
 * @author Hasni
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
