package tech.andre.mypetapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;

//import tech.andre.mypetapp.filter.JwtAuthenticationFilter;
//import tech.andre.mypetapp.service.UserDetailsServiceImpl;
import tech.andre.mypetapp.utility.JwtUtil;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
    
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Bean
//    public JwtAuthenticationFilter jwtAuthenticationFilter() throws Exception {
//        return new JwtAuthenticationFilter(jwtUtil, authenticationManager);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, UserDetailsServiceImpl userDetailsService) throws Exception {
//        http
//            .csrf().disable()
//            .authorizeHttpRequests((requests) -> requests
//                .requestMatchers("/api/**").authenticated()
//                .anyRequest().permitAll()
//            )
////            .addFilter(jwtAuthenticationFilter())
//            .httpBasic();
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsServiceImpl userDetailsService) 
//      throws Exception {
//        return http.getSharedObject(AuthenticationManagerBuilder.class)
//          .userDetailsService(userDetailsService)
//          .passwordEncoder(bCryptPasswordEncoder)
//          .and()
//          .build();
//    }
}


//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, UserDetailsService userDetailsService) throws Exception {
//        http
//            .csrf().disable()
//            .authorizeRequests(authorizeRequests -> 
//                authorizeRequests
//                    .antMatchers("/api/**").authenticated()
//                    .anyRequest().permitAll()
//            )
//            .httpBasic(Customizer.withDefaults())
//            .userDetailsService(userDetailsService)
//            .authenticationProviderBean()
//            .authenticationManagerBean();
//
//        return http.build();
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//}





//		<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-security</artifactId>
//</dependency>
//<dependency>
//<groupId>org.springframework.security</groupId>
//<artifactId>spring-security-config</artifactId>
//</dependency>
