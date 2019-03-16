package factory.fun;

import factory.model.Phone;
import factory.model.SunsamPhone;

public class SunsanFactory extends PhoneFactory {

    @Override
    public Phone GetPhone() {
        return new SunsamPhone();
    }
}
