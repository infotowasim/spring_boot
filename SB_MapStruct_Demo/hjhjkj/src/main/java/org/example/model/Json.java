package org.example.model;


import java.util.List;

public class Json {
    public Json(List<User> users, List<Role> roles) {
        this.users = users;
        this.roles = roles;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    List<User> users;
    List<Role> roles;



}

