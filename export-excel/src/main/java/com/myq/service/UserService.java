package com.myq.service;

import com.myq.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Descriptions UserService
 * @Author myq
 * @Date 2020-03-31 17:56
 * @Other
 */
public interface UserService {

    /**
     * 查询user列表
     * @param map
     * @return
     */
    List<User> findList(Map<String, Object> map);



}
