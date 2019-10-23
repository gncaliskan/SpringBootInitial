package com.generic.demo.Entity;

import com.generic.demo.Enum.EnumUserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Gamze on 21.10.2019
 *
 */

@Entity
@Table(name = "demo_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    @Enumerated (EnumType.ORDINAL)
    private EnumUserRole userRole;



}
