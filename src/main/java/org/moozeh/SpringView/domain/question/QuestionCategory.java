package org.moozeh.SpringView.domain.question;

import jakarta.persistence.*;
import org.moozeh.SpringView.global.BaseTimeEntity;

import java.util.Set;

@Entity
public class QuestionCategory extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionCategoryId;

    @Column(nullable = false)
    private String name;
}
