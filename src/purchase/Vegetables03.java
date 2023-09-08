package purchase;

import java.util.Scanner;
public class Vegetables03 {
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

        switch (weekDay.trim()){
            case "Mon": System.out.println("On Mon we bought " + vegetables[0]);
                break;
            case "Tue": System.out.println("On Tue we bought " + vegetables[1]);
                break;
            case "Wed": System.out.println("On Wed we bought " + vegetables[2]);
                break;
            case "Thu": System.out.println("On Thu we bought " + vegetables[3]);
                break;
            case "Fri": System.out.println("On Fri we bought " + vegetables[4]);
                break;
            case "Sat": System.out.println("On Sat we bought " + vegetables[5]);
                break;
            case "Sun": System.out.println("On Sun we bought " + vegetables[6]);
                break;

            default:
                System.out.println("Incorrect data");

        }
        sc.close();
    }
}
