package com.course.testng;
/*这是一个依赖测试
*
 */

import org.testng.annotations.Test;

public class DependTest {
    @Test
    //test1做完twst2的前置条件
    public void test1(){
        System.out.println("test run");
        throw new RuntimeException();//抛出一个异常
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
