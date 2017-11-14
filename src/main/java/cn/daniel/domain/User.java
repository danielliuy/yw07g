/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 13:19
 * @version V2.0
 */
@Entity
@Table(catalog = "yw07g", name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long    id;
    private String  username;
    private String  password;
    private String  nickname;
    private Integer sex;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String nickname, Integer sex) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
