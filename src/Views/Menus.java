package Views;

import Entities.Candidate;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Candidate getCandidateInfo(){
        System.out.println("------------------------");
        System.out.println("Enter Candidate's Id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Candidate's Name:");
        String name = input.nextLine();
        System.out.println("Enter Candidate's Address:");
        String address = input.nextLine();
        System.out.println("Enter Candidate's Area:");
        String area = input.nextLine();
        System.out.println("Enter Candidate's Grade:");
        String grade = input.nextLine();
        Candidate candidate = new Candidate(id, name, address, area, grade);
        return candidate;
    }
}
