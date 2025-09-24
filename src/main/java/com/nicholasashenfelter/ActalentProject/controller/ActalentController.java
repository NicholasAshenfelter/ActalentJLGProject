package com.nicholasashenfelter.ActalentProject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("actalentController")
@RequiredArgsConstructor
@RequestMapping("/api")
@Slf4j
public class ActalentController {

    @PostMapping("/store")
    @ResponseBody
    public ResponseEntity<String> storeData(@RequestBody){

    }

    @GetMapping("/metrics")
    @ResponseBody
    public ResponseEntity<String> getData(@PathVariable){

    }
}
