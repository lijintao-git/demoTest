package com.CIDP.Controller;

import com.CIDP.Pojo.User;
import com.CIDP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void test()
    {
        List<User> users=userService.SelectAll();
        for(User user :users)
        {
            System.out.println(user);
            System.out.println(1);
        }
    }

}
