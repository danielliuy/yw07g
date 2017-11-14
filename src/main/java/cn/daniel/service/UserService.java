/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.service;

import cn.daniel.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 16:02
 * @version V2.0
 */
public interface UserService {

    boolean saveOrUpdate(User user);

    boolean deleteById(Long id);

    User findById(Long id);

    User findByUsername(String username);

    List<User> findAll();

    Page<User> page(Pageable pageable);
}
