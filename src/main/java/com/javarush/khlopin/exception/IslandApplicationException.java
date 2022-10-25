package com.javarush.khlopin.exception;

public class IslandApplicationException extends RuntimeException {
    public IslandApplicationException(ReflectiveOperationException e) {

    }

    public IslandApplicationException(String name_of_unit_is_uncorrect) {
    }
}
