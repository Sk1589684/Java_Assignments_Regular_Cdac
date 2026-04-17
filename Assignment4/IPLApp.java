package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class IPLApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        int ch;
        do {
            System.out.println("1.Add Team 2.Delete Team 3.Add Player 4.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter id,name,coach:");
                    teams.add(new Team(sc.nextInt(), sc.next(), sc.next()));
                    break;

                case 2:
                    System.out.println("Enter team id:");
                    int tid = sc.nextInt();
                    teams.removeIf(t -> t.id == tid);
                    break;

                case 3:
                    System.out.println("Enter team id:");
                    int id = sc.nextInt();
                    for (Team t : teams) {
                        if (t.id == id) {
                            System.out.println("Enter player id,name,speciality:");
                            t.players.add(new Player(sc.nextInt(), sc.next(), sc.next()));
                        }
                    }
                    break;
            }
        } while (ch != 4);
    }
}
