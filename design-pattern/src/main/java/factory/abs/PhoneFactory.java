package factory.abs;

import factory.fun.IPhoneFactory;
import factory.fun.SunsanFactory;
import factory.model.Computer;
import factory.model.Phone;

public class PhoneFactory extends AbstractFactory {

    @Override
    public Phone GetPhone() {
        return new IPhoneFactory().GetPhone();
    }

    @Override
    public Computer GetCompupter() {
        //  return new
        return null;
    }
}
