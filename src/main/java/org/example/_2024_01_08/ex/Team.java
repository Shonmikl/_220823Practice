package org.example._2024_01_08.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<P extends Participant> {
    private String name;
    private List<P> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(P participant) {
        participants.add(participant);
        System.out.println(((Participant)participant).getName() + " was added to the list!*****");
    }

    //t1.play(t2);
    public void play(Team<P> secondTeam) {
        String winner;
        int randomNum = new Random().nextInt(2);
        if(randomNum == 0) {
            winner = this.name;
        } else {
            winner = secondTeam.name;
        }

        System.out.println("Winner is: " + winner + "$$$");
    }

    public void playWithGroup(List<Participant> group){

    }

//    public static void main(String[] args) {
//        Team t1 = new Team();
//        Team t2 = new Team();
//
//        t1.play(t2);
//    }
}
