package com.yinc.dataConfig;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * <p/>
 * 指定要使用的数据源
 *
 * @author yinC
 * @version V1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurDataSource {

    String name() default "";

}