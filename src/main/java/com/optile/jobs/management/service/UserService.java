/**
 *
 * @author mohamed lasheen
 */
package com.optile.jobs.management.service;

import com.optile.jobs.management.dao.UserDao;
import com.optile.jobs.management.dao.UserDaoInterface;
import com.optile.jobs.management.dto.User;
import com.optile.jobs.management.exceptions.UserLockedException;
import java.util.ArrayList;

public class UserService {

    private UserDaoInterface userDao = new UserDao();

    private int failedCounter = 0;

    public boolean login(User user) throws UserLockedException{
        if (failedCounter < 3) {
            boolean result = this.userDao.login(user);
            if (result == true) {
                this.failedCounter = 0;
                return true;
            } else {
                failedCounter++;
                return false;
            }
        } else {
            throw new UserLockedException();
        }
    }
    
    public ArrayList<User> listUsers() {
        return this.userDao.ListUsers();
    }
}
