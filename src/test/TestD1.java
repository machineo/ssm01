import cn.mm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

public class TestD1 {

    @Test
    @Autowired
    public void fun1(){
        UserService userService = new UserService();
        System.out.println(userService.login("lsdjf"));

    }
}
