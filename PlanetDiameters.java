import java.util.*;

public class PlanetDiameters {

    private static final String[] names = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto" };
    private static final float[] diameters = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f, 120536f, 51118f, 49532f, 2274f };
    public static void main(String[] args) {
        // Using LinkedHashMap
        //Map<String, Float> planets = new LinkedHashMap<>();

        // Using TreeMap
        Map<String, Float> planets = new TreeMap<>();

        for (int i = 0 ; i<names.length;i++)
            planets.put(names[i], diameters[i]);

        Iterator<Map.Entry<String, Float>> it = planets.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Float> e = it.next();
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