package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * author : Afu
 * e-mail : knnafu@gmail.com
 * date   : 2019/4/9 19:56
 * version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 返回值为字符串
     * @param model
     * @return
     */
    @RequestMapping("/testResponse")
    public String testResponse(Model model){
        System.out.println("返回值为字符串");

        //模拟查询
        User user = new User();
        user.setUsername("阿福");
        user.setPassword("158");
        user.setAge(25);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView respMv(){
        System.out.println("返回值为ModelAndView");

        //模拟查询
        User user = new User();
        user.setUsername("阿福");
        user.setPassword("158");
        user.setAge(25);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("转发页面或重定向");
        /*return "forward:/WEB-INF/pages/success.jsp";*/
        return "redirect:/index.jsp";

    }

    @RequestMapping("/textAjax")
    public @ResponseBody User textAjax(@RequestBody User user){
        System.out.println("发送异步请求");
        System.out.println(user);
        user.setUsername("Afu");
        user.setPassword("123456");
        return user;
    }
}


