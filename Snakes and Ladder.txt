package Richa;
import java.util.*;
import java.util.Random;

class Player {
	String name;
	int position;
}

public class snakesandladders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer>points = new HashMap<Integer, Integer>();
		System.out.print("Enter number of snakes/ladders : ");
		int snl = sc.nextInt();
		System.out.println("Enter the starting point and the end point of snakes and ladders : ");
		for(int j=0; j<snl; j++)
		{
			int start, end;
			start = sc.nextInt();
			end = sc.nextInt();
			points.put(start, end);
		}
		System.out.println();
		System.out.println("The point are : ");
		for(int n : points.keySet())
		{
			System.out.println(n + " - " + points.get(n));
		}

		System.out.print("Enter number of names : ");
		int names = sc.nextInt();
		sc.nextLine();
		ArrayList<Player> play = new ArrayList<Player>();

		for(int j=0; j<names; j++)
		{
			Player p = new Player();
			System.out.print("Enter the name of players : ");
			p.name = sc.nextLine();
			p.position = 1;
			play.add(p);
		}

		boolean isWon = false;
		
		while(isWon == false) 
		{
			for(int i=0; i<names; i++)
			{
				Player p1 = play.get(i);
				int num = throwDice();
				System.out.println("number on die is " + num);
				if(p1.position + num <= 100)
				{
					p1.position = p1.position + num;
				}
				if (points.get(p1.position) != null)
				{
					p1.position = points.get(p1.position);
				}			
				System.out.println(p1.name + " moved to " + p1.position);
				if (p1.position == 100)
				{
					System.out.println(p1.name + " wins the game!");
					isWon = true;
					break;
				}
				System.out.println();
			}
		}
	}
	
	static int throwDice()
	{
		Random random = new Random();
		int rand = 0;
		while (true){
		    rand = random.nextInt(7);
		    if(rand !=0) break;
		}
		return rand;
	}
}