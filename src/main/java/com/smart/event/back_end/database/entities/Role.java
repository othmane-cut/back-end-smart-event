package com.smart.event.back_end.database.entities;



import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // Many-to-many relation with Right
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_rights",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "right_id")
    )
    private List<Right> rights;

    // One role → many users
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;
}


