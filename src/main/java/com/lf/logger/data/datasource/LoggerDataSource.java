package com.lf.logger.data.datasource;

import org.springframework.stereotype.Component;

/**
 *
 * Logger Data Source interface, to define every action possible
 *
 */

@Component
public interface LoggerDataSource {

    /**
     * Prints to the standard output
     * @param UTCTime
     * @param tag
     * @param context
     * @param message
     */
    void stdPrint(String UTCTime, String tag, String context, String message);


    /**
     * Prints to the log file and the standard output
     * @param UTCTime
     * @param tag
     * @param context
     * @param message
     */
    void filePrint(String UTCTime, String tag, String context, String message);

}
