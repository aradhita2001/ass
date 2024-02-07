package com.example.onlineshoppingplatform.exception;

public class NotEnoughProductInStockException extends Exception{

    public NotEnoughProductInStockException() {
    }

    public NotEnoughProductInStockException(String arg0) {
        super(arg0);
    }

    public NotEnoughProductInStockException(Throwable arg0) {
        super(arg0);
    }

    public NotEnoughProductInStockException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public NotEnoughProductInStockException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
    
}
