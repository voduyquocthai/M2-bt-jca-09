package Views;

import Behaviors.CandidateManagement;
import Entities.Candidate;

import java.util.Scanner;

public class Program {

    static Scanner input = new Scanner(System.in);

    static CandidateManagement cm = new CandidateManagement();

    public static void main(String[] args) {
        do{
            System.out.println("-----Candidate Management-----");
            System.out.println("1. Add Candidate:");
            System.out.println("2. Delete Candidate:");
            System.out.println("3. Show All Candidate's Infos:");
            System.out.println("4. Show Candidate's Info By Id:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Candidate candidate = Menus.getCandidateInfo();
                    cm.addCandidate(candidate);
                    break;
                case 2:
                    System.out.println("Enter Candidate's Id That You Want To Delete:");
                    int id1 = Integer.parseInt(input.nextLine());
                    cm.deleteCandidate(id1);
                    break;
                case 3:
                    cm.showAllCandidateInfo();
                    break;
                case 4:
                    System.out.println("Enter Candidate's Id That You Want To Show:");
                    int id2 = Integer.parseInt(input.nextLine());
                    cm.showCandidateInfoById(id2);
                    break;
                default:
                    continue;
            }
        }
        while (true);
    }
}
