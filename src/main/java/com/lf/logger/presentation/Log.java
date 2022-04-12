package com.lf.logger.presentation;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Instant;

public class Log{

    public static void e(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
        LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);
        loggerRepository.e(UTCTime, tag, method, message);
    }

    public static void i(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
        LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);
        loggerRepository.i(UTCTime, tag, method, message);
    }

    public static void w(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
        LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);
        loggerRepository.w(UTCTime, tag, method, message);
    }

    public static void d(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
        LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);
        loggerRepository.d(UTCTime, tag, method, message);
    }
}
