package org.moozeh.SpringView.question;

import jakarta.persistence.*;

@Entity
public class BankCategoryMap {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private QuestionCategory category;

    @ManyToOne
    private QuestionBank questionBank;
}
