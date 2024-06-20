package com.example.shoppingmall.entity;

import com.example.shoppingmall.entity.type.MemberRoleType;
import jakarta.persistence.*;

@Entity
@Table(name="Member")
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="member_id")
    private Long id;

    @Column(name="member_password")
    private String password;

    @Column(name="member_role")
    @Enumerated(EnumType.STRING)
    private MemberRoleType roleType;


}
