package com.devstudios.dbu.devstudios_dbu.domain.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class UserEntity extends EntityBase {

    @Column(unique=true)
    private String email;

    private List<String> robloxAccounts = new ArrayList<>();

    @ManyToMany
    private final List<RoleEntity> roles = new ArrayList<>();
    @OneToMany(cascade=CascadeType.ALL)
    private final List<CodeAuthEntity> authCodes = new ArrayList<>();


    public UserEntity(){}
    public UserEntity(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getRobloxAccounts() {
        return robloxAccounts;
    }
    public void setRobloxAccounts(List<String> robloxAccounts) {
        this.robloxAccounts = robloxAccounts;
    }
    public List<RoleEntity> getRoles() {
        return roles;
    }
    public void setRole(RoleEntity role) {
        this.roles.add(role);
    }
    public List<CodeAuthEntity> getAuthCodes() {
        return authCodes;
    }
    public void setAuthCode(CodeAuthEntity code) {
        this.authCodes.add(code);
    }

}
