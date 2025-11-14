package com.smart.event.back_end.dtos.authantification;

import lombok.Data;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResetPasswordRequest {
    private String token;
    private String newPassword;


}
