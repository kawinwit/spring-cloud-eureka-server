package com.smile.service.controller;


import com.smile.service.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApiController {

    @GetMapping("/calculate")
    public Response test() {
        Response x = new Response();
        x.setTest("call calculate");
        System.out.println("api was call");
        return x;
    }

}

