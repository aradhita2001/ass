package com.example.post_status_checking.exception;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String exceptionMessage;
    private String requestDescription;
    public ExceptionResponse() {
    }
    public ExceptionResponse(Date date, String exceptionMessage, String requestDescription) {
        this.date = date;
        this.exceptionMessage = exceptionMessage;
        this.requestDescription = requestDescription;
    }
    public Date getDate() {
        return date;
    }
    public String getExceptionMessage() {
        return exceptionMessage;
    }
    public String getRequestDescription() {
        return requestDescription;
    }

    
}
