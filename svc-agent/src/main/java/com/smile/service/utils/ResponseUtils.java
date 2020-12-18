package com.smile.service.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtils {
    public static ResponseEntity sentResponseOk(Object obj){
        Map<String,Object> response = new HashMap<>();
        response.put("result",obj);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    public static ResponseEntity sentResponseNotFound(Object obj){
        Map<String,Object> response = new HashMap<>();
        response.put("result",obj);
        return new ResponseEntity(response, HttpStatus.NOT_FOUND);
    }


    public static ResponseEntity sentResponseBadRequest(Object obj){
        Map<String,Object> response = new HashMap<>();
        response.put("result",obj);
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity sentResponseInternalServerError(Object obj){
        Map<String,Object> response = new HashMap<>();
        response.put("result",obj);
        return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
