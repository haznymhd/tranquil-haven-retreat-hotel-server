package com.hasni.tranquil.exception;

/**
 * @author Hasni
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
