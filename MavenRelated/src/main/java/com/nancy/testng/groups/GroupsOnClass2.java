package com.nancy.testng.groups;

import org.testng.annotations.Test;

@Test(groups="student")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("stu1 in class2");
    }

    public void stu2(){
        System.out.println("stu2 in class2");
    }
}
