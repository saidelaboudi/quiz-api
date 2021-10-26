package com.quiz.service.impl

import com.quiz.model.Quiz
import com.quiz.repository.QuizRepository
import com.quiz.service.QuizService
import org.springframework.stereotype.Service

@Service
class QuizServiceRepository(
    private val quizRepository: QuizRepository
):QuizService {
    override fun save(quiz: Quiz) {
        quizRepository.save(quiz)
    }

    override fun get(id: Long): Quiz {
        return quizRepository.findById(id).get()
    }

    override fun delete(id: Long) {
        quizRepository.deleteById(id)
    }

    override fun getAll(): List<Quiz> {
        return quizRepository.findAll()
    }
}