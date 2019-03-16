package factory.fun;

public class PhoneFactoryTest {

    public static void main(String[] args) {
        PhoneFactory factory=new IPhoneFactory();
        String name= factory.GetPhone().getName();
    }
}
