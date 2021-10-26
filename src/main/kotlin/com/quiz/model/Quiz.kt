package com.quiz.model

import javax.persistence.*

@Entity
@Table
class Quiz(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?=null,
    @OneToMany(cascade = [CascadeType.ALL])
    val responses:List<Response>?=null,
) {

}