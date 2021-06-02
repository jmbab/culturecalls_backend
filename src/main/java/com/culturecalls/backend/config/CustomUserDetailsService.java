//package com.culturecalls.backend.config;
//
//import com.culturecalls.backend.models.DAOUser;
//import com.culturecalls.backend.models.UserDTO;
//import com.culturecalls.backend.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//
//    @Autowired
//    private UserRepository userDao;
//
//    @Autowired
//    private PasswordEncoder bcryptEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        List<SimpleGrantedAuthority> roles = null;
//
//
//        DAOUser user = userDao.findByUsername(username);
//        if (user != null) {
//            roles = Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
//            return new User(user.getUsername(), user.getPassword(), roles);
//        }
//        throw new UsernameNotFoundException("User not found with the name " + username);	}
//
//    public DAOUser save(UserDTO user) {
//        DAOUser newUser = new DAOUser();
//        newUser.setUsername(user.getUsername());
//        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//        newUser.setRole(user.getRole());
//        return userDao.save(newUser);
//    }
//
//}
