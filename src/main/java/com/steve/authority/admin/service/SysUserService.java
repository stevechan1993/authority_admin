package com.steve.authority.admin.service;

import com.steve.authority.admin.model.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
