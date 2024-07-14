package com.nancy.testng;

import org.testng.annotations.Test;

public class ExepectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("This is failed test case in destiny.");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed2(){
        System.out.println("This is the case to throw exception");
        throw new RuntimeException();
    }
}
