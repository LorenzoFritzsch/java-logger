package com.lf.logger.data.datasource;

/**
 *
 * Logger Data Source interface, to define every action possible
 *
 */

public interface LoggerDataSource {

    /**
     * Prints to the standard output
     * @param UTCTime
     * @param machineName
     * @param tag
     * @param context
     * @param message
     */
    void stdPrint(String UTCTime, String machineName, String tag, String context, String message);


    /**
     * Prints to the log file and the standard output
     * @param UTCTime
     * @param machineName
     * @param tag
     * @param context
     * @param message
     */
    void filePrint(String UTCTime, String machineName, String tag, String context, String message);

}
