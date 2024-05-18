package com.hasni.tranquil.exception;

/**
 * @author Hasni
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
