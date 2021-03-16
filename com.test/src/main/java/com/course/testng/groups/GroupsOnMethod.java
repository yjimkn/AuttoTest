package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/*
组测试中得方法分组测试
 */
public class GroupsOnMethod {
    @Test(groups="serever")
    public void test1(){
        System.out.println("test11111111");
    }
    @Test(groups="serever")
    public void test2(){
        System.out.println("test222222222");
    }
    @Test(groups= "client")
    public void test3(){
        System.out.println("client33333");
    }
    @Test(groups= "client")
    public void test4(){
        System.out.println("client4");
    }
    @BeforeGroups("serever")
    public void BeforeGroups(){
        System.out.println("BeforeGroups");
    }
    @AfterGroups("serever")
    public void AfterGroups(){
        System.out.println("AfterGroups");
    }
    @BeforeGroups("client")
    public void Beforeclient(){
        System.out.println("BeforeGroupsclient");
    }
    @AfterGroups("client")
    public void Afterclient(){
        System.out.println("AfterGroupsclient");
    }


}
