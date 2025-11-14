package com.smart.event.back_end.dtos.authantification;

import lombok.Data;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ForgotPasswordRequest {
    private String email;

    // Getters et Setters
}
