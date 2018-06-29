package me.weitao.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

  public static void main(String[] args) {
    try {
      Class clazz = Class.forName("me.weitao.annotation.TestAnnotation");
      boolean classFlag = clazz.isAnnotationPresent(ClassAnnotation.class);
      if (classFlag) {
        ClassAnnotation classAnnotation = (ClassAnnotation)
            clazz.getAnnotation(ClassAnnotation.class);
        System.out.print(classAnnotation.name() + " => " + classAnnotation.value());
      }
      Method[] methods = clazz.getMethods();
      boolean methodFlag = methods[0].isAnnotationPresent(MethodAnnotation.class);
      if (methodFlag) {
        MethodAnnotation methodAnnotation =
            methods[0].getAnnotation(MethodAnnotation.class);
        System.out.println(methodAnnotation.name() + " => " + methodAnnotation.value());
      }
      Field[] fields = clazz.getDeclaredFields();
      boolean fieldFlag = fields[0].isAnnotationPresent(FieldAnnotation.class);
      if (fieldFlag) {
        FieldAnnotation fieldAnnotation = fields[0].getAnnotation(FieldAnnotation.class);
        System.out.println(fieldAnnotation.value() + " => " + fieldAnnotation.operate());
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
