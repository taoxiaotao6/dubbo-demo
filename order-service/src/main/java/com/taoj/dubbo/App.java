package com.taoj.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        IPayService iPayService = (IPayService)classPathXmlApplicationContext.getBean("payService");
        String msg = iPayService.pay("jt-test");
        System.out.println( "order-service-"+msg );
    }
}
