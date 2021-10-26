package com.quiz.service.impl

import com.quiz.model.Response
import com.quiz.repository.ResponseRepository
import com.quiz.service.ResponseService
import org.springframework.stereotype.Service

@Service
class ResponseServiceImpl(
    private val responseRepository: ResponseRepository
):ResponseService {
    override fun add(response: Response) {
        responseRepository.save(response)
    }

    override fun getAll(): List<Response> {
        return responseRepository.findAll()
    }

    override fun get(id: Long): Response {
        return responseRepository.findById(id).get()
    }

    override fun delete(id: Long) {
        responseRepository.deleteById(id)
    }
}