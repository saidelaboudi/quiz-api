package com.quiz.model

import javax.persistence.*

@Entity
@Table
class Response(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=null,
    @OneToOne(cascade = [CascadeType.ALL])
    var question:Question?=null,
    var choice:Long?=null
) {
}