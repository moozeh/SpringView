package org.moozeh.SpringView.domain.account;

import jakarta.persistence.*;
import org.moozeh.SpringView.global.BaseTimeEntity;

@Entity
public class Account extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private AccountType loginType;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String nickname;
}
