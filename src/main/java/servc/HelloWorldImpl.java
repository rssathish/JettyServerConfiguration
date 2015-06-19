package servc;

import javax.jws.WebService;


@WebService(endpointInterface = "servc.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{
    public String sayHi(String text)
    {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}
