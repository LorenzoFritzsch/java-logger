package com.lf.logger.domain.usecases.params;

public class LogParams {
    final String UTCDate;
    final String tag;
    final String method;
    final String message;

    public LogParams(String UTCDate, String tag, String method, String message){
        this.UTCDate = UTCDate;
        this.tag = tag;
        this.method = method;
        this.message = message;
    }

    public String getUTCDate() {
        return UTCDate;
    }

    public String getTag() {
        return tag;
    }

    public String getMethod(){
        return method;
    }

    public String getMessage() {
        return message;
    }
}
