import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * Created by Doing on 2017/5/6 0006.
 */
public class LoggerTest {

    @Test
    public void test() {
        LogUtil.debug("debug");
        LogUtil.info("info");
        LogUtil.warn("warn");
        LogUtil.error("error");
        LogUtil.fatal("fatal");
    }
}
