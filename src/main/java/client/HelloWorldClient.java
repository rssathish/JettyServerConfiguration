package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import servc.HelloWorld;


public class HelloWorldClient
{
    public static void main(String[] args)
    {
        ApplicationContext act = new ClassPathXmlApplicationContext("Client-beans.xml");

        HelloWorld helloWorld= (HelloWorld) act.getBean("helloWorldclt");
        System.out.print(helloWorld.sayHi("test"));
    }

}
