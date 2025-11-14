package com.smart.event.back_end.dtos.authantification;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LoginRequest {
    private String username;
    private String password;


}
