package com.manning.sbip.ch05;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public interface FilterChain {
    public void doFilter (ServletRequest request, ServletResponse response)
            throws IOException, ServletException;
}
