package com.tnsif.dayfive.multilevelinheritance;

import java.util.Calendar;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Atharv", 7878767676L, getDate(2000, 12, 2));
        System.out.println(p1);

        p1 = new Employee("Pranav", 8080807070L, getDate(1995, 5, 7), "Sales", 45000);
        System.out.println(p1);

        p1 = new LevelOneEmployee("Madhur", 9880807227L, getDate(1988, 2, 15), "Account", 85000, 200,
                "Signing Authority");
        System.out.println(p1);
    }

    // Helper method to generate a Date object from year, month, day
    private static java.util.Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);  // month is 0-indexed
        return cal.getTime();
    }
}
