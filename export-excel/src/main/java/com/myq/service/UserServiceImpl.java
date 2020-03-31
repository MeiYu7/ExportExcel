package com.myq.service;

import com.myq.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Descriptions UserServiceImpl
 * @Author myq
 * @Date 2020-03-31 17:57
 * @Other
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 查询user列表
     * @param map
     * @return
     */
    @Override
    public List<User> findList(Map<String, Object> map) {
        // 此处暂时不连接MySQL，手动构造3个user信息
        User userA = new User();
        userA.withId(1).withPassword("123456").withName("小红");

        User userB = new User();
        userB.withId(2).withPassword("abc23d21s").withName("小明");

        User userC = new User();
        userC.withId(3).withPassword("mn34bh21jw").withName("小胖");

        List<User> list = new ArrayList<>();
        list.add(userA);
        list.add(userB);
        list.add(userC);
        return list;

    }
}
