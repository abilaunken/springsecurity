/*
package com.example.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
// before the default configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER - 11)
public class CustomH2ConsoleSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Autowired
    private H2ConsoleProperties console;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        String path = this.console.getPath();
        String antPattern = (path.endsWith("/") ? path + "**" : path + "/**");
        HttpSecurity h2Console = http.antMatcher(antPattern);
        h2Console.csrf().disable();
        h2Console.httpBasic();
        h2Console.headers().frameOptions().sameOrigin();
        // config as you like
        http.authorizeRequests().anyRequest().permitAll();
    }

}
*/
