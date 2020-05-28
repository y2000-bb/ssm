package com.dao;

import com.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserDao {

    public List<User> queryAll();

    public Integer save(User user);

}
