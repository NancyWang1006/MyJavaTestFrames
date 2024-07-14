package com.nancy.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void testServer1() {
        System.out.println("Server test1");
    }

    @Test(groups = "client")
    public void testClient1() {
        System.out.println("Client test1");
    }

    @Test(groups = "server")
    public void testServer2() {
        System.out.println("Server test2");
    }

    @Test(groups = "client")
    public void testClient2() {
        System.out.println("Client test2");
    }

    @BeforeGroups("server")
    public void beforeServerGroup(){
        System.out.println("beforeServerGroup");
    }

    @AfterGroups("server")
    public void afterServerGroup(){
        System.out.println("afterServerGroup");
    }

    @BeforeGroups("client")
    public void beforeClientGroup(){
        System.out.println("beforeClientGroup");
    }

    @AfterGroups("client")
    public void afterClientGroup(){
        System.out.println("afterClientGroup");
    }
}
