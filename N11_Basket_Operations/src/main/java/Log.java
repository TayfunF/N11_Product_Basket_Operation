//------------------------------------log4j------------------------------------
//------------------------------------3.Adım------------------------------------
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {

    static Logger Logger = org.apache.log4j.Logger.getLogger(Log.class);

    public Log() {
        DOMConfigurator.configure("log4j.xml");
    }

    public void Info(String Message) {
        Logger.info(Message);
    }

    public void Warn(String Message) {
        Logger.warn(Message);
    }

    public void Error(String Message) {
        Logger.error(Message);
    }

}
