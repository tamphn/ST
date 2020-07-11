public class Main {

    public static void main(String[] args) {
	// write your code here
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beckham");


        Team<FootBallPlayer> sdCharger = new Team<>("San Diego Charger");
        sdCharger.addPlayer(joe);
     //   realMadrid.addPlayer(pat);
     //   realMadrid.addPlayer(beck);

        System.out.println("Number of player: " + sdCharger.numPlayer());

        Team<BaseBallPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("LA Galaxy");
        soccerTeam.addPlayer(beck);

        Team<FootBallPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootBallPlayer> fremantle = new Team<>("Freemantle");

        hawthorne.matchResult(fremantle,1,0);
        hawthorne.matchResult(sdCharger, 3, 8);

        sdCharger.matchResult(fremantle,2,3);
        sdCharger.matchResult(baseballTeam,1,1);

        System.out.println("Rankings ");
        System.out.println(sdCharger.getName() + ": " + sdCharger.ranking());
        System.out.println(baseballTeam.getName() + ": " + baseballTeam.ranking());
        System.out.println(soccerTeam.getName() + ": " + soccerTeam.ranking());

        System.out.println(sdCharger.compareTo(hawthorne));
        System.out.println(sdCharger.compareTo(fremantle));



    }
}
