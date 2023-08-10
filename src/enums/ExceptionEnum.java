package enums;
import java.time.LocalDate;

public enum ExceptionEnum {
    EMPTY_LIST_EXCEPTION("Empty exception!", LocalDate.now()),
    INVALID_OPTION_EXCEPTION("Invalid Option!",LocalDate.now() );

    String message;
    LocalDate localDate;

    ExceptionEnum(String message, LocalDate localDate) {
        this.message = message;
        this.localDate = localDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
