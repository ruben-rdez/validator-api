package com.validator.api.model;

public class Response {
    private boolean success;
    private String message;
    private Object data;

    public Response() {
    }

    public Response(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() { 
        return message; 
    }
    
    public Object getData() { 
        return data; 
    }
}
