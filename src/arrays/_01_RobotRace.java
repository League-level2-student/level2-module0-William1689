package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	int count = 0;	
	int finish = 1;
	
	//2. create an array of 5 robots.
	Robot[] robots	= new Robot[5];
	//3. use a for loop to initialize the robots.
	for(int i = 0;i<robots.length;i++) {
		robots[i] = new Robot();
		robots[i].setX(i*100+200);
		robots[i].setY(585);
		robots[i].setSpeed(10);
		
	
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	while(count<finish) {
		Random random = new Random();
		Random angle = new Random();
		for(int i = 0;i<robots.length;i++) {
			robots[i].move(random.nextInt(50));
			if(robots[i].getY() <= 0) {
				count++;
				JOptionPane.showMessageDialog(null, "WE HAVE A WINNER");
			}
		}
	}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}