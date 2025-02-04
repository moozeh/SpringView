package org.moozeh.SpringView.question;

import jakarta.persistence.*;
import org.moozeh.SpringView.common.BaseTimeEntity;

@Entity
public class QuestionCategory extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionCategoryId;

    @Column(nullable = false)
    private String name;
}
