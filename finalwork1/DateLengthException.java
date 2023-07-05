package errors.finalwork1;

import java.lang.reflect.Constructor;

public class DateLengthException extends Exception {
    public DateLengthException() {
        super("Дата должна быть xx.xx.xxxx");
    }

}
