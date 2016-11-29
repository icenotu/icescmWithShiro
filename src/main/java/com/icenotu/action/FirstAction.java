package com.icenotu.action;

import com.icenotu.entity.ActiveUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016-11-18.
 */
@Controller
public class FirstAction{
    //系统首页
    @RequestMapping("/first")
    public String first(HttpServletRequest request, Model model)throws Exception{

//        //从shiro的session中取activeUser
//        Subject subject = SecurityUtils.getSubject();
//        //取身份信息
//        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
//        HttpSession session = request.getSession();
//        session.setAttribute("activeUser", activeUser);
//        //通过model传到页面
////        model.addAttribute("activeUser", activeUser);
//        System.out.println("first---"+activeUser);
//        return "/WEB-INF/pages/index/index.jsp";
        return "forward:/base/goURL/index/index.form";
    }
}
