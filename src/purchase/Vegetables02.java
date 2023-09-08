package purchase;

import java.util.Scanner;

public class Vegetables02 {
    static String [] vegetables;
    static String [] days;
    static String weekDay;
    static int count;
    public static void main (String[] args) {

        vegetables = new String[]{"onions", "potatoes", "tomatoes", "cabbage",
                "cucumbers", "mushrooms", "potatoes"};
        days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println("Bought vegetables are:");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vegetables.length && i < days.length; i++) {
            count++;
            System.out.printf("%d| %s| %s%n",
                    count, days[i], vegetables[i]);
        }
        System.out.println("Enter the day:");
        weekDay = sc.nextLine();

        if (weekDay.equals("Mon")) System.out.println("On Mon we bought " + vegetables[0]);
        else if (weekDay.equals("Tue")) System.out.println("On Tue we bought " + vegetables[1]);
        else if (weekDay.equals("Wed")) System.out.println("On Wed we bought " + vegetables[2]);
        else if (weekDay.equals("Thu")) System.out.println("On Thu we bought " + vegetables[3]);
        else if (weekDay.equals("Fri")) System.out.println("On Fri we bought " + vegetables[4]);
        else if (weekDay.equals("Sat")) System.out.println("On Sat we bought " + vegetables[5]);
        else System.out.println("On Sun we bought " + vegetables[6]);

            sc.close();

     }
    }
