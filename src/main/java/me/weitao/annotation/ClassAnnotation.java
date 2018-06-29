package me.weitao.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * 元注解指作用于注解之上的元数据或者元信息，
 * 要实现自定义注解的话需要用到四个元注解，
 * 该注解在java.lang.annotation包内，
 * 这几个元注解是@Documented，@Inherited，@Retention和@Target
 */
@Documented
// 指明在SOURCE、CLASS还是RUNTIME的级别显示此注解
@Retention(RetentionPolicy.RUNTIME)
// 指明类上的注解
@Target({ElementType.TYPE})
public @interface ClassAnnotation {

  String value() default "I am Class Annotation\r\n";

  String name() default "ClassAnnotation";
}
