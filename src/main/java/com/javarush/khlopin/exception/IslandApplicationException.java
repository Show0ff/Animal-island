package com.javarush.khlopin.exception;

public class IslandApplicationException extends RuntimeException {
    public IslandApplicationException(ReflectiveOperationException ignoredE) {

    }

    public IslandApplicationException() {
    }

    public IslandApplicationException(String animal_not_found) {

    }
}
