package com.course.testng;
import org.junit.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BasicAnnotation {
    //基本注解
    @Before
    public void BeforeMethod(){
        System.out.println("BeforeMethod方法运行前");
    }
    @Test
    public void testCase1(){
        System.out.println("这是测试");
    }

    @After
    public void AfterMethod(){
        System.out.println("AfterMethod方法运行后");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass类运行前运行");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass类运行后运行");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BrforeSuite类运行前 111111111111111");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("BrforeSuite类运行后2222222222222222");
    }

}
