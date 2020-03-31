package com.myq.controller;

import com.myq.entity.User;
import com.myq.service.UserService;
import com.myq.utils.ExcelUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * @Descriptions UserController
 * @Author myq
 * @Date 2020-03-31 17:46
 * @Other
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Object findUserList() {

        List<User> list = userService.findList(new HashMap<>());
        return list;
    }

    @RequestMapping(value = "/user/excel",  method = RequestMethod.GET)
    public void exportExcelUserList(HttpServletResponse response) throws IOException {
        List<User> list = userService.findList(new HashMap<>());

        // ExcelUtil传参：
        // response
        // title：此处我们将保存文件名写死为“用户统计数据”了
        // head：User类
        // list：User列表list
        ExcelUtil.exportExcel(response, "用户统计数据", User.class, list);
    }

}
