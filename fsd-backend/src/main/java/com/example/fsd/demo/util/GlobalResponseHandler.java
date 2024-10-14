package com.example.fsd.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalResponseHandler {


    public static ResponseEntity createGenericResponse(Object payload, Object error, HttpStatus status){
        return new ResponseEntity(payload,status);

    }


}
