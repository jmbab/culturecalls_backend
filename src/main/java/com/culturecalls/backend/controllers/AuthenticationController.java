//package com.culturecalls.backend.controllers;
//
//import com.culturecalls.backend.config.JwtUtil;
//import com.culturecalls.backend.models.AuthenticationRequest;
//import com.culturecalls.backend.models.AuthenticationResponse;
//import com.culturecalls.backend.models.UserDTO;
//import com.culturecalls.backend.config.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//
//@RestController
//public class AuthenticationController {
//
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private CustomUserDetailsService userDetailsService;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
//            throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                    authenticationRequest.getUsername(), authenticationRequest.getPassword()));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        }
//        catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//
//        UserDetails userdetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//        String token = jwtUtil.generateToken(userdetails);
//        return ResponseEntity.ok(new AuthenticationResponse(token));
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
//        return ResponseEntity.ok(userDetailsService.save(user));
//    }
//
//}
