package com.smile.service.service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.smile.service.client.TestClient;
import com.smile.service.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RibbonClient("test-service")
public class AgentService {


    @Autowired
    TestClient testClient;

    private Object ResponseEntity;

    private void randomlyRunLong() {
        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;
        if (randomNum == 3) sleep();
    }

    private void sleep() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @HystrixCommand(fallbackMethod = "testMethodFallBack")
    public Response callApiTest() {
        randomlyRunLong();
        Response response = new Response();

        response = testClient.callTestClient();
        System.out.println(response);
        return response;
    }

    public Response testMethodFallBack() {
        String response = "test method fallBack";
        System.out.println(response);
        return new Response();
    }




}
