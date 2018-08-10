package com.training.hello.controller;

import com.training.hello.model.Entity;
import com.training.hello.model.ProcessResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/hello")
@Slf4j
public class HelloController {

    @GetMapping
    public String get() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/{arg}")
    ResponseEntity<ProcessResult> post(@PathVariable String arg, @RequestBody Entity entity) {
        log.info("POST request => entity: {}", entity);
        log.info("POST request => path variable: {}", arg);
        return ResponseEntity.ok(ProcessResult.done());
    }

}
