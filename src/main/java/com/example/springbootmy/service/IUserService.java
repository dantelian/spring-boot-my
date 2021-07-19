package com.example.springbootmy.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.example.springbootmy.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {

    String getUserBySex(int sex);

    List<User> selectByWrapper();

    void getPageByWrapper();

    Page<User> getPageList();

    Page getPageMap();

}
