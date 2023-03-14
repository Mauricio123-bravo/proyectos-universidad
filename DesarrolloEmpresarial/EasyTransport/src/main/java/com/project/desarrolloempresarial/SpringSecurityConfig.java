package com.project.desarrolloempresarial;

import com.project.desarrolloempresarial.handler.LoginSuccessHandler;
import com.project.desarrolloempresarial.models.services.JpaUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private LoginSuccessHandler successHandler;

    @Autowired
    private JpaUserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/","/css/**","/js/**","/images/**","/scss/**").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/listarConductor").hasRole("ADMIN")
                .antMatchers("/crearConductor").hasRole("ADMIN")
                .antMatchers("/editarConductor").hasRole("ADMIN")
                .antMatchers("/listarEmpresa").hasRole("ADMIN")
                .antMatchers("/crearEmpresa").hasRole("ADMIN")
                .antMatchers("/editarEmpresa").hasRole("ADMIN")
                .antMatchers("/listarProducto").hasAnyRole("USER","ADMIN")
                .antMatchers("/crearProducto").hasAnyRole("USER","ADMIN")
                .antMatchers("/editarProducto").hasAnyRole("USER","ADMIN")
                .antMatchers("/listarRuta").hasAnyRole("USER","ADMIN")
                .antMatchers("/crearRuta").hasAnyRole("USER","ADMIN")
                .antMatchers("/editarRuta").hasAnyRole("USER","ADMIN")
                .antMatchers("/listarVehiculo").hasRole("ADMIN")
                .antMatchers("/crearVehiculo").hasRole("ADMIN")
                .antMatchers("/editarVehiculo").hasRole("ADMIN")
                .antMatchers("/signup").permitAll()
                .antMatchers("/signupdos/{id}").permitAll()
                .antMatchers("/signupdos/{id}/{id}").permitAll()
                .antMatchers("/signupdos").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().successHandler(successHandler)
                .loginPage("/login").permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/error_403");
    }

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception{

        builder.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }
}
