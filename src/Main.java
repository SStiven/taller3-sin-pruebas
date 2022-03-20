import taller3.televisores.Marca;
import taller3.televisores.TV;

public class Main {

    public static void main(String[] args) {
        Marca samsung = new Marca("samsung");
	    TV tv = new TV(samsung, true);

        tv.turnOff();
        System.out.println(tv.getEstado());
        tv.turnOn();
        System.out.println(tv.getEstado());

        tv.setCanal(10);
        System.out.println(tv.getCanal());

        tv.setCanal(190);
        System.out.println(tv.getCanal());

    }
}
