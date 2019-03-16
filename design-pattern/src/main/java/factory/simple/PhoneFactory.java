package factory.simple;

public class PhoneFactory<T> {

    public T GetPhone(Class phoneClass){
        try {
           return (T)phoneClass.newInstance() ;

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return  null;
    }
}
