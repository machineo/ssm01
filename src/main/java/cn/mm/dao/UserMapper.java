package cn.mm.dao;

import cn.mm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User selectByUsername(@Param("username") String username);
    List<User> select(@Param("username") String username, @Param("password") String password);

    int insertUser(@Param("user") User user); //int表示影响了多少条记录

    int deleteUserByUsername(@Param("username") String username);

    int update(@Param("username") String username, @Param("password") String password);

    int batchInsert(@Param("users") List<User> users);

}
