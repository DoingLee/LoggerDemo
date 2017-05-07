import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by Doing on 2017/5/6 0006.
 */
public class LogUtil {

    public static Log console = LogFactory.getLog(LogUtil.class);
    public static Log err = LogFactory.getLog("err");
    public static Log bus = LogFactory.getLog("bus");

    public static void debug(Object object) {
        err.debug(object);
//        console.debug(object);
    }

    public static void info(Object object) {
        err.info(object);
//        console.info(object);
    }

    public static void warn(Object object) {
        err.warn(object);
//        console.warn(object);
    }

    public static void error(Object object) {
        err.error(object);
//        console.error(object);
    }

    public static void fatal(Object object) {
        err.fatal(object);
//        console.fatal(object);
    }
}
