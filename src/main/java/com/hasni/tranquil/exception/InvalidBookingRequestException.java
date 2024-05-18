package com.hasni.tranquil.exception;

/**
 * @author Hasni
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
