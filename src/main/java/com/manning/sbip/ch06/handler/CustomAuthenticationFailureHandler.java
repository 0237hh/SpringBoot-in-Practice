package com.manning.sbip.ch06.handler;

import org.springframework.security.authentication.LockedException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    private DefaultRedirectStrategy defaultRedirectStrategy = new DefaultRedirectStrategy();

    public void onAuthenticationFailure
            (HttpServletRequest request,
             HttpServletResponse response,
             AuthenticationException exception) throws IOException, ServletException {
        if (exception.getCause() instanceof LockedException) {
            defaultRedirectStrategy.sendRedirect(request, response, "/login?error");
            return;
        }
        defaultRedirectStrategy.sendRedirect(request, response, "/login?error");
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, org.springframework.security.core.AuthenticationException exception) throws IOException, ServletException {

    }
}
