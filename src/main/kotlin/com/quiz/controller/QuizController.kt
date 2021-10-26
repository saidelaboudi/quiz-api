package com.quiz.controller

import com.quiz.model.Quiz
import com.quiz.service.QuizService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/v1/quizzes")
class QuizController (
    private val quizService: QuizService
        ){
    @PostMapping("/")
    fun add(@RequestBody quiz:Quiz){
        quizService.save(quiz)
    }
    @GetMapping("/{id}")
    fun get(@PathVariable id:Long):Quiz{
        return quizService.get(id)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long){
        quizService.delete(id)
    }
    @GetMapping("/")
    fun getAll():List<Quiz>{
        return quizService.getAll()
    }
}