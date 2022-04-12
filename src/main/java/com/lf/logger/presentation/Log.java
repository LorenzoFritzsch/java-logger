package com.lf.logger.presentation;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import com.lf.logger.domain.usecases.DebugUseCase;
import com.lf.logger.domain.usecases.ErrorUseCase;
import com.lf.logger.domain.usecases.InfoUseCase;
import com.lf.logger.domain.usecases.WarningUseCase;
import com.lf.logger.domain.usecases.params.LogParams;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Instant;

public class Log{

    public static void e(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        LogParams logParams = new LogParams(UTCTime, tag, method, message);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        ErrorUseCase errorUseCase = (ErrorUseCase) context.getBean("errorUseCase");
        errorUseCase.call(logParams);
    }

    public static void i(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        LogParams logParams = new LogParams(UTCTime, tag, method, message);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        InfoUseCase infoUseCase = (InfoUseCase) context.getBean("infoUseCase");
        infoUseCase.call(logParams);
    }

    public static void w(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        LogParams logParams = new LogParams(UTCTime, tag, method, message);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        WarningUseCase warningUseCase = (WarningUseCase) context.getBean("warningUseCase");
        warningUseCase.call(logParams);
    }

    public static void d(String tag, String method, String message) {
        String UTCTime = Instant.now().toString();
        LogParams logParams = new LogParams(UTCTime, tag, method, message);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        DebugUseCase debugUseCase = (DebugUseCase) context.getBean("debugUseCase");
        debugUseCase.call(logParams);
    }
}
