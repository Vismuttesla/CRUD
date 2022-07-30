package com.example.crud;

public class UserNotFoundException extends Throwable
{
    public UserNotFoundException(String message) {
        super(message);
    }
}
