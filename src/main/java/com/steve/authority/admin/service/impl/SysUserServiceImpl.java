package com.steve.authority.admin.service.impl;

import com.steve.authority.admin.dao.SysUserMapper;
import com.steve.authority.admin.model.SysUser;
import com.steve.authority.admin.service.SysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
