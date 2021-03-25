package com.yinc.controller;

import com.alibaba.fastjson.JSONObject;
import com.yinc.beanConfig.SpringContext;
import com.yinc.dataConfig.DynamicDataSourceConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.sql.DataSource;

/**
 * <Description> <br>
 *
 * @author YinC <br>
 * @version 1.0<br>
 * @createDate 2021/03/21 16:09 <br>
 * @see com.yinc.controller <br>
 */
@RestController
@RequestMapping("/configss")
public class ConfigPropertiesController {

    /**
     * 通过config获取bean
     * @return
     */
    @RequestMapping(value = "/getproperty")
    public  String getDataSourceProperty(){
        /**
         * 通过@Configuration获取bean
         */
        DynamicDataSourceConfig bean = SpringContext.getContext().getBean(DynamicDataSourceConfig.class);
        System.out.println(bean.firstDataSource());

        /**
         * 通过@ConfigurationProperties 和 @bean 获取 bean对象
         * 默认的bean名字就是 @bean的方法名
         */
        DataSource bean1 = SpringContext.getBean("secondDataSource" ,DataSource.class);
        System.out.println(bean1);
        return "success";
    }
}
