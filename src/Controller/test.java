package Controller;

import pojo.User;
import service.UserService;
import service.serviceImpl.UserServiceImpl;

public class test {
    public static void main(String[] args) {
        UserService user=new UserServiceImpl();
        User user1 = user.findUser(1, "2", "33");
        System.out.println("user:"+user1);
    }
}
