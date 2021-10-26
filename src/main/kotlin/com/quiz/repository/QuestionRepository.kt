package com.quiz.repository

import com.quiz.model.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository:JpaRepository<Question,Long> {
}