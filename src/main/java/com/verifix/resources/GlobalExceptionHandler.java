package com.verifix.resources;

import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;

import com.verifix.exceptions.EmptyRecordSetException;
import com.verifix.models.DefaultResponse;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    Map<String,DefaultResponse> handleException(EmptyRecordSetException ex) {
        Map<String,DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
        DefaultResponse defaultResponse = new DefaultResponse("1002", "no data for request", HttpStatus.OK.name(), ex.getMessage());
        responseMap.put("payload", defaultResponse.defaultResourceBuilder("no data"));
        return responseMap;
    }
    
    
    
    @ExceptionHandler
    @ResponseBody
    Map<String,DefaultResponse> handleException(IllegalArgumentException ex) {
        Map<String,DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
        DefaultResponse defaultResponse = new DefaultResponse("1003", "issue with returned arguments", HttpStatus.INTERNAL_SERVER_ERROR.name(), ex.getMessage());
        responseMap.put("payload", defaultResponse.defaultResourceBuilder("error"));
        return responseMap;
    }
    
    
    
    
    @ExceptionHandler
    @ResponseBody
    Map<String,DefaultResponse> handleException(MissingPathVariableException ex) {
        Map<String,DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
        DefaultResponse defaultResponse = new DefaultResponse("1004", "issue with input arguments (missing)", HttpStatus.BAD_REQUEST.name(), ex.getMessage());
        responseMap.put("payload", defaultResponse.defaultResourceBuilder("error"));
        return responseMap;
    }
    
   
    
    
    @ExceptionHandler
    @ResponseBody
    Map<String,DefaultResponse> handleException( HttpMessageNotReadableException ex) {
        Map<String,DefaultResponse> responseMap = new HashMap<String, DefaultResponse>();
        DefaultResponse defaultResponse = new DefaultResponse("1005", "Error parsing request parameters expected as valid JSON", HttpStatus.BAD_REQUEST.name(), ex.getMessage());
        responseMap.put("payload", defaultResponse.defaultResourceBuilder("error"));
        return responseMap;
    }
    

}
