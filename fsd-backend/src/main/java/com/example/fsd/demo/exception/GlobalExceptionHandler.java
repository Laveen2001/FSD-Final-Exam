package com.example.fsd.demo.exception;


import com.example.fsd.demo.util.GlobalResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity handleException(Exception e){
        return GlobalResponseHandler.createGenericResponse(null,e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
