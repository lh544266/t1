package service;

import pojo.User;

public interface UserService {
    User findUser(int id, String name, String password);
}
