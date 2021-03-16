package com.course.testng;

import org.testng.annotations.Test;

/*忽略测试 本次测试不想执行得测试

 */
public class lgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1执行");
    }
    @Test(enabled = false)
    //enabled = false此用例忽略执行
    public void ignore2(){
        System.out.println("ignore2执行");
    }
}
