package factory.fun;

import factory.model.IPhone;
import factory.model.Phone;

public class IPhoneFactory extends PhoneFactory {

    @Override
    public Phone GetPhone() {
        return new IPhone();
    }
}
