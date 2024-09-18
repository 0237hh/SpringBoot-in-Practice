package com.manning.sbip.ch05.autoconfigure.security.servlet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration (proxyBeanMethods = false)
@ConditionalOnMissingBean(WebSecurityConfigurerAdapter.class)
@ConditionalOnClass(EnableWebSecurity.class)
@ConditionalOnWebApplication (type = ConditionalOnWebApplication.Type.SERVLET)
@EnableWebSecurity
public class WebSecurityEnableConfiguration {
}
