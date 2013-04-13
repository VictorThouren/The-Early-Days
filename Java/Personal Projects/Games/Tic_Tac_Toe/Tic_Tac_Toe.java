/*
Aaron Crosley
03-07-10
*/

import java.util.Scanner;


class Tic_Tac_Toe
{
	public static void main(String[] args)
	{		
		int player = 1;
		int Xmove = 0;
		int Ymove = 0;		
		boolean Xwin = false;
		boolean Owin = false;
		boolean stalemate = false;
		boolean coormatchcomplete = false;

		Scanner keyb = new Scanner(System.in);

		System.out.println("|----------------------------------|");
		System.out.println("|-----------Tic Tac Toe------------|");
		System.out.println("|----------------------------------|\n\n");

		String x1y3 = "_"; String x2y3 = "_"; String x3y3 = "_";						//*
		String x1y2 = "_"; String x2y2 = "_"; String x3y2 = "_";						//* These Strings make up the actual playing board
		String x1y1 = "_"; String x2y1 = "_"; String x3y1 = "_";						//*

		System.out.println("              " + x1y3 + " " + x2y3 + " " + x3y3); 			//*
		System.out.println("              " + x1y2 + " " + x2y2 + " " + x3y2);			//* Prints the playing board to the console
		System.out.println("              " + x1y1 + " " + x2y1 + " " + x3y1 + "\n");	//*

			while(Owin == false && Xwin == false && stalemate == false)
			{
				if(Owin == false && Xwin == false && stalemate == false){
					if
					(
						x1y1.equalsIgnoreCase("X") && x1y2.equalsIgnoreCase("X") && x1y3.equalsIgnoreCase("X")
						||
						x1y3.equalsIgnoreCase("X") && x2y3.equalsIgnoreCase("X") && x3y3.equalsIgnoreCase("X")
						||
						x2y1.equalsIgnoreCase("X") && x2y2.equalsIgnoreCase("X") && x2y3.equalsIgnoreCase("X")
						||
						x3y1.equalsIgnoreCase("X") && x3y2.equalsIgnoreCase("X") && x3y3.equalsIgnoreCase("X")
						||
						x1y1.equalsIgnoreCase("X") && x1y2.equalsIgnoreCase("X") && x1y3.equalsIgnoreCase("X")
						||
						x1y2.equalsIgnoreCase("X") && x2y2.equalsIgnoreCase("X") && x3y2.equalsIgnoreCase("X")
						||
						x1y1.equalsIgnoreCase("X") && x2y1.equalsIgnoreCase("X") && x3y1.equalsIgnoreCase("X")
						||
						x1y1.equalsIgnoreCase("X") && x2y2.equalsIgnoreCase("X") && x3y3.equalsIgnoreCase("X")
						||
						x1y3.equalsIgnoreCase("X") && x2y2.equalsIgnoreCase("X") && x3y1.equalsIgnoreCase("X")
					){
						Xwin = true;
						}
					else if
					(
						x1y1.equalsIgnoreCase("O") && x1y2.equalsIgnoreCase("O") && x1y3.equalsIgnoreCase("O")
						||
						x1y3.equalsIgnoreCase("O") && x2y3.equalsIgnoreCase("O") && x3y3.equalsIgnoreCase("O")
						||
						x2y1.equalsIgnoreCase("O") && x2y2.equalsIgnoreCase("O") && x2y3.equalsIgnoreCase("O")
						||
						x3y1.equalsIgnoreCase("O") && x3y2.equalsIgnoreCase("O") && x3y3.equalsIgnoreCase("O")
						||
						x1y1.equalsIgnoreCase("O") && x1y2.equalsIgnoreCase("O") && x1y3.equalsIgnoreCase("O")
						||
						x1y2.equalsIgnoreCase("O") && x2y2.equalsIgnoreCase("O") && x3y2.equalsIgnoreCase("O")
						||
						x1y1.equalsIgnoreCase("O") && x2y1.equalsIgnoreCase("O") && x3y1.equalsIgnoreCase("O")
						||
						x1y1.equalsIgnoreCase("O") && x2y2.equalsIgnoreCase("O") && x3y3.equalsIgnoreCase("O")
						||
						x1y3.equalsIgnoreCase("O") && x2y2.equalsIgnoreCase("O") && x3y1.equalsIgnoreCase("O")
					){
						Owin = true;
						}
					else if(Owin == false && Xwin == false && stalemate == false){
						Xwin = false;
						Owin = false;
						stalemate = false;
					}
					else{

						System.out.println("\nERROR: VICTORY CONDITION TEST ROUTINE\n");
					}
			}

			if(player == 1)
			{
				coormatchcomplete = false;
				System.out.println("              " + x1y3 + " " + x2y3 + " " + x3y3); 			//*
				System.out.println("              " + x1y2 + " " + x2y2 + " " + x3y2);			//* Prints the playing board to the console
				System.out.println("              " + x1y1 + " " + x2y1 + " " + x3y1 + "\n");	//*

				System.out.print("Player 1 move: ");
				Xmove = keyb.nextInt();
				System.out.print(", ");
				Ymove = keyb.nextInt();

				while(coormatchcomplete == false)
				{
					if(Xmove == 1 && Ymove == 1)
					{
						if(x1y1.equalsIgnoreCase("X") || x1y1.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x1y1 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 1 && Ymove == 2)
					{
						if(x1y2.equalsIgnoreCase("X") || x1y2.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x1y2 = "X"; //Replace with O for player 2
					}
					else if(Xmove == 1 && Ymove == 3)
					{
						if(x1y3.equalsIgnoreCase("X") || x1y3.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x1y3 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 2 && Ymove == 1)
					{
						if(x2y1.equalsIgnoreCase("X") || x2y1.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x2y1 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 2 && Ymove == 2)
					{
						if(x2y2.equalsIgnoreCase("X") || x2y2.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x2y2 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 2 && Ymove == 3)
					{
						if(x2y3.equalsIgnoreCase("X") || x2y3.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x2y3 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 3 && Ymove == 1)
					{
						if(x3y1.equalsIgnoreCase("X") || x3y1.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x3y1 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 3 && Ymove == 2)
					{
						if(x3y2.equalsIgnoreCase("X") || x3y2.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x3y2 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove == 3 && Ymove == 3)
					{
						if(x3y2.equalsIgnoreCase("X") || x3y2.equalsIgnoreCase("Y"))
						{
							System.out.println("Invalid Move; make new selection\n");
							Xmove = keyb.nextInt();
							System.out.print(", ");
							Ymove = keyb.nextInt();
						}

						x3y3 = "X"; //Replace with O for player 2
						coormatchcomplete = true;
					}
					else if(Xmove < 1 || Xmove > 3)
					{
						System.out.println("Invalid Move; make new selection\n");
						Xmove = keyb.nextInt();
						System.out.print(", ");
						Ymove = keyb.nextInt();
					}
					else if(Ymove < 1 || Ymove > 3)
					{
						System.out.println("Invalid Move; make new selection\n");
						Xmove = keyb.nextInt();
						System.out.print(", ");
						Ymove = keyb.nextInt();
					}
					else
					{
						System.out.println("ERROR: COORDINATE MATCHING ROUTINE\n");
					}
				}//End of while loop


				}
				if(player == 2)
				{
					coormatchcomplete = false;
					System.out.println("              " + x1y3 + " " + x2y3 + " " + x3y3); 			//*
					System.out.println("              " + x1y2 + " " + x2y2 + " " + x3y2);			//* Prints the playing board to the console
					System.out.println("              " + x1y1 + " " + x2y1 + " " + x3y1 + "\n");	//*

					System.out.print("Player 2 move: ");
					Xmove = keyb.nextInt();
					System.out.print(", ");
					Ymove = keyb.nextInt();

					while(coormatchcomplete == false)
										{
											if(Xmove == 1 && Ymove == 1)
											{
												if(x1y1.equalsIgnoreCase("X") || x1y1.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x1y1 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 1 && Ymove == 2)
											{
												if(x1y2.equalsIgnoreCase("X") || x1y2.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x1y2 = "O"; //Replace with O for player 2
											}
											else if(Xmove == 1 && Ymove == 3)
											{
												if(x1y3.equalsIgnoreCase("X") || x1y3.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x1y3 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 2 && Ymove == 1)
											{
												if(x2y1.equalsIgnoreCase("X") || x2y1.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x2y1 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 2 && Ymove == 2)
											{
												if(x2y2.equalsIgnoreCase("X") || x2y2.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x2y2 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 2 && Ymove == 3)
											{
												if(x2y3.equalsIgnoreCase("X") || x2y3.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x2y3 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 3 && Ymove == 1)
											{
												if(x3y1.equalsIgnoreCase("X") || x3y1.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x3y1 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 3 && Ymove == 2)
											{
												if(x3y2.equalsIgnoreCase("X") || x3y2.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x3y2 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}
											else if(Xmove == 3 && Ymove == 3)
											{
												if(x3y2.equalsIgnoreCase("X") || x3y2.equalsIgnoreCase("Y"))
												{
													System.out.println("Invalid Move; make new selection\n");
													Xmove = keyb.nextInt();
													System.out.print(", ");
													Ymove = keyb.nextInt();
												}

												x3y3 = "O"; //Replace with O for player 2
												coormatchcomplete = true;
											}

											else
											{
												System.out.println("ERROR: COORDINATE MATCHING ROUTINE\n");
											}
					}//End of COORMATCH while loop

				}





			if(player == 1)
			{
				player = 2;
			}
			if(player == 2)
			{
				player = 1;
			}
			else
			{
				System.out.println("ERROR: PLAYER CHANGE ROUTINE\n");
			}



		}//End of MAIN while loop

		if(Xwin == true)
		{
			System.out.println("Player 1 wins");
		}
		if(Owin == true)
		{
			System.out.println("Player 2 wins");
		}
		if(stalemate == true)
		{
			System.out.println("Stalemate");
		}
		else
		{
			System.out.println("ERROR: ENDGAME ROUTINE");
		}



	}//End of method main
}//End of class Tic_Tac_Toe



