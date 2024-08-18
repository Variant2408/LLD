package Client;

import Dispense.DispenseChain;
import Dispense.Impl.RS100;
import Dispense.Impl.RS2000;
import Dispense.Impl.RS500;

public class DispenseDemo {
    public static DispenseChain DispenseDemo(){
        DispenseChain Rs2000Obj=new RS2000();
        DispenseChain Rs500Obj=new RS500();
        DispenseChain Rs100Obj=new RS100();

        Rs2000Obj.setNextChain(Rs500Obj);
        Rs500Obj.setNextChain(Rs100Obj);

        return Rs2000Obj;
    }
}
