public class Main {

    public static void main(String[] args) {
	// write your code here
        League<Team<FootBallPlayer>> footballLeague = new League<>("AFL");
        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        Team<FootBallPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootBallPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseBallPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();


    }
}
