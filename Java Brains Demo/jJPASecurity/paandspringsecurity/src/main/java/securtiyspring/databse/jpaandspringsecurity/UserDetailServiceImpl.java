package securtiyspring.databse.jpaandspringsecurity;

import models.MyUserDetails;
import models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("Inside UserDetailsServiceImpl class...");
       Users user = userRepository.findByUserName(userName);
        System.out.println(user.getUserName()+"************"+user.getPassword());
       if(user == null)
           return (UserDetails) new UsernameNotFoundException("Not Found" + userName);
       return new MyUserDetails(user);
    }
}
