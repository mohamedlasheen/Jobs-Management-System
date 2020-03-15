/**
 *
 * @author mohamed lasheen
 */
package com.optile.jobs.management.dao;

import com.optile.jobs.management.dto.User;
import java.util.ArrayList;

public class UserDao implements UserDaoInterface{

    @Override
    public boolean login(User user) {
        if(user.getUserName().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> ListUsers() {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setUserName("User1");
        
        User user2 = new User();
        user2.setId(2);
        user2.setUserName("User2");
        
        User user3 = new User();
        user3.setId(3);
        user3.setUserName("User3");
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        return users;
    }

    @Override
    public ArrayList<User> ListUsers(User filter) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setUserName("User1");
        users.add(user1);
        return users;
    }

    @Override
    public void deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int createUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User editUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
