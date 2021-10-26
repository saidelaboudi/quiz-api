package com.quiz.controller

import com.quiz.model.Question
import com.quiz.service.QuestionService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/v1/questions")
class QuestionController(
    private val questionService: QuestionService
) {
    @PostMapping("/")
    fun save(@RequestBody question: Question){
        questionService.save(question)
    }
    @GetMapping("/{id}")
    fun  getQuestion(@PathVariable id:Long):Question{
        return questionService.get(id)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long){
        questionService.delete(id)
    }
    @GetMapping("/")
    fun getAll():List<Question>{
        return questionService.getAll()
    }
}