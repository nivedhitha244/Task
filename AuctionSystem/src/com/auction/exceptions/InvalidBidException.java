package com.auction.exceptions;

public class InvalidBidException extends Exception {
    public InvalidBidException(String msg) {
        super(msg);
    }
}