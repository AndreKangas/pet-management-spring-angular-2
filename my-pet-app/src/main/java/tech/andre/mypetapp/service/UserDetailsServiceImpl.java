package tech.andre.mypetapp.service;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import tech.andre.mypetapp.entity.User;
//import tech.andre.mypetapp.repository.UserRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private final UserRepository userRepository;
//
//    public UserDetailsServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
//
//        return org.springframework.security.core.userdetails.User
//                .withUsername(username)
//                .password(user.getPassword())
//                .authorities("ROLE_USER")
//                .accountExpired(false)
//                .accountLocked(false)
//                .credentialsExpired(false)
//                .disabled(false)
//                .build();
//    }
//}
