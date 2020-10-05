package cn.mm.service;

import cn.mm.dao.UserMapper;
import cn.mm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//下面几个功能相同
//@Repository 数据库层
//@Controller 分发请求
//@Service 业务层
@Component  //组件，通用的
public class UserService {
//    @Resource  //一般通过指定名称注入
    @Autowired  //一般先去找类型
    private UserMapper userMapper;

    public User login(String username){
        return userMapper.selectByUsername("zhangsan");
    }
}
