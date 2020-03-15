/**
 *
 * @author mohamed lasheen
 */
package com.optile.jobs.management.dao;

import com.optile.jobs.management.dto.User;
import java.util.ArrayList;

public interface UserDaoInterface {
    public abstract boolean login(User user);
    public abstract ArrayList<User> ListUsers();
    public abstract ArrayList<User> ListUsers(User filter);
    public abstract void deleteUser(int id);
    public abstract int createUser(User user);
    public abstract User editUser(User user);
}
