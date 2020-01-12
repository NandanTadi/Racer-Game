public class Racer{
	public static void main(String[]args){

		RacerCanvas race = new RacerCanvas(800,800);
		race.setFiles("racer1.png","racer2.png","racer3.png");

int n = 0;


int delay = (int)(Math.random() * 10) + 5;


while(n==0){
			race.moveRacer1(n,50);
			race.delay(delay);
			race.repaint();
			n++;

}
}}