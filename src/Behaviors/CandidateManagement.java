package Behaviors;

import Entities.Candidate;

import java.util.ArrayList;

public class CandidateManagement {
    ArrayList<Candidate> candidates = new ArrayList<>();

    public void addCandidate(Candidate c) {
        candidates.add(c);
    }

    public void deleteCandidate(int id) {
        candidates.removeIf(c -> c.getId() == id);
    }

    public void showAllCandidateInfo() {
        for (Candidate c : candidates) {
            System.out.println(c.toString());
        }
    }

    public void showCandidateInfoById(int id){
        for (Candidate c: candidates) {
            if(c.getId() == id){
                System.out.println(c.toString());
            }
        }
    }

}
