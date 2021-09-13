package br.com.exception;

public class BussinessException extends Exception{

    private String message;

    public BussinessException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
