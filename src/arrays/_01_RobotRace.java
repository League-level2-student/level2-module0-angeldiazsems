package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] array = new Robot[5];
		// 3. use a for loop to initialize the robots.
		Random ran = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = new Robot();
			array[i].setSpeed(10);
			array[i].setX(i * 120 + 70);
			array[i].setY(450);
		}
		boolean isFinished = false;
		while (!isFinished) {
			for (int i = 0; i < array.length; i++) {
				int ranum = ran.nextInt(50);
				array[i].move(ranum);
				if (array[i].getY() < 50) {
					isFinished = true;
					System.out.println("Robot "+i+" won! party time");
					break;
				}
			}
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}