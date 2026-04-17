package Assignment4;

import java.util.*;

class Player {
    int id;
    String name, speciality;

    Player(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }
}

class Team {
    int id;
    String name, coach;
    ArrayList<Player> players = new ArrayList<>();

    Team(int id, String name, String coach) {
        this.id = id;
        this.name = name;
        this.coach = coach;
    }
}

