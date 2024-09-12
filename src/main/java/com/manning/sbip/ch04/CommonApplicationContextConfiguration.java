package com.manning.sbip.ch04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonApplicationContextConfiguration {
    // 여러 팀에서 공통으로 사용되는 RelationalDataSourceConfiguration 스프링 빈 생성
    @Bean
    public RelationalDataSourceConfiguration dataSourceConfiguration () {
        return new RelationalDataSourceConfiguration();
    }
}
