package com.quiz.model

import javax.persistence.*

@Entity
@Table
class Question(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var question:String=""
)