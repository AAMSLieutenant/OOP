import Predator.Predator;
import Predator.Types;


public class Application {
    public static void main(String[] args) {
        Predator p=new Predator(Types.CANIFORMIA);
        System.out.println(p);
        p.hunt();
        p.roar();
        p.run();
        p.sleep();
        //System.out.println(p.hashCode());
        //System.out.println(p);
    }
}
