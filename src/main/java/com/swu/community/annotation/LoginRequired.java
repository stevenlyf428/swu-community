package com.swu.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//如何读取注解
//method.getAnnotation(LoginRequired.class);
//Method. getDeclaredAnnotations ()
/*工具：自定义注解，带有自定义注解的拦截请求
 *作用：检查登录状态
 */
@Target(ElementType.METHOD) //注解作用类型
@Retention(RetentionPolicy.RUNTIME) //注解生效时间
public @interface LoginRequired {


}