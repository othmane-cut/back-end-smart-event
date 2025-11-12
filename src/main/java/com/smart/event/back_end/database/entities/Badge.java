package com.smart.event.back_end.database.entities;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "badges") // optional, you can rename it
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // use Long for auto-generated IDs

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 500)
    private String description;

    private String design;

    private boolean published;
}

