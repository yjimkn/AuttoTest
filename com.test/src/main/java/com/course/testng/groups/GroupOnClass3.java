package com.course.testng.groups;

import org.testng.annotations.Test;

/*
类得测试方法
 */
@Test(groups ="teacher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("teacher2");
    }
    public void teacher2(){
        System.out.println("teacher2");
    }
    public void teacher3(){
        System.out.println("teacher3");
    }

}
