/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.service.impl;

import cn.daniel.domain.User;
import cn.daniel.repository.UserRepository;
import cn.daniel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 16:04
 * @version V2.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveOrUpdate(User user) {
        if (user == null) return false;

        return userRepository.saveOrUpdate(user) != null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public User findById(Long id) {
        if (id == null) return null;

        return userRepository.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        if (StringUtils.isEmpty(username)) return null;

        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> page(Pageable pageable) {
        return userRepository.page(pageable);
    }
}
