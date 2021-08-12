//package search;
package com.kabir.milton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> myMap = new HashMap<>();
        var lst = new ArrayList<String>();
//        System.out.println("Enter the number of people:");
//        int cnt = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter all people:");
//        for (int i = 0; i < cnt; i++) {
//            String st = sc.nextLine();
//
//        }


        try {
            File myObj = new File(args[1]);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lst.add(data);
                String[] ar = data.split(" ");
                for (String s : ar) {
                    myMap.computeIfAbsent(s.toLowerCase(Locale.ROOT), k -> new ArrayList<>()).add(data);
                }
//                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        while (true) {
            System.out.println();
            System.out.println("=== Menu ===\n" +
                    "1. Find a person\n" +
                    "2. Print all people\n" +
                    "0. Exit");
            int ck = Integer.parseInt(sc.nextLine());
            if (ck == 1) {
                System.out.println();
                System.out.println("Enter a name or email to search all suitable people.");
                String st = sc.nextLine().toLowerCase(Locale.ROOT);
                int ccc = 0;
                Set<String> ss = new HashSet<>();
                for (String ii : myMap.keySet()) {
                    if (ii.matches(st)) {
                        ccc = 1;
                        ArrayList<String> ans = (ArrayList<String>) myMap.get(ii);
                        ss.addAll(ans);
                    }
                }
                if (ccc == 0) {
                    System.out.println("No matching people found.");
                } else {
                    System.out.println("\nFound people:");
                    for (String s : lst) {

                        if (ss.contains(s)) {
                            System.out.println(s);
                        }
                    }
                }

            } else if (ck == 2) {
                System.out.println();
                System.out.println("=== List of people ===");
                for (String s : lst) {
                    System.out.println(s);

                }

            } else if (ck == 0) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Incorrect option! Try again.");
            }
        }
    }
}
