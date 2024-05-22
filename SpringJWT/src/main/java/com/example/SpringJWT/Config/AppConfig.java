package com.example.SpringJWT.Config;

//import com.example.SpringJWT.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration

public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withUsername("Viraj")
                .password(passwordEncodera().encode("123")).roles("ADMIN").build();

        UserDetails user1 = User.withUsername("Sunny").
                password(passwordEncodera().encode("123")).roles("USER").build();
        System.out.println("working");

       return new InMemoryUserDetailsManager(user,user1);
    }

    @Bean
    public PasswordEncoder passwordEncodera(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }

}
