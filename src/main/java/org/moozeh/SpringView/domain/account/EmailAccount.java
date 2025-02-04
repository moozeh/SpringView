package org.moozeh.SpringView.domain.account;

import jakarta.persistence.*;

@Entity
public class EmailAccount {
    @Id
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;
}
