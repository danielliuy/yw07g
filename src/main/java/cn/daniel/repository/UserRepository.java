/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.repository;

import cn.daniel.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 13:15
 * @version V2.0
 */
public interface UserRepository extends Repository<User, Long> {

    User saveOrUpdate(User user);

    User findById(long id);

    User findByUsername(String username);

    List<User> findAll();

    long count();

    Page<User> page(Pageable pageable);
}
