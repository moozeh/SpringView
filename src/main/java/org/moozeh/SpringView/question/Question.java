package org.moozeh.SpringView.question;

import jakarta.persistence.*;
import org.moozeh.SpringView.common.BaseTimeEntity;

@Entity
public class Question extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_bank_id")
    private QuestionBank questionBank;

    private String content;

    private Integer bankIndex;
}
