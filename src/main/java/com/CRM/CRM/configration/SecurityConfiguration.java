package com.CRM.CRM.configration;


import com.CRM.CRM.security.UserDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {



  //  @Autowired
    private UserDetailsServiceImp userDetailsService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests()
                 .antMatchers("/").permitAll()
                 .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                 .and()
                 .formLogin().loginPage("/login").failureUrl("/login").permitAll()
                 .and()
                 .logout().permitAll()
                 .and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
     //   auth.authenticationProvider(authenticationProviderUser());
    }

    @Bean
    public DaoAuthenticationProvider authenticationProviderUser() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
