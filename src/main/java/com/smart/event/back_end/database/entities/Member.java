package com.smart.event.back_end.database.entities;

import com.smart.event.back_end.database.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "members")
@PrimaryKeyJoinColumn(name = "user_id") // links Member to User table
public class Member extends User {

    private String birthday;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String country;

    private String city;

    // Many-to-many relation with Event (favorite events)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "member_favorites",
            joinColumns = @JoinColumn(name = "member_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> favoris;
}


