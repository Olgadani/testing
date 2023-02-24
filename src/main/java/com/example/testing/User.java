package com.example.testing;

import java.util.Objects;

public class User {
    private String login;
    private String email;



    public User(String login, String email) {
        this.login = login;
        this.email = email;

    }
    public String getLogin() {
        return login;
    }

    public String getEmail() {
        String s = email;
        if (s.contains("@") && s.contains(".")) {
            return s;
        } else {
            System.out.println("Wrong email");
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
