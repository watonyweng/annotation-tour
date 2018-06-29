package me.weitao.annotation;

@ClassAnnotation
public class TestAnnotation {

  // 属性注解
  @FieldAnnotation(value = "老伯", operate = "啥都不干")
  public String operate;

  // 方法注解
  @MethodAnnotation(value = "好人", name = "老伯")
  public void testMethod() {
    System.out.println("这个测试方法 - TestAnnotation.testMethod");
  }
}
