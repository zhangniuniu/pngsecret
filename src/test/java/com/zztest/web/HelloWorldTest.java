package com.zztest.web;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangyong on 2017/2/25.
 */
public class HelloWorldTest {

    @Test
    public void testHello(){
        Assert.assertEquals("hellow world",new HelloWorld().sayHello());
    }

}