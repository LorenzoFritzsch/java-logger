package com.lf.logger.presentation;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import com.lf.logger.domain.repositories.LoggerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Log implements LoggerRepository {

    ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
    LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);

    @Override
    public void e(String UTCTime, String machineName, String tag, String context, String message) {
        loggerRepository.e(UTCTime, machineName, tag, context, message);
    }
    
    @Override
    public void i(String UTCTime, String machineName, String tag, String context, String message) {
        loggerRepository.i(UTCTime, machineName, tag, context, message);
    }

    @Override
    public void w(String UTCTime, String machineName, String tag, String context, String message) {
        loggerRepository.w(UTCTime, machineName, tag, context, message);
    }

    @Override
    public void d(String UTCTime, String machineName, String tag, String context, String message) {
        loggerRepository.d(UTCTime, machineName, tag, context, message);
    }
}
