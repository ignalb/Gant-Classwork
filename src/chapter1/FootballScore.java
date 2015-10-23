package chapter1;

public class FootballScore {

	private static void printQuarter(int quarter) {
		System.out.printf("\n*************\n* QUARTER %d *\n*************\n", quarter);
		
	}
	
	private static void printHeader(String away, String home, int score_away, int score_home){
		System.out.print("=================================================================\n"
						+"|           MONDAY NIGHT FOOTBALL SEPTEMBER 14TH, 2015          |\n");
		System.out.printf( "| %-19s (Away) %2d - %2d %19s (Home) |\n", away, score_away, score_home, home);
		System.out.println("=================================================================");
	}
	
	private static String scoreToString(int score1, int score2){
		return score1 + "-" + score2;
	}
	private static void printPlay(String time, String playType, String player, String summary, int scoreAway, int scoreHome) {
		System.out.println(time + '\t' + playType.toUpperCase() + '\t' + player + ' ' + summary + '\t' + scoreToString(scoreAway, scoreHome));
	}
	private static void printPlay(String time, String playType, String player1, int yards, String player2, int scoreAway, int scoreHome){
		printPlay(time, playType, player1, yards + " yard " + playType + " from " + player2, scoreAway, scoreHome);
	}
	private static void printPlay(String time, String playType, String player1, int yards, int scoreAway, int scoreHome){
		printPlay(time, playType, player1, yards + " yard " + playType, scoreAway, scoreHome);
	}
	
	
	
	private static void printLine(){
		System.out.println("---------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		String playClock;
		String scoreType;
		String player1, player2;
		int yardage;
		int score_homeTeam = 0;
		int score_awayTeam = 0;
		
		// Header
		printHeader("Philadelphia Eagles", "Atlanta Falcons", 24, 26);
		
		// First Quarter
		printQuarter(1);
			playClock = "10:55";
			scoreType = "field goal";
			player1 = "Matt Bryant";
			yardage = 41;
			score_homeTeam += 3;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
		
		//Second Quarter
		printQuarter(2);
			playClock = "10:44";
			scoreType = "touchdown";
			player1 = "Julio Jones";
			yardage = 4;
			player2 = "Matt Ryant";
			score_homeTeam += 6;
		printPlay(playClock, scoreType, player1, yardage, player2, score_awayTeam, score_homeTeam);
			player1 = "Matt Bryant";
			scoreType = "extra point";
			score_homeTeam++;
		printPlay(playClock, scoreType, player1, scoreType + " is GOOD", score_awayTeam, score_homeTeam);
		printLine();
			playClock = "07:18";
			scoreType = "field goal";
			player1 = "Cody Parkey";
			yardage = 29;
			score_awayTeam += 3;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
		printLine();
			playClock = "01:05";
			scoreType = "field goal";
			player1 = "Matt Bryant";
			yardage = 39;
			score_homeTeam += 3;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
		printLine();
			playClock = "00:45";
			scoreType = "touchdown";
			player1 = "Julio Jones";
			player2 = "Matt Bryant";
			yardage = 22;
			score_homeTeam += 6;
		printPlay(playClock, scoreType, player1, yardage, player2, score_awayTeam, score_homeTeam);
			player1 = "Matt Bryant";
			scoreType = "extra point";
			score_homeTeam++;
		printPlay(playClock, scoreType, player1, scoreType + " is GOOD", score_awayTeam, score_homeTeam);
		
		//Third Quarter
		printQuarter(3);
			playClock = "13:13";
			scoreType = "touchdown";
			player1 = "DeMarco Murray";
			yardage = 8;
			score_awayTeam += 6;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
			player1 = "Cody Parkey";
			scoreType = "extra point";
			score_awayTeam++;
		printPlay(playClock, scoreType, player1, scoreType + " is GOOD", score_awayTeam, score_homeTeam);
			playClock = "03:39";
			scoreType = "touchdown";
			player1 = "DeMarco Murray";
			yardage = 5;
			player2 = "Sam Bradforc";
			score_awayTeam += 6;
		printLine();
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
			player1 = "Cody Parkey";
			scoreType = "extra point";
			score_awayTeam++;
		printPlay(playClock, scoreType, player1, scoreType + " is GOOD", score_awayTeam, score_homeTeam);
		
		//Fourth Quarter
		printQuarter(4);
			playClock = "10:49";
			scoreType = "field goal";
			player1 = "Matt Bryant";
			yardage = 44;
			score_homeTeam += 3;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
		printLine();
			playClock = "08:37";
			scoreType = "touchdown";
			player1 = "Ryan Matthews";
			yardage = 1;
			score_awayTeam += 6;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
			player1 = "Cody Parkey";
			scoreType = "extra point";
			score_awayTeam++;
		printPlay(playClock, scoreType, player1, scoreType + " is GOOD", score_awayTeam, score_homeTeam);
		printLine();
			playClock = "06:27";
			scoreType = "field goal";
			player1 = "Matt Bryant";
			yardage = 47;
			score_homeTeam += 3;
		printPlay(playClock, scoreType, player1, yardage, score_awayTeam, score_homeTeam);
		
	}

}
