package com.example.bankapp.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Entity
public class Account implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private BigDecimal balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    public Account() {
    }

    public Account(String username, String password, BigDecimal balance, List<Transaction> transactions, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.transactions = transactions;
        this.authorities = authorities;
    }

    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    // --- UserDetails Interface Methods ---

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Change as needed
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Change as needed
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Change as needed
    }

    @Override
    public boolean isEnabled() {
        return true; // Change as needed
    }
}
