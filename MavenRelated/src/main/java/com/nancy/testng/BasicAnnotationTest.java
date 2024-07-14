package com.nancy.testng;
import org.testng.annotations.*;

public class BasicAnnotationTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    // This is the basic decoration
    @Test
    public void testCase1(){
        System.out.println("This is the first test case!");
    }

    @Test
    public void testCase2(){
        System.out.println("This is the second test case!");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

}
