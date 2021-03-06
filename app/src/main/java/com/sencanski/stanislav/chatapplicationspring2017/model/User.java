package com.sencanski.stanislav.chatapplicationspring2017.model;

import java.io.Serializable;

/**
 * Created by Sasa on 5/20/2017.
 */

public class User extends BaseModel implements Serializable{

    private String username;

    private String photoUrl;

    public User() {
    }

    public User(String id, String username, String photoUrl) {
        super(id);
        this.username = username;
        this.photoUrl = photoUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", photoUrl='").append(photoUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;

       return getId().equals(user.getId());

    }

}
