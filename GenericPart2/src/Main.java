public class Main {

    public static void main(String[] args) {
	// write your code here
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> realMadrid = new Team<>("Real Madrid");
        realMadrid.addPlayer(joe);
     //   realMadrid.addPlayer(pat);
     //   realMadrid.addPlayer(beck);

        System.out.println("Number of player: " + realMadrid.numPlayer());

        Team<BaseBallPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("LA Galaxy");
        brokenTeam.addPlayer(beck);
    }
}
