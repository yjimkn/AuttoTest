package com.course.testng;

import org.testng.annotations.Test;

/*
异常结果测试
 */
public class ExpectedException {
    /*
    * 在我们期望结果为异常得时候
    *比如；我们传入了某个不合法得参数，
    * 我们得预期结果就是这个异常
     */
   // 这是一个测试结果会失败得异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个会失败的Exception");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个会成功的的Exception");
        throw new RuntimeException();

    }

}
