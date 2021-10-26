package com.quiz.service

import com.quiz.model.Question

interface QuestionService {
    fun save(question: Question)
    fun get(id: Long): Question
    fun delete(id: Long)
    fun getAll() : List<Question>
}