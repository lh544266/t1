package service.serviceImpl;

import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User findUser(int id, String name, String password) {
        User user=new User();
        user.setId(1);
        user.setName("lh");
        user.setPassword("123");
        return user;

    }
}
