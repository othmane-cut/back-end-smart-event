package com.smart.event.back_end.database.entities;



import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialNetwork {

    private String facebook;
    private String instagram;
    private String twitter;
}

