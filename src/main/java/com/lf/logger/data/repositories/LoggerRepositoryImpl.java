package com.lf.logger.data.repositories;

import com.lf.logger.data.datasource.LoggerDataSource;
import com.lf.logger.data.datasource.LoggerDataSourceImpl;
import com.lf.logger.domain.repositories.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoggerRepositoryImpl implements LoggerRepository {

    LoggerDataSource loggerDataSource;

    @Autowired
    public LoggerRepositoryImpl(LoggerDataSourceImpl loggerDataSource){
        this.loggerDataSource = loggerDataSource;
    }

    @Override
    public void e(String UTCTime, String machineName, String tag, String context, String message) {
        loggerDataSource.filePrint(UTCTime, machineName, tag, context, message);
    }

    @Override
    public void i(String UTCTime, String machineName, String tag, String context, String message) {
        loggerDataSource.filePrint(UTCTime, machineName, tag, context, message);
    }

    @Override
    public void w(String UTCTime, String machineName, String tag, String context, String message) {
        loggerDataSource.filePrint(UTCTime, machineName, tag, context, message);
    }

    @Override
    public void d(String UTCTime, String machineName, String tag, String context, String message) {
        loggerDataSource.stdPrint(UTCTime, machineName, tag, context, message);
    }
}
