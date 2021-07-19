package com.example.springbootmy.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.springbootmy.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    List<User> getPageList(Page<User> page);

    List<Map<String,Object>> getPageMap(Page page);

}
