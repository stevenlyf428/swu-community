package com.swu.community.dao;

import com.swu.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.concurrent.*;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
