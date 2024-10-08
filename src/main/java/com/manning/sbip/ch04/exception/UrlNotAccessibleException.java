package com.manning.sbip.ch04.exception;

import lombok.Getter;

@Getter
public class UrlNotAccessibleException extends RuntimeException{
    private String url;

    public UrlNotAccessibleException (String url) {
        this (url, null);
    }
    public UrlNotAccessibleException(String url, Throwable cause) {
        super ("Url ---> " + url + "is not accessible", cause);
        this.url = url;
    }
}
