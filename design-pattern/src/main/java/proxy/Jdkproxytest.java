package proxy;

import java.lang.reflect.Proxy;

public class Jdkproxytest {

    public static void main(final String[] args) {
        WorkProxy proxy=new WorkProxy(Student.class);
        Person personProxy=(Person) Proxy.newProxyInstance(Student.class.getClassLoader(),
                Student.class.getInterfaces(),proxy);


      //  personProxy.work();

//        Enhancer enhancer=new Enhancer();
//        enhancer.setSuperclass(Student.class);
//        enhancer.setCallback(new MethodInterceptor() {
//            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                System.out.println("begin");
//                Object result=methodProxy.invoke(o,args);
//                System.out.println("end");
//                return  result;
//            }
//        });
//
//        Student person=(Student) enhancer.create();
//        person.work();
    }
}
