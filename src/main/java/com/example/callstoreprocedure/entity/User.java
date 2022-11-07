package com.example.callstoreprocedure.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author CuongLM18
 * @created 07/11/2022 - 11:14 AM
 * @project call-store-procedure
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column(nullable = false, unique = true, columnDefinition = "varchar(50)")
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column
    private String address;

    @Column
    private String fullName;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private String avatar;

    @ManyToMany
    @JoinTable(
            name = "permission",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false)
    )
    @JsonIgnore
    private Set<Role> roles = new HashSet<>();
}
