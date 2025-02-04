package org.moozeh.SpringView.account;

import jakarta.persistence.*;
import org.moozeh.SpringView.common.BaseTimeEntity;

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
