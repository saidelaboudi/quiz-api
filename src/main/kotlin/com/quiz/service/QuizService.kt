package com.quiz.service

import com.quiz.model.Quiz

interface QuizService {
    fun save(quiz: Quiz)
    fun get(id: Long): Quiz
    fun delete(id: Long)
    fun getAll(): List<Quiz>
}