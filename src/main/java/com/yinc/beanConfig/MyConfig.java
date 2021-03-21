package com.yinc.beanConfig;

/**
 * <Description> 这个类用来学习bean注册<br>
 *
 * @author YinC <br>
 * @version 1.0<br>
 * @createDate 2021/03/12 10:15 <br>
 * @see com.yinc.beanConfig <br>
 */

import com.yinc.entity.Operuser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Bean 不能放在class上，type=method
 */

/**
 *
 */
@Configuration(proxyBeanMethods = true) //告诉springBoot这是一个配置类
public class MyConfig {


    @Bean//给容器中添加组件，以方法名为组建的id，返回类型就是组件类型，返回的值就是组件在容器中的实例
    public Operuser operuser1() {
        return new Operuser().setCardno("9527").setName("9527");
    }


    @Bean(name = "user2")//给容器中添加组件，以方法名为组建的id，返回类型就是组件类型，返回的值就是组件在容器中的实例
    public Operuser operuser2() {
        return new Operuser().setCardno("952711").setName("952711");
    }
}
