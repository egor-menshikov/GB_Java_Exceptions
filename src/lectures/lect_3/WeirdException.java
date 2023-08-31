package lectures.lect_3;

import java.io.IOException;

public class WeirdException extends IOException {
    public WeirdException(String msg, Exception e) {
        super(msg, e);
    }

    public WeirdException() {
        super();
    }
}
