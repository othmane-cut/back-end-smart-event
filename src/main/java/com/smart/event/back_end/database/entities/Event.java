package com.smart.event.back_end.database.entities;

import com.smart.event.back_end.database.entities.enums.EventStatus;
import com.smart.event.back_end.database.entities.enums.EventType;
import com.smart.event.back_end.database.entities.enums.EventVisibility;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String description;

    private String image;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private EventVisibility visibility;

    @Enumerated(EnumType.STRING)
    private EventType type;

    @ElementCollection
    private List<String> sponsors; // simple string list for sponsors

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    // Each event has one category, category can have many events
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    // Created by user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_user_id")
    private User createdBy;

    // Badge relation: one badge can have many events, each event must have a badge
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "badge_id", nullable = false)
    private Badge badge;

    // Organizers: many-to-many between events and members
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "event_organizers",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<Member> organizers;

    // Social networks
    @Embedded
    private SocialNetwork socialNetwork;

    // Guests: one event → many guests
    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Guest> guests;

    // Comments: one event → many comments
    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Comment> comments;

    // Members: many-to-many with member favorites (optional if needed)
    @ManyToMany(mappedBy = "favoris", fetch = FetchType.LAZY)
    private List<Member> favoritedByMembers;
}

