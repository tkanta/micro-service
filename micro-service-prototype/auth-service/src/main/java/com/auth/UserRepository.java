package com.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserRepository {

    public static Map<String, User> fakeUserRepository = new HashMap<String, User>();

    public User findByLogin(String userid) {
        return fakeUserRepository.get(userid);
    }




}