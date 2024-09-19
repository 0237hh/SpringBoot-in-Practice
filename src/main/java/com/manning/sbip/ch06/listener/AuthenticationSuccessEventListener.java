package com.manning.sbip.ch06.listener;

import com.manning.sbip.ch06.model.ApplicationUser;
import com.manning.sbip.ch06.service.LoginAttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;

public class AuthenticationSuccessEventListener implements
        ApplicationListener<AuthenticationSuccessEvent> {
    @Autowired
    private LoginAttemptService loginAttemptService;

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent authenticationSuccessEvent) {
        ApplicationUser user = (ApplicationUser)authenticationSuccessEvent.getAuthentication().getPrincipal();
        loginAttemptService.loginSuccess(user.getUsername());
    }
}
