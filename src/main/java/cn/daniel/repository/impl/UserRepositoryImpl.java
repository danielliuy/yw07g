/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.repository.impl;

import cn.daniel.domain.User;
import cn.daniel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 15:28
 * @version V2.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public User saveOrUpdate(User user) {
        return entityManager.merge(user);
    }

    @Override
    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        String hql = "FROM User WHERE username = :username";
        return (User) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
    }

    @Override
    public List<User> findAll() {
        String hql = "FROM User ";
        return entityManager.createQuery(hql).getResultList();
    }

    @Override
    public long count() {
        String hql = "select count(0) FROM User";
        return entityManager.createQuery(hql, Long.class).getSingleResult();
    }

    @Override
    public Page<User> page(Pageable pageable) {
        long total = count();

        String hql = "FROM User";
        List<User> list = entityManager.createQuery(hql)
                                       .setFirstResult(pageable.getOffset())
                                       .setMaxResults(pageable.getPageSize())
                                       .getResultList();

        return new PageImpl<>(list, pageable, total);
    }
}
