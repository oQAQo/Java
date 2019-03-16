package strategy.delegate;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leader implements Itarget {

    Map<String,Itarget> map=new HashMap<String, Itarget>();

    public Leader(){
        map.put("a",new Coder1());
        map.put("b",new Coder2());

    }

    public void doWork(String command) {
        map.get(command).doWork(command);
    }
}
