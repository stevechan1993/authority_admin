package com.steve.authority.service;

import com.steve.authority.model.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
