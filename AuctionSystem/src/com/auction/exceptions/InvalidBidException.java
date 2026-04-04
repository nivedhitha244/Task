package com.auction.exceptions;

public class InvalidBidException extends Exception {
    public InvalidBidException(String message) {
        super(message);
    }
}