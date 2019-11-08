package com.offcn.swaggerdemo.Controller;


import com.offcn.swaggerdemo.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users-test")
public class UserController {

    private List<User> listUser = Collections.synchronizedList(new ArrayList<User>());

    /***
     * 获取全部用户信息
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList() {
        listUser.add(new User(1,"zhang",22));
        listUser.add(new User(2,"lin",22));
        listUser.add(new User(3,"yan",22));
        return listUser;
    }

    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String createUser(User user) {
        listUser.add(user);
        return "success";
    }

    /***
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        for (User user : listUser) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * 更新指定id用户信息
     *
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Integer id, User user) {
        for (User user2 : listUser) {
            if (user2.getId() == id) {
                user2.setName(user.getName());
                user2.setAge(user.getAge());
            }
        }
        return "success";
    }

    /***
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {

        listUser.remove(getUser(id));
        return "success";

    }
}
