package com.lf.logger.domain.repositories;

/**
 *
 * Logger entities interface, to define all the types of supported logs.
 *
 */

public interface LoggerRepository {

    /**
     * Use this when reporting an exception or a critical error.
     *
     * @param UTCTime the UTC time of when the error occurred
     * @param tag the main tag of the context
     * @param context the specific context
     * @param message the message explaining the error
     */
    void e(String UTCTime, String tag, String context, String message); //TODO: Add machine name for fleet management


    /**
     * Use this for information regarding the current status of things
     *
     * @param UTCTime the UTC time
     * @param tag the main tag of the context
     * @param context the specific context
     * @param message the message saying what's going on
     */
    void i(String UTCTime, String tag, String context, String message);


    /**
     * Use this for reporting warnings or errors that are not critical
     *
     * @param UTCTime the UTC time
     * @param tag the main tag of the context
     * @param context the specific context
     * @param message the message reporting the warning
     */
    void w(String UTCTime, String tag, String context, String message);


    /**
     * Use this only for debug purposes
     *
     * @param UTCTime the UTC time
     * @param tag the main tag of the context
     * @param context the specific context
     * @param message the message
     */
    void d(String UTCTime, String tag, String context, String message);

}

