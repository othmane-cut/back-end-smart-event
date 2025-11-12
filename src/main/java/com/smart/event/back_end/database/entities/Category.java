package com.smart.event.back_end.database.entities;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // better use Long for auto-generated IDs

    @Column(nullable = false, unique = true)
    private String name;

    private String icon;

    @Column(length = 500)
    private String description;
}

