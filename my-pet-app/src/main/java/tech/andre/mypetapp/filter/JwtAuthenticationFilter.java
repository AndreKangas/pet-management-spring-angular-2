package tech.andre.mypetapp.filter;

//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import tech.andre.mypetapp.utility.JwtUtil;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.IOException;
//
//public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
//    private final JwtUtil jwtUtil;
//    private final AuthenticationManager authenticationManager;
//
//    public JwtAuthenticationFilter(JwtUtil jwtUtil, AuthenticationManager authenticationManager) {
//        this.jwtUtil = jwtUtil;
//        this.authenticationManager = authenticationManager;
//        setAuthenticationManager(authenticationManager);
//        setFilterProcessesUrl("/api/authenticate");
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
//        return authenticationManager.authenticate(authenticationToken);
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
//        UserDetails userDetails = (UserDetails) authResult.getPrincipal();
//        String token = jwtUtil.generateToken(userDetails);
//        response.addHeader("Authorization", "Bearer " + token);
//    }
//
//}


