package ru.dinis.cadry.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import ru.dinis.cadry.beans.SearchBean;
import ru.dinis.cadry.dao.interfaces.UserDao;
import ru.dinis.cadry.entities.User;

import java.io.Serializable;
import java.util.Set;

/**
 * Create by dinis of 12.02.18.
 */
@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService implements Serializable {

    @Autowired
    private UserDao userDao;

    @Autowired
    private SearchBean searchBean;

    private String subdiv;

    private Set<User> users;

    private User showUser;

    public User getShowUser() {
        return showUser;
    }

    public void setShowUser(User showUser) {
        this.showUser = showUser;
    }


    public Set<User> getUsers() {
        if (this.users == null) {
            this.users = this.userDao.getUsers();
        }
        return users;
    }

    public Set<User> getAllUsers() {
        return this.users = this.userDao.getUsers();
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<User> getUserByPosition() {
        return this.users = this.userDao.getUser(this.subdiv);
    }

    public Set<User> getUsersByName() {
        return this.users = this.userDao.getUserByName(this.searchBean.getFirstName(), this.searchBean.getLastName(),
                this.searchBean.getPatronymic());
    }

    public String getSubdiv() {
        return subdiv;
    }

    public void setSubdiv(String subdiv) {
        this.subdiv = subdiv;
    }

    public SearchBean getSearchBean() {
        return searchBean;
    }

    public void setSearchBean(SearchBean searchBean) {
        this.searchBean = searchBean;
    }
}
