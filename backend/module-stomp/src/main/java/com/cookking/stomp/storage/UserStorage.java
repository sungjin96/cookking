package com.cookking.stomp.storage;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by marathoner on 2021/09/29
 */
public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage() {
        users = new HashSet<>();
    }

    public static UserStorage getInstance() {
        if(instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public Set<String> getUsers() {
        return users;
    }

    public void setUser(String userName) throws Exception {
        if (users.contains(userName)) {
            throw new Exception("User already exists with userName: " + userName);
        }
        users.add(userName);
    }
}
