package purchase;

public class Vegetables01 {

    static String [] vegetables;
    static String pattern;
    static int count;
    static int patternCount;

    public static void main (String[] args) {
        vegetables = new String[]{"onions", "potatoes", "tomatoes", "cabbage",
                "cucumbers", "mushrooms", "potatoes"};
        pattern = "potatoes";

        for (int i = 0; i < vegetables.length; i++) {
            count++;
            System.out.printf("%d) %s%n",
                    count, vegetables[i]);
        }

        System.out.println("--------------- ");
        for (String veg: vegetables){
            if (veg.equals(pattern)){
                patternCount++;
                System.out.printf("%d) %s%n",
                        patternCount, veg);
            }

        }
        System.out.println("We've bought potatoes " + patternCount + " times.");
    }

}
