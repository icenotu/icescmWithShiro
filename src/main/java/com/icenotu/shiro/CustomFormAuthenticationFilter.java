package com.icenotu.shiro;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016-11-16.
 */
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {
    //重写原FormAuthenticationFilter的认证方法
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        //校验验证码
        //从session中获取正确的验证码
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();
        String validateCode = (String) session.getAttribute("validateCode");

        //取出页面的验证码
        String randomcode = request.getParameter("randomcode");
        System.out.println("randomcode"+randomcode);
        //比对验证码
        if (randomcode != null & validateCode != null && !randomcode.equals(validateCode)) {

            //如果验证码校验失败，将验证码错误信息通过shiroLoginFailure传入request中
            httpServletRequest.setAttribute("shiroLoginFailure", "randomCodeError");
            //拒绝访问，不再校验用户名和密码
            return true;
        }


        return super.onAccessDenied(request, response);
    }
}
