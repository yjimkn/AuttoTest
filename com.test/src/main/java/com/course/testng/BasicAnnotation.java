package com.course.testng;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BasicAnnotation {
    //基本注解
    @Test
    public void testCase1(){
        System.out.println("这是测试");
        System.out.println();
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod方法运行前");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod方法运行后");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass类运行前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass类运行后运行");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BrforeSuite类运行前 ");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("BrforeSuite类运行后");
    }

}
