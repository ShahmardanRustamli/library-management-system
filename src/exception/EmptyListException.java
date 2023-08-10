package exception;

import enums.ExceptionEnum;

import java.time.LocalDate;

public class EmptyListException extends RuntimeException{
    String message;
    LocalDate localDate;

    public EmptyListException(ExceptionEnum ex) {
        super(ex.getMessage());
        this.message = ex.getMessage();
        this.localDate = ex.getLocalDate();
    }

    @Override
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
