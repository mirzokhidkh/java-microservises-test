package uz.mirzokhidkh.demo1

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping


@FeignClient(name = "demo2")
interface Demo2Service {

    @GetMapping("/api/book")
    fun hello(): String

//    @PostMapping("api/demo2/message/{id}")
    @PostMapping("/api/book/message/{id}")
    fun message(@PathVariable id: Long): MessageDemo2Dto
}