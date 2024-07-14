package com.nancy.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void tea1(){
        System.out.println("Tea1 in Class3");
    }

    public void tea2(){
        System.out.println("Tea2 in Class3");
    }
}
