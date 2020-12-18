package com.smile.service.controller;


import com.smile.service.client.TestClient;
import com.smile.service.response.Response;
import com.smile.service.service.AgentService;
import com.smile.service.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    AgentService agentService;

    @GetMapping("/test")
    public ResponseEntity<?> test() {

        return ResponseUtils.sentResponseOk("test microservice");
    }

    @GetMapping("/cal/calculate")
    public Response callCalculate() {

        return agentService.callApiTest();
    }
}

