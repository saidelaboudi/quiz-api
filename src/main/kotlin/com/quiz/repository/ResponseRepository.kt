package com.quiz.repository

import com.quiz.model.Response
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResponseRepository:JpaRepository<Response,Long> {
}