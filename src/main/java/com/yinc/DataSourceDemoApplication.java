package com.yinc;

import com.alibaba.fastjson.JSONObject;
import com.yinc.beanConfig.MyConfig;
import com.yinc.dataConfig.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@MapperScan("com.yinc.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@Import({DynamicDataSourceConfig.class})
public class DataSourceDemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run =SpringApplication.run(DataSourceDemoApplication.class, args);

        MyConfig mybean = run.getBean(MyConfig.class);
        MyConfig mybean2 = run.getBean(MyConfig.class);

        String[] beanNamesForType = run.getBeanNamesForType(MyConfig.class);

        Arrays.stream(beanNamesForType).forEach(System.out::println);

        System.out.println(mybean==mybean2);
        System.out.println(JSONObject.toJSONString(mybean.operuser1()));
        System.out.println(JSONObject.toJSONString(mybean.operuser2()));
        System.out.println("=========");
        DynamicDataSourceConfig bean = run.getBean(DynamicDataSourceConfig.class);
        System.out.println(bean);

        String[] beanNamesForType1 = run.getBeanNamesForType(DynamicDataSourceConfig.class);
        Arrays.stream(beanNamesForType1).forEach(System.out::println);
    }

}
