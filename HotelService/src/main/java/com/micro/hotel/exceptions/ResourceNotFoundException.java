package com.micro.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource Not Found!");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
