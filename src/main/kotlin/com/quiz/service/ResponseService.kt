package com.quiz.service

import com.quiz.model.Response

interface ResponseService {
    fun add(response: Response)
    fun getAll(): List<Response>
    fun get(id: Long): Response
    fun delete(id: Long)
}