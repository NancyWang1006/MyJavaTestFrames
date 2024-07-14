package com.nancy.testng.groups;

import org.testng.annotations.Test;

@Test(groups="student")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("Stu1 in Class1");
    }

    public void stu2(){
        System.out.println("Stu2 in Class1");
    }
}
