/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author benjaminbajrami
 */
public class User {
    
    private String email;
    private String rolegroup;
    private String password;
    private String username;

    public User() {
        
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", rolegroup=" + rolegroup + ", password=" + password + ", username=" + username + '}';
    }

    public User(String email, String rolegroup, String password, String username) {
        this.email = email;
        this.rolegroup = rolegroup;
        this.password = password;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRolegroup() {
        return rolegroup;
    }

    public void setRolegroup(String rolegroup) {
        this.rolegroup = rolegroup;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
