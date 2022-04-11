package com.lf.logger.data.datasource;

import org.springframework.stereotype.Component;

@Component
public class LoggerDataSourceImpl implements LoggerDataSource{

    private LoggerDataSourceImpl(){}

    @Override
    public void stdPrint(String UTCTime, String tag, String context, String message) {
        System.out.println(UTCTime + " " + tag + " " + context + " " + message);
    }

    @Override
    public void filePrint(String UTCTime, String tag, String context, String message) {
        stdPrint(UTCTime, tag, context, message);
        //TODO: Write in the file
    }
}
