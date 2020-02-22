package com.tutorialspoint.autowired.bean;

import lombok.Data;

import javax.annotation.PostConstruct;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
@Data
public class UserLoginForm implements Serializable {
    private static final long serialVersionUID = 1L;

    public interface LoginGroup {

    }

    public interface PWDChangeGroup {

    }

    private String userId;
    private String password;

    @PostConstruct
    public void init() {
        System.out.println("UserLoginForm.init()");
        setUserId("1001");
        setPassword("1234");
    }

    public String login() {
        System.out.println("UserLoginForm.login()");
        /* 画面遷移*/
        return "/response.xhtml?faces-redirect=true";
    }

}
