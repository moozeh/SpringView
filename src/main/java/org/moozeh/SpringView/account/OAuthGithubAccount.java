package org.moozeh.SpringView.account;

import jakarta.persistence.*;

@Entity
public class OAuthGithubAccount {
    @Id
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    private String refreshToken;
}
