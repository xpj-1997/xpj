package org.apache.control;

import org.apache.entity.User;
import org.apache.service.UserService;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.control
 * @ClassName: UserControl
 * @Author: xpj
 * @Date: 2021/4/27 上午 9:02
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Controller
@Scope("prototype")
public class UserController {
    private User user;
    private String account;
    private String password;
    private String code;

    private HttpServletRequest request = ServletActionContext.getRequest();
    private HttpSession session = request.getSession();
    @Autowired
    private UserService us;

    //登录
    public String login() {
        String validationCode = (String) session.getAttribute("validationCode");
        if (validationCode.equals(code)) {
            if (account != null && password != null) {
                User one = us.queryOne(account, password);
                if (one != null) {
                    return "loginSuccess";
                } else return "fail";
            } else return "fail";
        } else return "fail";

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
