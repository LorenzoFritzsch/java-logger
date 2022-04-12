import com.lf.logger.presentation.Log;
import org.junit.jupiter.api.Test;

public class LogTester {

    @Test
    public void testErrorLogger(){
        Log.e("TAG", "METHOD", "MESSAGE");
    }

    @Test
    public void testInfoLogger(){
        Log.i("TAG", "METHOD", "MESSAGE");
    }

    @Test
    public void testWarningLogger(){
        Log.w("TAG", "METHOD", "MESSAGE");
    }

    @Test
    public void testDebugLogger(){
        Log.d("TAG", "METHOD", "MESSAGE");
    }

}
