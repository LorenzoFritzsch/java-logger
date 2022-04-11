package com.lf.logger.presentation;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Log{

    static ApplicationContext context = new AnnotationConfigApplicationContext(Log.class);
    static LoggerRepositoryImpl loggerRepository = context.getBean(LoggerRepositoryImpl.class);

    public static void e(String UTCTime, String tag, String context, String message) {
        loggerRepository.e(UTCTime, tag, context, message);
    }

    public static void i(String UTCTime, String tag, String context, String message) {
        loggerRepository.i(UTCTime, tag, context, message);
    }

    public static void w(String UTCTime, String tag, String context, String message) {
        loggerRepository.w(UTCTime, tag, context, message);
    }

    public static void d(String UTCTime, String tag, String context, String message) {
        loggerRepository.d(UTCTime, tag, context, message);
    }
}
