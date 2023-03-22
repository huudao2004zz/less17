import java.util.*;


public class PlanetDiameters {

    private static final String[] names = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto" };

    public static void main(String[] args) {
        Map planets = new HashMap();

        Object[] diameters = new Object[0];
        for (int i = 0; i<names.length; i++)
            planets.put(names[i], diameters[i]);

        Iterator it = planets.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.printf(e.getKey() + ": " + e.getValue());
        }
        System.out.printf("\n------------------------\n");
        while (true){
            System.out.printf("Find planet ( Enter to quit): ");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) break;
            if (!planets.containsKey(name))
            System.out.printf("Planet "+ name + "not found! ");
            else
                System.out.printf("The diameter of "+ name + "is" + planets.get(name));
        }
    }
}
