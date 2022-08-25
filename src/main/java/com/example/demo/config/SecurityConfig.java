package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super 삭제 - 기존 시큐리티가 가지고 있는 기능 비활성화
        http.csrf().disable(); //csrf token 삭제 postman에서의 request 이던 홈페이지에서 보낸 request 이던간에 구분 안함
        http.authorizeRequests()
                .antMatchers("/user/**")
                .authenticated()
                .anyRequest()
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/auth/login") //get
                .loginProcessingUrl("/auth/login") //post -> 스프링 시큐리티가 로그인 프로세스를 진행
                .defaultSuccessUrl("/");
    }
}
