package practice;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner player = new Scanner(System.in);
		System.out.println("자신만의 야구 팀을 만드세요\n");
		System.out.println("FirstBaseMan : ");
		String firstbase = player.next();
		System.out.println("SecondBaseMan : ");
		String secondbase = player.next();
		System.out.println("ThirdBaseMan : ");
		String thirdbase = player.next();
		System.out.println("ShortStopper : ");
		String shortstop = player.next();
		System.out.println("LeftFielder : ");
		String leftfield = player.next();
		System.out.println("CenterFielder : ");
		String centerfield = player.next();
		System.out.println("RightFielder : ");
		String rightfield = player.next();
		System.out.println("Catcher : ");
		String catcher = player.next();
		System.out.println("DesignatedHitter : ");
		String designatedhitter = player.next();
		System.out.println("Pitcher : ");
		String pitcher = player.next();
		
		System.out.println("FirstBaseMan : "+firstbase
				+"\nSecondBaseMan : "+secondbase
				+"\nThirdBaseMan : "+thirdbase
				+"\nShortStopper : "+shortstop
				+"\nLeftfield : "+leftfield
				+"\nCenterfield : "+centerfield
				+"\nRightfield : "+rightfield
				+"\nCatcher : "+catcher
				+"\nDesignatedHitter : "+designatedhitter
				+"\nPitcher : "+pitcher);
		
	}

}
