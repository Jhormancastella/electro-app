package com.electroapp.electro_app.infraestructure.utils.exceptions;

public class ObjectNotfoundException extends RuntimeException {
    public ObjectNotfoundException() {
        
    }
    public ObjectNotfoundException(String message) {
        super(message);
    }
    public ObjectNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
