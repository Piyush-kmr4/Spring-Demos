package spring.security.secureapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Inside MyUserDetailsService class....");
        Users user = repo.findByUsername(username);
        System.out.println(user.getPassword()+"-------"+user.getUsername());
        if(user==null)
            throw new UsernameNotFoundException("User Not Found");

        return new UserPrinciple(user);
    }
}
