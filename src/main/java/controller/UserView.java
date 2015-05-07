package controller;

import model.User;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.logging.Logger;

/**
 * Created by turgaycan on 5/7/15.
 */
@ManagedBean(name = "userView")
@RequestScoped
public class UserView {

    private static final Logger LOGGER = Logger.getLogger(UserView.class.getName());

    @ManagedProperty(value = "#{param.paramEmail}")
    private String paramEmail;

    @ManagedProperty(value = "#{param.paramUserName}")
    private String paramUserName;

    private User user;

    @PostConstruct
    public void init() {

        if (StringUtils.isNotBlank(paramEmail) || StringUtils.isNoneBlank(paramUserName)) {
            String emailUsername = paramEmail.concat(", ").concat(paramUserName);

            LOGGER.info("Param email, username {} " + emailUsername);
        }

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getParamEmail() {
        return paramEmail;
    }

    public void setParamEmail(String paramEmail) {
        this.paramEmail = paramEmail;
    }

    public String getParamUserName() {
        return paramUserName;
    }

    public void setParamUserName(String paramUserName) {
        this.paramUserName = paramUserName;
    }
}
