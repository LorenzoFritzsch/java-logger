package com.lf.logger.domain.usecases;

public interface UseCase<Params> {
    void call(Params params);
}