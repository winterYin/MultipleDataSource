package com.yinc.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yinc.entity.Operuser;
import com.yinc.service.OperuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yinC
 * @since 2021-03-11
 */
@RestController
@RequestMapping("/operuser")
public class OperuserController {

    @Autowired
    private OperuserService operuserService;

    @RequestMapping(value = "getUser")
    public String getUser() {
        QueryWrapper<Operuser> qw = new QueryWrapper<Operuser>();
        qw.eq("cardno","123");
        Operuser operuser = operuserService.getOne(qw);
        if(operuser!=null){
            System.out.println(operuser.toString());
            return operuser.toString();
        }

       return "fail";
    }

    /**
     * 通过@Bean注解注册的组件，
     */
    @Resource(name = "operuser1")
    private Operuser operuser1;

    /**
     * 通过指定名加载
     */
    @Resource(name = "user2")
    private  Operuser operuser2;

    //    @Resource(name = "operuser2") //引用不到，报错
    //    private  Operuser operuser3;

    @RequestMapping(value = "getUser1")
    public String getUser1(){
        List<Operuser> list = new ArrayList<>();
        list.add(operuser1);
        list.add(operuser2);
    return JSONObject.toJSONString(list);
    }



}
