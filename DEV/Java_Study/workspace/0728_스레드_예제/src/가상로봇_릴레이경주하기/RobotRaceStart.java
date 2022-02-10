package 가상로봇_릴레이경주하기;

public class RobotRaceStart {
	/*
	 * 메인 스레드 역할
	 */

	public static void main(String[] args) {
		RobotRace robotA= new RobotRace("로봇-A");
		RobotRace robotB= new RobotRace("로봇-B");
		RobotRace robotC= new RobotRace("로봇-C");
		
		robotA.start();
		robotB.start();
		robotC.start();
	} 

}
