package com.course.testng.suite;

import org.testng.annotations.*;
/*测试套件

 */
public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("SUITE执行前");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("SUITE执行后");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
}
