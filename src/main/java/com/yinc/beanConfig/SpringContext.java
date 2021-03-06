package com.yinc.beanConfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <Description> <br>
 *
 * @author YinC <br>
 * @version 1.0<br>
 * @createDate 2021/03/14 12:35 <br>
 * @see com.yinc.beanConfig <br>
 */
public class SpringContext {

    //通过 BeanFactory 接口创建实例
    private static ConfigurableApplicationContext context = null;



    public static ConfigurableApplicationContext run(Class source, String[] args) {
        context = SpringApplication.run(source, args);
        SpringContext.setInstance(context);
        return context;
    }

    public static Object getBean(String name)
    {
        return getContext().getBean(name);
    }

    public static <T> T getBean(String name, Class<T> clazz)
    {
        return (T) getContext().getBean(name, clazz);
    }

    public static Object getBean(String name, Object... args)
    {
        return getContext().getBean(name, args);
    }

    public static <T> T getBean(Class<T> requiredType, Object... args)
    {
        return getContext().getBean(requiredType, args);
    }

    public static BeanFactory getContext()
    {
        return context;
    }

    public synchronized static void setInstance(ConfigurableApplicationContext myContext)
    {
        context = myContext;
    }


}
