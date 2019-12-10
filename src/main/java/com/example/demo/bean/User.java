package com.example.demo.bean;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author by HZL
 * @date 2019/12/10 10:09
 * @description
 */
@Data
public class User implements UserDetails {
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }
    @Override
    public boolean isAccountNonLocked(){
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
