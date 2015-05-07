package controller;

import model.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by turgaycan on 5/7/15.
 */
@ManagedBean(name = "indexView")
@RequestScoped
public class IndexView {

    private static final String REDIRECT_URL = "/user.xhtml";
    private User user;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public String passParams() {
        return REDIRECT_URL.concat("?faces-redirect=true")
                .concat("&paramUserName=").concat(user.getUsername())
                .concat("&paramEmail=").concat(user.getEmail());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
