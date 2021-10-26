package com.quiz.service.impl

import com.quiz.model.Question
import com.quiz.repository.QuestionRepository
import com.quiz.service.QuestionService
import org.springframework.stereotype.Service

@Service
class QuestionServiceImpl(
    private val questionRepository: QuestionRepository,
) : QuestionService {

    override fun save(question: Question) {
        questionRepository.save(question)
    }

    override fun get(id: Long): Question {
        return questionRepository.findById(id).get()
    }

    override fun delete(id: Long) {
        questionRepository.deleteById(id)
    }

    override fun getAll(): List<Question> {
        return questionRepository.findAll()
    }
}