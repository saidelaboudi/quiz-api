package com.quiz.repository

import com.quiz.model.Quiz
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuizRepository : JpaRepository<Quiz,Long> {
}