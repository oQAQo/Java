package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkProxy implements InvocationHandler {

    private  Object target;

    public WorkProxy(Object target){

       this. target=target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke begin");
        method.invoke(target,args);
        System.out.println("invoke end");
        return  null;
    }
}
