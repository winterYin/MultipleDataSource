package com.yinc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yinc.entity.Operuser;
import com.yinc.service.OperuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
