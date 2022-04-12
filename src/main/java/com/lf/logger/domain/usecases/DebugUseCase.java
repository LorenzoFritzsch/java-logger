package com.lf.logger.domain.usecases;

import com.lf.logger.data.repositories.LoggerRepositoryImpl;
import com.lf.logger.domain.repositories.LoggerRepository;
import com.lf.logger.domain.usecases.params.LogParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DebugUseCase implements UseCase<LogParams> {

    final LoggerRepository repository;

    @Autowired
    public DebugUseCase(LoggerRepositoryImpl repository){
        this.repository = repository;
    }

    @Override
    public void call(LogParams logParams) {
        repository.d(logParams.getUTCDate(), logParams.getTag(), logParams.getMethod(), logParams.getMessage());
    }
}
