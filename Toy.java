
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Toy {
    public static void addToy(int id, String key,  int chance, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(chance);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(chance);
            list.add(id);
            map.put(key, list);
        }

    }

    public static void printToyList(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String toys = "";
            for (int el : item.getValue()) {
                toys = toys + el + ", ";
            }
            System.out.printf("%s: Chance %s  \n ",  item.getKey(),  toys);

        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> toylist = new HashMap<>();
        addToy(1, "Matreshka",  70, toylist);
        addToy(2, "Balalayka",  70, toylist);
        addToy(3, "Green elephant",  1, toylist);
        addToy(4, "Bust of V.I. Lenin",  25, toylist);
        addToy(5, "Rifle AKM",  5, toylist);
        addToy(6, "Bottle of Vodka",  90, toylist);
        addToy(7, "Petushok",  50, toylist);
        addToy(8, "Azbooka",  70 , toylist);
        addToy(9, "Pyramidka",   50, toylist);
        addToy(10, "Wooden Horse",   1, toylist);
        // printToyList(toylist);
        int a = 0;
        int b = 10;
        int rnd1 = a + (int) (Math.random() * b);
        System.out.println(rnd1);
            if (rnd1 == 1){
                System.out.println("You won a Matreshka");
            } if (rnd1 == 2){
                System.out.println("You won a Balalayka");
            }      if (rnd1 == 3){
                System.out.println("You won a Green elephant");
            } if (rnd1 == 4){ 
                System.out.println("You won a Bust of V.I. Lenin's");
            }if (rnd1 == 5){
                System.out.println("You won a Rifle AKM");
            } if (rnd1 == 6){
                System.out.println("You won a Bottle of Vodka");
            }      if (rnd1 == 7){
                System.out.println("You won a Petushok");
            } if (rnd1 == 8){ 
                System.out.println("You won a Azbooka");
            }  if (rnd1 == 9){
                System.out.println("You won a Pyramidka");
            } if (rnd1 == 10){ 
                System.out.println("You won a Wooden little horse");
            }
            if (rnd1 == 0){
                System.out.println("You won nothing, comrade, try better next time");
            }



        }


    }
