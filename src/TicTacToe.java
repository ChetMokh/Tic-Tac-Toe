/**
 * Title: TicTacToe.java
 * Abstract: Tic Tac Toe game. (Homework 2)
 * Author: Arash Aria
 * ID: 4210
 * Date: 06/06/16
 */


import java.util.Scanner;

public class TicTacToe {

	public static void checkTicTacToe(String[][] myBox) {
		
		int countX = 0;
		int countO = 0;
		
		//Vertical checks
		for(int i = 0; i < 3; i++)
		{
			
			for(int j = 0; j < 3; j++)
			{
				if (myBox[i][j] == "X")
				{
					countX++;
				} 
				if (myBox[i][j] == "O")
				{
					countO++;
				}
			}
			if (countO == 3)
			{
				System.out.println("Computer Wins");
				System.exit(1);
			}
			if (countX == 3)
			{
				System.out.println("You Win");
				System.exit(1);
			} else {
				countO = 0;
				countX = 0;
			}
	
		}
		
		//Horizontal checks
		for(int i = 0; i < 3; i++)
		{
			
			for(int j = 0; j < 3; j++)
			{
				if (myBox[j][i] == "X")
				{
					countX++;
				} 
				if (myBox[j][i] == "O")
				{
					countO++;
				}
			}
			if (countO == 3)
			{
				System.out.println("Computer Wins");
				System.exit(1);
			}
			if (countX == 3)
			{
				System.out.println("You Win");
				System.exit(1);
			} else {
				countO = 0;
				countX = 0;
			}
	
		}
		
		//Diagonal checks
		for(int i = 0; i < 3; i++)
		{
			
			if (myBox[i][i] == "X")
			{
				countX++;
			} 
			if (myBox[i][i] == "O")
			{
				countO++;
			}
		}
		if (countO == 3)
		{
			System.out.println("Computer Wins");
			System.exit(1);
		}
		if (countX == 3)
		{
			System.out.println("You Win");
			System.exit(1);
		} else {
			countO = 0;
			countX = 0;
		}
		
		//Diagonal checks
		for(int i = 0, j = 2; i < 3; i++, j--)
		{
		
			
			if (myBox[i][j] == "X")
			{
				countX++;
			} 
			if (myBox[i][j] == "O")
			{
				countO++;
			}
		}
		
		if (countO == 3)
		{
			System.out.println("Computer Wins");
			System.exit(1);
		}
		if (countX == 3)
		{
			System.out.println("You win");
			System.exit(1);
		} 
		
		int countAll = 0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (myBox[i][j].equals("X") || myBox[i][j].equals("O"))
				{
					countAll++;
				}
			}
		}
		if (countAll == 9)
		{
			System.out.println("It is a tie!");
			System.exit(1);
		}
		
		
		
		
	}
	
	public static String findMoveTicTacToeLoose(String[][] myBox) {
		
		String strX = "X";
		String strO = "O";
		
		int countX = 0;
		int countO = 0;
		
		//Horizontal checks
		for(int i = 0; i < 3; i++)
		{
			countX = 0;
			countO = 0;
			
			for(int j = 0; j < 3; j++)
			{
				
				if (myBox[i][j].equals(strX))
				{
					countX++;
				}
				
				if (myBox[i][j].equals(strO))
				{
		 			countO++;
				}
				
			}
			
			if (countX == 2 && countO == 0)
			{
				for(int j = 0; j < 3; j++)
				{
					if (!myBox[i][j].equals(strO) && !myBox[i][j].equals(strX))
					{
						return myBox[i][j];
					}
				}
			}
		}
		

		
		//Vertical checks
		for(int i = 0; i < 3; i++)
		{
			countX = 0;
			countO = 0;
			
			for(int j = 0; j < 3; j++)
			{
				if (myBox[j][i].equals(strX))
				{
					countX++;
				} 
				if (myBox[j][i].equals(strO))
				{
					countO++;
				}
			}
			
			if (countX == 2 && countO == 0)
			{
				for(int j = 0; j < 3; j++)
				{
					if (!myBox[j][i].equals(strO) && !myBox[j][i].equals(strX))
					{
						return myBox[j][i];
					}
				}
			}
		}
		
	
		
		//Diagonal checks one
		countX = 0;
		countO = 0;
		for(int i = 0; i < 3; i++)
		{
			
			
			if (myBox[i][i].equals(strX))
			{
				countX++;
			} 
			if (myBox[i][i].equals(strO))
			{
				countO++;
			}
		}
		if (countX == 2 && countO == 0)
		{
			for(int i = 0; i < 3; i++)
			{
				if (!myBox[i][i].equals(strO) && !myBox[i][i].equals(strX))
				{
					return myBox[i][i];
				}
			}
		}
		
		
		
		//Diagonal checks two
		countX = 0;
		countO = 0;
		for(int i = 0, j = 2; i < 3; i++, j--)
		{
			
			if (myBox[i][j].equals(strX))
			{
				countX++;
			} 
			if (myBox[i][j].equals(strO))
			{
				countO++;
			}
		}
		if (countX == 2 && countO == 0)
		{
			for(int i = 0, j = 2; i < 3; i++, j--)
			{
				if (!myBox[i][j].equals(strO) && !myBox[i][j].equals(strX))
				{
					return myBox[i][j];
				}
			}
		}
		
		for(int i = 0; i < 3;i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if (!myBox[i][j].equals(strO) && !myBox[i][j].equals(strX))
				{
					return myBox[i][j];
				}
			}
		}
		return null;
	}
	
	public static String findMoveTicTacToe(String[][] myBox) {
		
		String strX = "X";
		String strO = "O";
		
		int countX = 0;
		int countO = 0;
		
		//Horizontal checks
		for(int i = 0; i < 3; i++)
		{
			countX = 0;
			countO = 0;
			
			for(int j = 0; j < 3; j++)
			{
				
				if (myBox[i][j].equals(strX))
				{
					countX++;
				}
				
				if (myBox[i][j].equals(strO))
				{
		 			countO++;
				}
				
			}
			
			if (countO == 2 && countX == 0)
			{
				for(int j = 0; j < 3; j++)
				{
					if (!myBox[i][j].equals(strO) && !myBox[i][j].equals(strX))
					{
						return myBox[i][j];
					}
				}
			}
		}
		

		
		//Vertical checks
		for(int i = 0; i < 3; i++)
		{
			countX = 0;
			countO = 0;
			
			for(int j = 0; j < 3; j++)
			{
				if (myBox[j][i].equals(strX))
				{
					countX++;
				} 
				if (myBox[j][i].equals(strO))
				{
					countO++;
				}
			}
			
			if (countO == 2 && countX == 0)
			{
				for(int j = 0; j < 3; j++)
				{
					if (!myBox[j][i].equals(strO) && !myBox[j][i].equals(strX))
					{
						return myBox[j][i];
					}
				}
			}
		}
		
	
		
		//Diagonal checks one
		countX = 0;
		countO = 0;
		for(int i = 0; i < 3; i++)
		{
			
			if (myBox[i][i].equals(strX))
			{
				countX++;
			} 
			if (myBox[i][i].equals(strO))
			{
				countO++;
			}
		}
		if (countO == 2 && countX == 0)
		{
			for(int i = 0; i < 3; i++)
			{
				if (!myBox[i][i].equals(strO) && !myBox[i][i].equals(strX))
				{
					return myBox[i][i];
				}
			}
		}
		
		//Diagonal checks two
		countX = 0;
		countO = 0;
		for(int i = 0, j = 2; i < 3; i++, j--)
		{
			
			if (myBox[i][j].equals(strX))
			{
				countX++;
			} 
			if (myBox[i][j].equals(strO))
			{
				countO++;
			}
		}
		if (countO == 2 && countX == 0)
		{
			for(int i = 0, j = 2; i < 3; i++, j--)
			{
				if (!myBox[i][j].equals(strO) && !myBox[i][j].equals(strX))
				{
					return myBox[i][j];
				}
			}
		}
		return findMoveTicTacToeLoose(myBox);
		
	}
	
	public static String[][] insertTicTacToe(String[][] myBox, String input, String inputChar) {
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if (myBox[i][j].equals(input)) 
				{
					myBox[i][j] = inputChar;
					return myBox;
				} 
			}
			
		}
		System.out.println("Wrong Input!!!");
		System.out.println("Try Again:");
		@SuppressWarnings("resource")
		Scanner tempScan = new Scanner(System.in);
		String newInput = String.valueOf(tempScan.nextInt());
		
		return insertTicTacToe(myBox, newInput, inputChar);
		
	}
	
	public static void printTicTacToe(String[][] myBox) {

		System.out.println();
		System.out.println("\t -------------");
		for(int i = 0; i < 3; i++)
		{
			System.out.print("\t | ");
			for(int j = 0; j < 3; j++)
			{
				System.out.print(myBox[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.println("\t -------------");	
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		
		String[][] myBox = new String[3][3];
		
		for(int i = 0 , k = 1; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				myBox[i][j] = Integer.toString(k);
				k++;
			}
		}
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("==== Welcome to Tic-Tac-Toe Game ====");
		
		System.out.println("Do you want to start first?     (Press Y or y)");
		
		String temp = myScan.next();
		
		System.out.println("OK! Your character is X and computer character is O");
		
		printTicTacToe(myBox);
		
		if (temp.equals("Y") || temp.equals("y"))
		{
			
			for (int i = 0; i < 9; i++)
			{
				String input;
				checkTicTacToe(myBox);
				System.out.println("Pick your spot: ");
				input = String.valueOf(myScan.nextInt());
				insertTicTacToe(myBox, input, "X");
				printTicTacToe(myBox);
				checkTicTacToe(myBox);
				String str = findMoveTicTacToe(myBox);
				System.out.println("Computer: "+str);
				insertTicTacToe(myBox, str, "O");
				printTicTacToe(myBox);
			}
		
			
		} else {
			
			
			for (int i = 0; i < 9; i++)
			{
				String input;
				String str = findMoveTicTacToe(myBox);
				System.out.println("Computer: "+str);
				insertTicTacToe(myBox, str, "O");
				printTicTacToe(myBox);
				checkTicTacToe(myBox);
				System.out.println("Pick your spot: ");
				input = String.valueOf(myScan.nextInt());
				insertTicTacToe(myBox, input, "X");
				printTicTacToe(myBox);
				checkTicTacToe(myBox);
				
			}
		
			
		}
		
		myScan.close();
		
	}

}
