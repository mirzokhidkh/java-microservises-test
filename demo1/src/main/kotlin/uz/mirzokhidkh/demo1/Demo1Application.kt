package uz.mirzokhidkh.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@EnableEurekaClient
@SpringBootApplication
class Demo1Application {
    @Bean
    fun restTemplate() = RestTemplate()
}

fun main(args: Array<String>) {
    runApplication<Demo1Application>(*args)
}

@RestController
class TestController(private val restTemplate: RestTemplate) {

    @GetMapping
    fun hello(): String {
        val responseFromDemo2 = restTemplate.getForObject("http://localhost:8082", String::class.java)
        return "Hello from Demo1 and " + responseFromDemo2
    }

}
