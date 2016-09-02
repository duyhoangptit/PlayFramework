package vn.vnext.fridaynight.models;

import play.api.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "user", schema = "safuri_schema", catalog = "")
public class UserEntity{
    private int userId;
    private String username;
    private String password;
    private byte enable;
    private int role;


    public UserEntity() {
    }

    public UserEntity(int userId, String username, String password, byte enable, int role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.enable = enable;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "enable")
    public byte getEnable() {
        return enable;
    }

    public void setEnable(byte enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "role")
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (enable != that.enable) return false;
        if (role != that.role) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) enable;
        result = 31 * result + role;
        return result;
    }


}
