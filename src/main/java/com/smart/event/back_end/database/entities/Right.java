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
@Table(name = "rights")
public class Right {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // auto-generated primary key

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "group_name") // avoid using SQL reserved word "group"
    private String group;

    // Relation with Role
    @ManyToMany(mappedBy = "rights", fetch = FetchType.LAZY)
    private List<Role> roles;
}

