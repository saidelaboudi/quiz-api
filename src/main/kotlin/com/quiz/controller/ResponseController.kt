package com.quiz.controller

import com.quiz.model.Response
import com.quiz.service.ResponseService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/api/v1/responses")
class ResponseController(
    private val responseService: ResponseService
) {
    @PostMapping("/")
    fun add(@RequestBody response:Response){
        responseService.add(response)
    }
    @GetMapping("/")
    fun getAll():List<Response>{
        return responseService.getAll()
    }
    @GetMapping("/{id}")
    fun get(@PathVariable id:Long):Response{
        return responseService.get(id)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long){
        responseService.delete(id)
    }
}