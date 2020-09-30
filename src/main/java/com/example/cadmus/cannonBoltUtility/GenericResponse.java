package com.example.cadmus.cannonBoltUtility;

import com.fasterxml.jackson.core.JsonProcessingException;

public class GenericResponse {

    private Object response;

    private String message;

    private String code;

    public GenericResponse(Object response, String message, String code) throws JsonProcessingException {
        this.response = response;
        this.message = message;
        this.code = code;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
