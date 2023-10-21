package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // User entry
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day of the week in English. It will be translated to Russian.");
        String entry = in.nextLine();

        // Days of Week
        HashMap<String, String> DaysList = new HashMap<String, String>();
        DaysList.put("Monday", "Понедельник");
        DaysList.put("Tuesday", "Вторник");
        DaysList.put("Wednesday", "Среда");
        DaysList.put("Thursday", "Четверг");
        DaysList.put("Friday", "Пятница");
        DaysList.put("Saturday", "Суббота");
        DaysList.put("Sunday", "Воскресенье");

        for (HashMap.Entry<String, String> days : DaysList.entrySet()) {
            if (days.getKey().equals(entry)) {
                // System output
                System.out.println(entry + " is translated as: " + days.getValue());
            }
            in.nextLine();
        }
    }
}