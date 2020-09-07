// The "CPTTesting" class.
import java.awt.*;
import hsa.Console;

public class CPTTesting
{
    static Console c, d;          // The output console
    static int row, column = 0;
    static int rowPosition, columnPosition = 0;
    static int guessColumn, guessRow;
    static int numShips = 0;
    static int numShipsChoice = 1;
    static int numHit1, numHit2 = 0;
    static int x, y, z, a = 0;
    static int computerGuessColumn;
    static int computerGuessRow;
    static int guessColumnHit = 0;
    static int guessRowHit = 0;

    //why does it crash sometimes
    //why does it not say cpu sank ship
    //look into (guessColumn - 1 >= 1)

    public static void main (String[] args) throws InterruptedException
    {
	c = new Console (31, 58);
	c.setColour (Color.black);
	c.drawRect (0, 0, 800, 800);
	c.fillRect (0, 0, 800, 800);
	c.setTextBackgroundColor (Color.black);
	c.setTextColor (Color.white);

	int[] [] map1 = new int [11] [11];

	d = new Console (31, 58);
	int[] [] map2 = new int [11] [11];
	d.setColour (Color.black);
	d.drawRect (0, 0, 800, 800);
	d.fillRect (0, 0, 800, 800);
	d.setTextBackgroundColor (Color.black);
	d.setTextColor (Color.white);
	do
	{
	    displayPlayer2Graphics (map2);

	    numShips = numShips + 1;
	    int cursorLength = 5;
	    int cursorHeight = 23;

	    y = 0;
	    z = 0;

	    do
	    {

		x = x + 1;
		y = y + 1;
		z = z + 1;
		while (x > 1)
		{
		    displayPlayer2Graphics (map2);
		    buildPlayer2Ship (map2);

		}

		while (y == 1)
		{
		    cursorHeight = cursorHeight + 1;
		    d.setCursor (cursorHeight, cursorLength);
		    d.println ("Where would you like to put your ship?");
		    cursorHeight = cursorHeight + 1;
		    d.setCursor (cursorHeight, cursorLength);
		    d.println ("Please enter a column: ");
		    cursorHeight = cursorHeight + 1;
		    d.setCursor (cursorHeight, cursorLength);
		    column = d.readInt ();

		    cursorHeight = cursorHeight + 1;
		    d.setCursor (cursorHeight, cursorLength);
		    d.println ("Please enter a row ");
		    cursorHeight = cursorHeight + 1;
		    d.setCursor (cursorHeight, cursorLength);
		    row = d.readInt ();

		    checkPlayer2Valid (map2);

		    d.setCursor (cursorHeight, cursorLength);
		    break;
		}

		map2 [column] [row] = 1;

		columnPosition = column;
		rowPosition = row;

		d.clear ();

	    }
	    while (z < 2);
	}
	while (numShips < numShipsChoice);



	d.clear ();
	a = a + 1;
	displayPlayer2Graphics (map2);
	d.setCursor (23, 5);


	a = 0;
	x = 0;
	numShips = 0;

	do
	{
	    displayComputerGraphics (map1);

	    numShips = numShips + 1;
	    int cursorLength = 5;
	    int cursorHeight = 23;

	    y = 0;
	    z = 0;

	    do
	    {

		x = x + 1;
		y = y + 1;
		z = z + 1;
		while (x > 1)
		{
		    displayComputerGraphics (map1);
		    buildPlayer1Ship (map1);

		}

		while (y == 1)
		{
		    column = (int) (10 * Math.random () + 1);
		    row = (int) (10 * Math.random () + 1);
		    checkComputerValid (map1);

		    c.setCursor (cursorHeight, cursorLength);
		    break;

		}

		map1 [column] [row] = 1;

		columnPosition = column;
		rowPosition = row;

		c.clear ();

	    }
	    while (z < 2);
	}
	while (numShips < numShipsChoice);



	//c.clear ();
	a = a + 1;
	displayComputerGraphics (map1);





	d.clear ();
	c.clear ();
	displayPlayer2Graphics (map2);
	displayComputerGraphics (map1);


	d.setCursor (23, 5);
	d.println ("You have finished placing your ships.");
	d.println ("The game will now begin!");
	c.setCursor (23, 5);
	c.println ("The computer has finished placing his ships.");
	c.println ("The game will now begin!");



	do
	{


	    d.setCursor (25, 1);
	    d.println ("Please guess a column: ");
	    guessColumn = d.readInt ();
	    d.println ("Please guess a row: ");
	    guessRow = d.readInt ();
	    checkGuess2Valid (map2);

	    d.clear ();
	    c.clear ();
	    displayPlayer2Graphics (map2);
	    displayComputerGraphics (map1);


	    while (map1 [guessColumn] [guessRow] == 2 || map1 [guessColumn] [guessRow] == 3)
	    {
		d.clear ();
		displayPlayer2Graphics (map2);
		d.setCursor (24, 1);
		d.println ("You've already guessed this position.");
		d.println ("Please guess another column: ");
		guessColumn = d.readInt ();
		d.println ("Please guess another row: ");
		guessRow = d.readInt ();
		checkGuess2Valid (map2);


	    }


	    if (map1 [guessColumn] [guessRow] == 1)
	    {
		map1 [guessColumn] [guessRow] = 2;
		displayComputerGraphics (map1);
		c.setCursor (25, 1);
		c.println ("You hit your opponent's ship!");
		numHit1 = numHit1 + 1;
	    }
	    else
	    {
		map1 [guessColumn] [guessRow] = 3;
		displayComputerGraphics (map1);
		c.setCursor (25, 1);
		c.println ("You missed your opponent's ship!");

	    }
	    if (guessColumn + 1 <= 10 && guessColumn - 1 >= 1 && guessRow + 1 <= 10 && guessRow - 1 >= 1)
	    {
		if (map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn + 1] [guessRow] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn - 1] [guessRow] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn] [guessRow + 1] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn] [guessRow - 1] == 2)
		{

		    checkGuess2Valid (map2);
		    c.setCursor (26, 1);
		    c.println ("You sank your opponent's ship!");

		}
	    }
	    //d.println ("Now it's your opponent's turn!");

	    if (numHit1 >= (numShipsChoice * 2))
	    {
		break;
	    }

	    int m = 0;

	    if (map2 [computerGuessColumn] [computerGuessRow] == 2 && numHit2 == 1 || map2 [computerGuessColumn] [computerGuessRow] == 2 && numHit2 == 3 || map2 [computerGuessColumn] [computerGuessRow] == 2 && numHit2 == 5 || map2 [computerGuessColumn] [computerGuessRow] == 2 && numHit2 == 7 || map2 [computerGuessColumn] [computerGuessRow] == 2 && numHit2 == 9)
	    {
		int randomizer = (int) (4 * Math.random () + 1);
		if (randomizer == 1)
		{
		    guessColumn = computerGuessColumn + 1;
		    if (computerGuessColumn + 1 > 10)
		    {
			guessColumn = computerGuessColumn - 1;
		    }
		    guessRow = computerGuessRow;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 2)
		{
		    guessColumn = computerGuessColumn - 1;
		    if (computerGuessColumn - 1 < 1)
		    {
			guessColumn = computerGuessColumn + 1;
		    }
		    guessRow = computerGuessRow;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 3)
		{
		    guessRow = computerGuessRow + 1;
		    if (computerGuessRow + 1 > 10)
		    {
			guessRow = computerGuessRow - 1;
		    }
		    guessColumn = computerGuessColumn;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 4)
		{
		    guessRow = computerGuessRow - 1;
		    if (computerGuessRow - 1 < 1)
		    {
			guessRow = computerGuessRow + 1;
		    }
		    guessColumn = computerGuessColumn;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
	    }



	    if (m == 0)
	    {
		c.setCursor (25, 1);
		guessColumn = (int) (10 * Math.random () + 1);
		guessRow = (int) (10 * Math.random () + 1);
		  computerGuessColumn = guessColumn;
	    computerGuessRow = guessRow;
		// checkComputerGuessValid (map1);
		
		while (map2 [guessColumn] [guessRow] == 2 || map2 [guessColumn] [guessRow] == 3)
		{
		    guessColumn = (int) (10 * Math.random () + 1);
		    guessRow = (int) (10 * Math.random () + 1);
		      computerGuessColumn = guessColumn;
	    computerGuessRow = guessRow;
		}

	    }
	  

	    while (map2 [guessColumn] [guessRow] == 2 || map2 [guessColumn] [guessRow] == 3)
	    {
		// c.clear ();
		// displayComputerGraphics (map1);
		c.setCursor (24, 1);
		int randomizer = (int) (4 * Math.random () + 1);
		if (randomizer == 1)
		{
		    guessColumn = computerGuessColumn + 1;
		    if (computerGuessColumn + 1 > 10)
		    {
			guessColumn = computerGuessColumn - 1;
		    }
		    guessRow = computerGuessRow;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 2)
		{
		    guessColumn = computerGuessColumn - 1;
		    if (computerGuessColumn - 1 < 1)
		    {
			guessColumn = computerGuessColumn + 1;
		    }
		    guessRow = computerGuessRow;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 3)
		{
		    guessRow = computerGuessRow + 1;
		    if (computerGuessRow + 1 > 10)
		    {
			guessRow = computerGuessRow - 1;
		    }
		    guessColumn = computerGuessColumn;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}
		if (randomizer == 4)
		{
		    guessRow = computerGuessRow - 1;
		    if (computerGuessRow - 1 < 1)
		    {
			guessRow = computerGuessRow + 1;
		    }
		    guessColumn = computerGuessColumn;
		    // checkComputerGuessValid (map1);
		    m = 1;
		}

	    }
	    if (map2 [guessColumn] [guessRow] == 1)
	    {
		map2 [guessColumn] [guessRow] = 2;
		guessColumnHit = guessColumn;
		guessRowHit = guessRow;
		displayPlayer2Graphics (map2);
		c.setCursor (27, 1);
		c.println ("The computer has hit your ship!");
		numHit2 = numHit2 + 1;
	    }
	    else
	    {
		map2 [guessColumn] [guessRow] = 3;
		displayPlayer2Graphics (map2);
		c.setCursor (27, 1);
		c.println ("The computer missed your ship!");
	    }
	    if (guessColumn + 1 <= 10 && guessColumn - 1 >= 1 && guessRow + 1 <= 10 && guessRow - 1 >= 1)
	    {
		// if (map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit + 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit - 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit + 1] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit - 1] == 2)
	       if (map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit + 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit - 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit + 1] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit - 1] == 2)
		 {
		    c.setCursor (28, 1);
		    c.println ("The computer sank your ship!");
		    guessColumnHit = 0;
		    guessRowHit = 0;
		    // checkComputerGuessValid (map1);

		}
	    }
	    //c.println ("Now it's your opponent's turn!");


	    if (numHit2 >= (numShipsChoice * 2))
	    {
		break;
	    }


	    d.clear ();
	    displayPlayer2Graphics (map2);
	}
	while (true);

	c.clear ();
	d.clear ();
	if (numHit1 >= (numShipsChoice * 2))
	{
	    a = 0;
	    d.setCursor(24,10);
	    d.println ("YOU WIN!");
	    displayPlayer2Graphics (map2);
	    c.setCursor(24,10);
	    c.println ("THE COMPUTER LOST!");
	    displayComputerGraphics (map1);
	}
	if (numHit2 >= (numShipsChoice * 2))
	{
	    a = 2;
	    c.setCursor(24,10);
	    c.println ("THE COMPUTER WON!");
	    displayComputerGraphics (map1);
	    d.setCursor(24,10);
	    d.println ("YOU LOSE!");
	    displayPlayer2Graphics (map2);
	}

    }




    public static void displayComputerGraphics (int[] [] map1)
    {
	c.setCursor (1, 8);
	c.println ("1");
	c.setCursor (1, 13);
	c.println ("2");
	c.setCursor (1, 18);
	c.println ("3");
	c.setCursor (1, 23);
	c.println ("4");
	c.setCursor (1, 28);
	c.println ("5");
	c.setCursor (1, 33);
	c.println ("6");
	c.setCursor (1, 38);
	c.println ("7");
	c.setCursor (1, 43);
	c.println ("8");
	c.setCursor (1, 48);
	c.println ("9");
	c.setCursor (1, 52);
	c.println ("10");

	c.setCursor (3, 2);
	c.println ("1");
	c.setCursor (5, 2);
	c.println ("2");
	c.setCursor (7, 2);
	c.println ("3");
	c.setCursor (9, 2);
	c.println ("4");
	c.setCursor (11, 2);
	c.println ("5");
	c.setCursor (13, 2);
	c.println ("6");
	c.setCursor (15, 2);
	c.println ("7");
	c.setCursor (17, 2);
	c.println ("8");
	c.setCursor (19, 2);
	c.println ("9");
	c.setCursor (21, 2);
	c.println ("10");


	//c.fillOval (1, 1, 50 * map.length, 50 * map [0].length);

	for (int i = 1 ; i < map1.length ; i++)
	{
	    for (int j = 1 ; j < map1.length ; j++)
	    {
		c.setColor (Color.black);
		c.fillRect (i * 40, j * 40, 40, 40);
		if (map1 [i] [j] == 0)
		{
		    c.setColor (Color.white);

		}
		if (a == 0)
		{
		    if (map1 [i] [j] == 1)
		    {
			c.setColor (Color.white);


		    }
		}
		if (a == 1)
		{
		    if (map1 [i] [j] == 1)
		    {
			c.setColor (Color.white);


		    }
		}
		if (a == 2)
		{
		    if (map1 [i] [j] == 1)
		    {
			c.setColor (Color.yellow);


		    }
		}
		c.fillRect (i * 40, j * 40, 38, 38);

		if (map1 [i] [j] == 2)
		{
		    c.setColor (Color.white);
		    c.fillRect (i * 40, j * 40, 38, 38);
		    c.setColor (Color.red);
		    c.fillOval (i * 40, j * 40, 38, 38);
		}

		if (map1 [i] [j] == 3)
		{
		    c.setColor (Color.white);
		    c.fillRect (i * 40, j * 40, 38, 38);
		    c.setColor (Color.black);
		    c.fillOval (i * 40, j * 40, 38, 38);
		}
	    }
	}

    }


    public static void displayPlayer2Graphics (int[] [] map2)
    {
	d.setCursor (1, 8);
	d.println ("1");
	d.setCursor (1, 13);
	d.println ("2");
	d.setCursor (1, 18);
	d.println ("3");
	d.setCursor (1, 23);
	d.println ("4");
	d.setCursor (1, 28);
	d.println ("5");
	d.setCursor (1, 33);
	d.println ("6");
	d.setCursor (1, 38);
	d.println ("7");
	d.setCursor (1, 43);
	d.println ("8");
	d.setCursor (1, 48);
	d.println ("9");
	d.setCursor (1, 52);
	d.println ("10");

	d.setCursor (3, 2);
	d.println ("1");
	d.setCursor (5, 2);
	d.println ("2");
	d.setCursor (7, 2);
	d.println ("3");
	d.setCursor (9, 2);
	d.println ("4");
	d.setCursor (11, 2);
	d.println ("5");
	d.setCursor (13, 2);
	d.println ("6");
	d.setCursor (15, 2);
	d.println ("7");
	d.setCursor (17, 2);
	d.println ("8");
	d.setCursor (19, 2);
	d.println ("9");
	d.setCursor (21, 2);
	d.println ("10");


	//c.fillOval (1, 1, 50 * map.length, 50 * map [0].length);

	for (int i = 1 ; i < map2.length ; i++)
	{
	    for (int j = 1 ; j < map2.length ; j++)
	    {
		d.setColor (Color.black);
		d.fillRect (i * 40, j * 40, 40, 40);
		if (map2 [i] [j] == 0)
		{
		    d.setColor (Color.white);

		}
		if (a == 0)
		{
		    if (map2 [i] [j] == 1)
		    {
			d.setColor (Color.yellow);


		    }
		}
		if (a == 1)
		{
		    if (map2 [i] [j] == 1)
		    {
			d.setColor (Color.yellow);


		    }
		}
		d.fillRect (i * 40, j * 40, 38, 38);

		if (map2 [i] [j] == 2)
		{
		    d.setColor (Color.white);
		    d.fillRect (i * 40, j * 40, 38, 38);
		    d.setColor (Color.red);
		    d.fillOval (i * 40, j * 40, 38, 38);
		}

		if (map2 [i] [j] == 3)
		{
		    d.setColor (Color.white);
		    d.fillRect (i * 40, j * 40, 38, 38);
		    d.setColor (Color.black);
		    d.fillOval (i * 40, j * 40, 38, 38);
		}

	    }
	}
    }


    public static void buildComputerShip (int[] [] map1)
    {
	//why does (2,3) (5,4) work
	int cursorLength = 5;
	int cursorHeight = 23;
	if ((column == (columnPosition + 1)) && (row == rowPosition) || (column == (columnPosition - 1)) && (row == rowPosition) || (column == columnPosition) && (row == (rowPosition - 1)) || (column == columnPosition) && ((row == rowPosition + 1)))
	{
	    x = 0;

	}


	//Checks if the coordinates which the user has entered are adjacent to the most recently filled tile.
	else
	{

	    column = (int) (10 * Math.random () + 1);
	    row = (int) (10 * Math.random () + 1);
	    checkComputerValid (map1);
	    c.clear ();
	}


	// q--;
    }


    public static void buildPlayer2Ship (int[] [] map2)
    {
	//why does (2,3) (5,4) work
	int cursorLength = 5;
	int cursorHeight = 23;
	if ((column == (columnPosition + 1)) && (row == rowPosition) || (column == (columnPosition - 1)) && (row == rowPosition) || (column == columnPosition) && (row == (rowPosition - 1)) || (column == columnPosition) && ((row == rowPosition + 1)))
	{
	    x = 0;

	}


	//Checks if the coordinates which the user has entered are adjacent to the most recently filled tile.
	else
	{

	    cursorHeight = cursorHeight + 1;
	    d.setCursor (cursorHeight, cursorLength);
	    d.println ("Choose an adjacent tile to finish building your ship!");
	    cursorHeight = cursorHeight + 1;
	    d.setCursor (cursorHeight, cursorLength);
	    d.println ("Please enter a column: ");
	    cursorHeight = cursorHeight + 1;
	    d.setCursor (cursorHeight, cursorLength);
	    column = d.readInt ();
	    cursorHeight = cursorHeight + 1;
	    d.setCursor (cursorHeight, cursorLength);
	    d.println ("Please enter a row: ");
	    cursorHeight = cursorHeight + 1;
	    d.setCursor (cursorHeight, cursorLength);
	    row = d.readInt ();
	    checkPlayer2Valid (map2);
	    d.clear ();
	}


	// q--;
    }


    public static void checkComputerValid (int[] [] map1)
    {


	while (map1 [column] [row] == 1)
	{
	    c.clear ();
	    displayComputerGraphics (map1);
	    column = (int) (10 * Math.random () + 1);
	    row = (int) (10 * Math.random () + 1);
	}

    }


    public static void checkPlayer2Valid (int[] [] map2)
    {

	while (column > 10 || column <= 0)
	{
	    d.println ("Please re-enter a column: ");
	    column = d.readInt ();
	}


	while (row > 10 || row <= 0)
	{
	    d.println ("Please re-enter a row: ");
	    row = d.readInt ();
	}
	while (map2 [column] [row] == 1)
	{
	    d.clear ();
	    displayPlayer2Graphics (map2);
	    d.setCursor (23, 1);
	    d.println ("You already have a ship there.");
	    d.println ("Please re-enter a column: ");
	    column = d.readInt ();
	    d.println ("Please re-enter a row: ");
	    row = d.readInt ();
	}

    }


    // public static void checkComputerGuessValid (int[] [] map1)
    // {
    //     while (guessColumn > 10 || guessColumn <= 0)
    //     {
    //         column = (int) (10 * Math.random () + 1);
    // 
    //     }
    // 
    // 
    //     while (guessRow > 10 || guessRow <= 0)
    //     {
    // 
    //         row = (int) (10 * Math.random () + 1);
    // 
    //     }
    // }


    public static void checkGuess2Valid (int[] [] map2)
    {
	while (guessColumn > 10 || guessColumn <= 0)
	{
	    d.println ("Please re-enter a column: ");
	    guessColumn = d.readInt ();
	}


	while (guessRow > 10 || guessRow <= 0)
	{
	    d.println ("Please re-enter a row: ");
	    guessRow = d.readInt ();
	}
    }





    // public static voInt ();
    //id insertBattleship (int [][] map)
    // {
    //     c.setCursor (24,2);
    //     c.println("Please insert your 1 by 1 ship:");
    // }



    // public static void display (int[] [] map)
    // {
    //     for (int i = 0 ; i < map.length ; i++)
    //     {
    //         for (int j = 0 ; j < map.length ; j++)
    //         {
    //             d.print (map [i] [j] + "    ");
    //         }
    //         d.println (" ");
    //
    //     }
    //     d.println ("______________________");
    // }
    // Place your program here.  'c' is the output console
    // main method
    // CPT class


	
    // Place your program here.  'c' is the output console
} // main method
// CPTTesting class
