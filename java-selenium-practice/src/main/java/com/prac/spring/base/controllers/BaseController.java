package com.prac.spring.base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Project: java-selenium-practice-parent
 * Package: com.prac.spring.base.controllers
 * <p>
 * User: vamshi
 * Date: 4/24/18
 * Time: 8:18 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class BaseController {

    @RequestMapping(value = "/temp", method = RequestMethod.GET)
    public String returnBaseHome() {
        return "temp.html";
    }

}
