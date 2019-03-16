package factory.abs;

public class AbsTest {

    public static void main(String[] args) {
        AbstractFactory factory=new PhoneFactory();

        factory.GetPhone();
    }
}
