package spring.security.secureapp;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserPrinciple implements UserDetails {

    private Users user;
    public UserPrinciple(Users user) {
        System.out.println("Inside UserPrinciple class...");
        this.user = user;
        System.out.println(this.getUsername());
        System.out.println(this.getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("Inside the getAuthorities method");
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        System.out.println("In user principle....password--->"+user.getPassword().toString());
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        System.out.println("In user principle....username--->"+user.getUsername().toString());
        return user.getUsername();
    }


    @Override
    public boolean isAccountNonExpired() {
        System.out.println("1");
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        System.out.println("2");
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        System.out.println("3");
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
