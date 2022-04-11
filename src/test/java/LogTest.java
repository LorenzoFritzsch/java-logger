import com.lf.logger.presentation.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class LogTest {

    Log log;

    @BeforeEach
    void setUp(){
        log = new Log();
    }

    @Test
    @DisplayName("Show logs in the console and save in file") //TODO: Check file
    void showLogs(){
        String currentTime = String.valueOf(Instant.now());
        log.d(currentTime, "MacBook-Pro di Lorenzo", "UnitTest", "Testing show logs", "You should see this in the console");
    }

}
