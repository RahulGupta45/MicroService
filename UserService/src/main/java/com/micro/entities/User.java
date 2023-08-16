package com.micro.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "micro_user")
@Builder
public class User {

    @Id
    @Column(name = "Id")
    private String userId;

    @Column(name = "Name", length = 15)
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "About")
    private String about;

    @Transient
    private List<Rating> rating = new ArrayList<>();
}
