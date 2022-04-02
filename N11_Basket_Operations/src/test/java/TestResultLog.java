//------------------------------------log4j------------------------------------
//------------------------------------4.Adım------------------------------------

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLog implements TestWatcher {

    Log Log = new Log();

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {

        String TestName = context.getDisplayName();
        Log.Info(TestName + "PASSED");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String TestName = context.getDisplayName();
        String TestFailCause = cause.getMessage();
        Log.Error(TestName + "FAILED with cause : " + TestFailCause);

    }
}
