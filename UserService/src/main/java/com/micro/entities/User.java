package com.micro.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
