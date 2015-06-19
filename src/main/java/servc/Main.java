package servc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{
    public Main()
    {
        ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
    }

    public static void main(String[] args) throws InterruptedException
    {
        new Main();
        Thread.sleep(100000000);
    }
}
