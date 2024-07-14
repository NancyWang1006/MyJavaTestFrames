package com.nancy.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("The name is " + name + " and age is " + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
            {"zhangsan", 10},
            {"lisi", 20},
            {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("Test1:The name is " + name + " and age is " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("Test2:The name is " + name + " and age is " + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodData(Method method){
        Object[][] o=null;
        if(method.getName().equals("test1")){
            o=new Object[][]{
                    {"zhangsan", 10},
            };
            return o;
        }
        if(method.getName().equals("test2")){
            o=new Object[][]{
                    {"lisi", 20},
            };

            return o;
        }
        return o;
    }
}
