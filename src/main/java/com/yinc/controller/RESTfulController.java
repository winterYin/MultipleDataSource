package com.yinc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yinc.entity.Operuser;
import com.yinc.service.OperuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <Description> RESTful风格接口<br>
 *
 * @author YinC <br>
 * @version 1.0<br>
 * @createDate 2021/03/17 21:41 <br>
 * @see com.yinc.controller <br>
 */
@RestController
@RequestMapping("/RESTfulController")
public class RESTfulController {


    @Autowired
    private OperuserService operuserService;


    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)
    public String getuser(@PathVariable("userid") String userid) {
        System.out.println("getuser");
        QueryWrapper<Operuser> qw = new QueryWrapper<Operuser>();
        qw.eq("cardno", userid);
        Operuser operuser = operuserService.getOne(qw);
        if (operuser != null) {
            System.out.println(operuser.toString());
            return operuser.toString();
        }
        return "fail";
    }


    @RequestMapping(method = RequestMethod.PUT)
    public String updateuser() {
        System.out.println("updateuser");
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String insertuser() {
        System.out.println("insertuser");
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteuser() {
        System.out.println("deleteuser");
        return null;
    }
}
