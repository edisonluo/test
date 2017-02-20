package test;

import mypackage.HelloWorld;
import mypackage.HelloWorldService;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class MyClient {
    public static void main(String[] args) throws Exception {
        HelloWorldService impl =new HelloWorldService();
        HelloWorld hw = impl.getHelloWorldPort();
        System.out.print(hw.sayHelloWorldFrom("fk"));

    }
}  