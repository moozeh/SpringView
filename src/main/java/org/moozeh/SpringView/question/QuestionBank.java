package org.moozeh.SpringView.question;

import jakarta.persistence.*;
import org.moozeh.SpringView.account.Account;
import org.moozeh.SpringView.common.BaseTimeEntity;

@Entity
public class QuestionBank extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionBankId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Account user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Boolean isPublic;

    @Column(nullable = false)
    private Long usageCount;
}
