package factory.abs;

import factory.model.Computer;
import factory.model.Phone;

public abstract class AbstractFactory {

    public abstract Phone GetPhone();

    public abstract Computer GetCompupter();
}
