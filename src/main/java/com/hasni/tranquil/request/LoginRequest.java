package com.hasni.tranquil.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Hasni
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
