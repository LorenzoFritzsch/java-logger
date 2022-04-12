package com.lf.logger.presentation;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Instant;

public class Log{

    static ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
    static LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);

    public static void e(String tag, String context, String message) {
        String UTCTime = Instant.now().toString();
        loggerRepository.e(UTCTime, tag, context, message);
    }

    public static void i(String tag, String context, String message) {
        String UTCTime = Instant.now().toString();
        loggerRepository.i(UTCTime, tag, context, message);
    }

    public static void w(String tag, String context, String message) {
        String UTCTime = Instant.now().toString();
        loggerRepository.w(UTCTime, tag, context, message);
    }

    public static void d(String tag, String context, String message) {
        String UTCTime = Instant.now().toString();
        loggerRepository.d(UTCTime, tag, context, message);
    }
}
