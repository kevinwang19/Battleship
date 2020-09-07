// Kevin Wang
// Mr. Morrison
// ICS 3UI
// December 27, 2018
// Last Updated January 20, 2019
// CPT: Battleship

import java.awt.*;
import hsa.Console;

public class CPT
{
    static Console c, d;
    static int row, column = 0;
    static int rowPosition, columnPosition = 0;
    static int guessColumn, guessRow;
    static int numShips = 0;
    static int numShipsChoice;
    static int numHit1, numHit2 = 0;
    static int x, y, z, a = 0;
    static int gameMode = 0;
    static int computerGuessColumn;
    static int computerGuessRow;
    static int guessColumnHit = 0;
    static int guessRowHit = 0;

    public static void main (String[] args) throws InterruptedException
    {
	c = new Console (31, 58);

	int[] [] map1 = new int [11] [11];

	int menu = 0;

	c.setColour (Color.black);
	c.drawRect (0, 0, 800, 800);
	c.fillRect (0, 0, 800, 800);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 10));
	c.setColour (Color.white);
	c.drawString ("W", 90, 100);
	Thread.sleep (90);
	c.drawString ("E", 120, 100);
	Thread.sleep (90);
	c.drawString ("L", 150, 100);
	Thread.sleep (90);
	c.drawString ("C", 180, 100);
	Thread.sleep (90);
	c.drawString ("O", 210, 100);
	Thread.sleep (90);
	c.drawString ("M", 240, 100);
	Thread.sleep (90);
	c.drawString ("E", 270, 100);
	Thread.sleep (90);
	c.drawString ("", 300, 100);
	Thread.sleep (90);
	c.drawString ("T", 330, 100);
	Thread.sleep (90);
	c.drawString ("O", 360, 100);
	Thread.sleep (90);
	c.drawString ("", 390, 100);
	Thread.sleep (90);
	c.drawString (".", 400, 100);
	Thread.sleep (90);
	c.drawString (".", 410, 100);
	Thread.sleep (90);
	c.drawString (".", 420, 100);
	Thread.sleep (400);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 70));
	c.setColour (Color.white);
	c.drawString ("B", 10, 200);
	Thread.sleep (90);
	c.drawString ("A", 85, 200);
	Thread.sleep (90);
	c.drawString ("T", 160, 200);
	Thread.sleep (90);
	c.drawString ("T", 235, 200);
	Thread.sleep (90);
	c.drawString ("L", 310, 200);
	Thread.sleep (90);
	c.drawString ("E", 385, 200);
	Thread.sleep (90);
	c.drawString ("S", 100, 300);
	Thread.sleep (90);
	c.drawString ("H", 165, 300);
	Thread.sleep (90);
	c.drawString ("I", 250, 300);
	Thread.sleep (90);
	c.drawString ("P", 310, 300);
	Thread.sleep (90);


	Thread.sleep (300);
	c.setColor (Color.white);
	c.fillRect (249, 379, 5, 5);
	Thread.sleep (100);
	c.fillRect (248, 380, 8, 5);
	Thread.sleep (100);
	c.fillRect (245, 385, 15, 5);
	Thread.sleep (100);
	c.fillRect (248, 386, 8, 15);
	Thread.sleep (100);
	c.fillRect (245, 399, 15, 5);
	Thread.sleep (100);
	c.fillRect (246, 398, 14, 5);
	Thread.sleep (100);
	c.fillRect (247, 398, 13, 5);
	Thread.sleep (100);
	c.fillRect (120, 397, 20, 5);
	c.fillRect (147, 395, 15, 5);
	c.fillRect (170, 399, 5, 5);
	c.fillRect (171, 398, 5, 6);
	c.fillRect (172, 397, 5, 7);
	c.fillRect (173, 396, 5, 8);
	c.fillRect (174, 395, 5, 9);
	c.fillRect (175, 394, 5, 5);
	c.fillRect (176, 393, 5, 11);
	c.fillRect (177, 392, 5, 12);
	c.fillRect (178, 391, 5, 13);
	c.fillRect (180, 390, 30, 13);
	c.fillRect (210, 390, 5, 10);
	c.fillRect (211, 392, 5, 8);
	c.fillRect (212, 394, 5, 6);
	c.fillRect (213, 396, 5, 4);
	c.fillRect (214, 398, 5, 2);
	c.fillRect (225, 390, 15, 10);
	c.fillRect (280, 395, 15, 8);
	c.fillRect (285, 391, 5, 5);
	c.fillRect (310, 398, 20, 5);
	Thread.sleep (100);
	c.fillRect (100, 400, 250, 5);
	Thread.sleep (100);
	c.fillRect (101, 401, 248, 5);
	Thread.sleep (100);
	c.fillRect (102, 402, 246, 5);
	Thread.sleep (100);
	c.fillRect (103, 403, 244, 5);
	Thread.sleep (100);
	c.fillRect (104, 404, 242, 5);
	Thread.sleep (100);
	c.fillRect (105, 405, 240, 5);
	Thread.sleep (100);
	c.fillRect (106, 406, 238, 5);
	Thread.sleep (100);
	c.fillRect (107, 407, 236, 5);
	Thread.sleep (100);
	c.fillRect (108, 408, 234, 5);
	Thread.sleep (100);
	c.fillRect (109, 409, 232, 5);
	Thread.sleep (100);
	c.fillRect (110, 410, 230, 5);
	Thread.sleep (100);
	c.fillRect (111, 411, 228, 5);
	Thread.sleep (100);
	c.fillRect (112, 412, 226, 5);
	Thread.sleep (100);
	c.fillRect (113, 413, 224, 5);
	Thread.sleep (100);
	c.fillRect (114, 414, 222, 5);
	Thread.sleep (100);
	c.fillRect (115, 415, 220, 5);
	Thread.sleep (100);
	c.fillRect (116, 416, 218, 5);
	Thread.sleep (100);
	c.fillRect (117, 417, 217, 5);
	Thread.sleep (100);
	c.fillRect (118, 418, 216, 5);
	Thread.sleep (100);
	c.fillRect (119, 419, 215, 5);
	Thread.sleep (100);
	c.fillRect (120, 420, 214, 5);
	Thread.sleep (100);
	c.fillRect (121, 421, 213, 5);
	Thread.sleep (100);
	c.fillRect (121, 421, 213, 5);
	Thread.sleep (100);
	c.fillRect (121, 421, 213, 5);
	Thread.sleep (100);

	c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	c.setColour (Color.white);
	c.drawString ("E", 10, 500);
	Thread.sleep (50);
	c.drawString ("N", 40, 500);
	Thread.sleep (50);
	c.drawString ("T", 70, 500);
	Thread.sleep (50);
	c.drawString ("E", 100, 500);
	Thread.sleep (50);
	c.drawString ("R", 130, 500);
	Thread.sleep (50);
	c.drawString ("", 160, 500);
	Thread.sleep (50);
	c.drawString ("1", 190, 500);
	Thread.sleep (50);
	c.drawString ("", 220, 500);
	Thread.sleep (50);
	c.drawString ("T", 250, 500);
	Thread.sleep (50);
	c.drawString ("O", 280, 500);
	Thread.sleep (50);
	c.drawString ("", 310, 500);
	Thread.sleep (50);
	c.drawString ("P", 340, 500);
	Thread.sleep (50);
	c.drawString ("L", 370, 500);
	Thread.sleep (50);
	c.drawString ("A", 400, 500);
	Thread.sleep (50);
	c.drawString ("Y", 430, 500);

	c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	c.setColour (Color.white);
	c.drawString ("E", 10, 550);
	Thread.sleep (50);
	c.drawString ("N", 28, 550);
	Thread.sleep (50);
	c.drawString ("T", 46, 550);
	Thread.sleep (50);
	c.drawString ("E", 64, 550);
	Thread.sleep (50);
	c.drawString ("R", 82, 550);
	Thread.sleep (50);
	c.drawString ("", 100, 550);
	Thread.sleep (50);
	c.drawString ("2", 118, 550);
	Thread.sleep (50);
	c.drawString ("", 136, 550);
	Thread.sleep (50);
	c.drawString ("F", 154, 550);
	Thread.sleep (50);
	c.drawString ("O", 172, 550);
	Thread.sleep (50);
	c.drawString ("R", 190, 550);
	Thread.sleep (50);
	c.drawString ("", 208, 550);
	Thread.sleep (50);
	c.drawString ("I", 226, 550);
	Thread.sleep (50);
	c.drawString ("N", 244, 550);
	Thread.sleep (50);
	c.drawString ("S", 262, 550);
	Thread.sleep (50);
	c.drawString ("T", 280, 550);
	Thread.sleep (50);
	c.drawString ("R", 298, 550);
	Thread.sleep (50);
	c.drawString ("U", 316, 550);
	Thread.sleep (50);
	c.drawString ("C", 334, 550);
	Thread.sleep (50);
	c.drawString ("T", 352, 550);
	Thread.sleep (50);
	c.drawString ("I", 370, 550);
	Thread.sleep (50);
	c.drawString ("O", 388, 550);
	Thread.sleep (50);
	c.drawString ("N", 406, 550);
	Thread.sleep (50);
	c.drawString ("S", 424, 550);

	c.setTextBackgroundColor (Color.black);
	c.setTextColor (Color.white);
	c.setCursor (30, 30);
	menu = c.readInt ();

	while (menu != 1 && menu != 2)
	{
	    c.println ("Invalid entry. Please try again.");
	    menu = c.readInt ();
	}

	if (menu == 1)
	{
	    c.clear ();
	}

	if (menu == 2)
	{
	    c.clear ();
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 15));
	    c.drawString ("SINGLE PLAYER: ", 50, 30);
	    c.drawString ("- ", 28, 55);
	    c.drawString ("- ", 28, 75);
	    c.drawString ("- ", 28, 115);
	    c.drawString ("- ", 28, 135);
	    c.drawString ("- ", 28, 195);
	    c.drawString ("MULTIPLAYER: ", 50, 275);
	    c.drawString ("- ", 28, 300);
	    c.drawString ("- ", 28, 320);
	    c.drawString ("- ", 28, 360);
	    c.drawString ("- ", 28, 400);
	    c.drawString ("- ", 28, 440);
	    c.drawString ("- ", 28, 500);

	    c.setFont (new Font ("Times New Roman", Font.BOLD, 11));
	    Thread.sleep (500);
	    c.drawString ("YOU ARE FACING OFF AGAINST THE COMPUTER", 48, 55);
	    Thread.sleep (500);
	    c.drawString ("YOU WILL START THE GAME BY CHOOSING THE NUMBER OF SHIPS ", 48, 75);
	    c.drawString ("YOU WOULD LIKE TO PLAY WITH", 48, 95);
	    Thread.sleep (500);
	    c.drawString ("YOU WILL THEN PLACE YOUR BATTLESHIPS ON THE MAP", 48, 115);
	    Thread.sleep (500);
	    c.drawString ("THE SHIPS ARE 2-PIECE BLOCKS, MEANING EVERY TIME YOU BUILD A ", 48, 135);
	    c.drawString ("NEW SHIP, YOU MUST PLACE AN ADJACENT BLOCK TO FINISH", 48, 155);
	    c.drawString ("BUILDING YOUR SHIP", 48, 175);
	    Thread.sleep (500);
	    c.drawString ("YOU AND THE COMPUTER WILL TAKE TURNS GUESSING WHERE THE ", 48, 195);
	    c.drawString ("OTHER'S SHIPS ARE, UNTIL SOMEONE WINS BY SINKING ALL THE", 48, 215);
	    c.drawString ("SHIPS OF THE OPPONENT", 48, 235);

	    c.setFont (new Font ("Times New Roman", Font.BOLD, 11));
	    Thread.sleep (500);
	    c.drawString ("TWO PLAYERS ARE FACING OFF AGAINST EACH OTHER", 48, 300);
	    Thread.sleep (500);
	    c.drawString ("THEY WILL START THE GAME BY CHOOSING THE NUMBER OF SHIPS ", 48, 320);
	    c.drawString ("THEY WOULD LIKE TO PLAY WITH", 48, 340);
	    Thread.sleep (500);
	    c.drawString ("ONE PLAYER WILL THEN PLACE THEIR BATTLESHIPS ON THE MAP", 48, 360);
	    c.drawString ("WHILE THE OTHER LOOKS AWAY", 48, 380);
	    Thread.sleep (500);
	    c.drawString ("ONCE HE/SHE IS DONE, HE/SHE WILL LOOK AWAY WHILE THE ", 48, 400);
	    c.drawString ("OTHER PLAYER PLACES HIS/HER SHIPS", 48, 420);
	    Thread.sleep (500);
	    c.drawString ("THE SHIPS ARE 2-PIECE BLOCKS, MEANING EVERY TIME A SHIP", 48, 440);
	    c.drawString ("IS BUILT, AN ADJACENT BLOCK MUST BE PLACED TO FINISH", 48, 460);
	    c.drawString ("BUILDING THE SHIP", 48, 480);
	    Thread.sleep (500);
	    c.drawString ("THE TWO PLAYERS WILL TAKE TURNS GUESSING WHERE THE ", 48, 500);
	    c.drawString ("OTHER'S SHIPS ARE, UNTIL SOMEONE WINS BY SINKING ALL THE", 48, 520);
	    c.drawString ("SHIPS OF THE OPPONENT", 48, 540);

	    c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	    c.setColour (Color.white);
	    c.drawString ("E", 10, 570);
	    Thread.sleep (50);
	    c.drawString ("N", 40, 570);
	    Thread.sleep (50);
	    c.drawString ("T", 70, 570);
	    Thread.sleep (50);
	    c.drawString ("E", 100, 570);
	    Thread.sleep (50);
	    c.drawString ("R", 130, 570);
	    Thread.sleep (50);
	    c.drawString ("", 160, 570);
	    Thread.sleep (50);
	    c.drawString ("1", 190, 570);
	    Thread.sleep (50);
	    c.drawString ("", 220, 570);
	    Thread.sleep (50);
	    c.drawString ("T", 250, 570);
	    Thread.sleep (50);
	    c.drawString ("O", 280, 570);
	    Thread.sleep (50);
	    c.drawString ("", 310, 570);
	    Thread.sleep (50);
	    c.drawString ("P", 340, 570);
	    Thread.sleep (50);
	    c.drawString ("L", 370, 570);
	    Thread.sleep (50);
	    c.drawString ("A", 400, 570);
	    Thread.sleep (50);
	    c.drawString ("Y", 430, 570);
	    c.setCursor (30, 30);
	    menu = c.readInt ();
	    while (menu != 1)
	    {
		c.println ("Invalid entry. Please try again.");
		menu = c.readInt ();
	    }
	    if (menu == 1)
	    {
		c.clear ();
	    }
	}
	c.clear ();
	c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	c.setColour (Color.white);
	c.drawString ("W", 28, 50);
	Thread.sleep (50);
	c.drawString ("O", 46, 50);
	Thread.sleep (50);
	c.drawString ("U", 64, 50);
	Thread.sleep (50);
	c.drawString ("L", 82, 50);
	Thread.sleep (50);
	c.drawString ("D", 100, 50);
	Thread.sleep (50);
	c.drawString ("", 118, 50);
	Thread.sleep (50);
	c.drawString ("Y", 136, 50);
	Thread.sleep (50);
	c.drawString ("O", 154, 50);
	Thread.sleep (50);
	c.drawString ("U", 172, 50);
	Thread.sleep (50);
	c.drawString ("", 190, 50);
	Thread.sleep (50);
	c.drawString ("L", 208, 50);
	Thread.sleep (50);
	c.drawString ("I", 226, 50);
	Thread.sleep (50);
	c.drawString ("K", 244, 50);
	Thread.sleep (50);
	c.drawString ("E", 262, 50);
	Thread.sleep (50);
	c.drawString ("", 280, 50);
	Thread.sleep (50);
	c.drawString ("T", 298, 50);
	Thread.sleep (50);
	c.drawString ("O", 316, 50);
	Thread.sleep (50);
	c.drawString ("", 334, 50);
	Thread.sleep (50);
	c.drawString ("P", 352, 50);
	Thread.sleep (50);
	c.drawString ("L", 370, 50);
	Thread.sleep (50);
	c.drawString ("A", 388, 50);
	Thread.sleep (50);
	c.drawString ("Y", 406, 50);
	Thread.sleep (50);
	c.drawString ("", 424, 50);
	Thread.sleep (50);
	c.drawString ("T", 28, 100);
	Thread.sleep (50);
	c.drawString ("H", 46, 100);
	Thread.sleep (50);
	c.drawString ("E", 64, 100);
	Thread.sleep (50);
	c.drawString ("", 82, 100);
	Thread.sleep (50);
	c.drawString ("S", 100, 100);
	Thread.sleep (50);
	c.drawString ("I", 118, 100);
	Thread.sleep (50);
	c.drawString ("N", 136, 100);
	Thread.sleep (50);
	c.drawString ("G", 154, 100);
	Thread.sleep (50);
	c.drawString ("L", 172, 100);
	Thread.sleep (50);
	c.drawString ("E", 190, 100);
	Thread.sleep (50);
	c.drawString ("", 208, 100);
	Thread.sleep (50);
	c.drawString ("P", 226, 100);
	Thread.sleep (50);
	c.drawString ("L", 244, 100);
	Thread.sleep (50);
	c.drawString ("A", 262, 100);
	Thread.sleep (50);
	c.drawString ("Y", 280, 100);
	Thread.sleep (50);
	c.drawString ("E", 298, 100);
	Thread.sleep (50);
	c.drawString ("R", 316, 100);
	Thread.sleep (50);
	c.drawString ("", 334, 100);
	Thread.sleep (50);
	c.drawString ("M", 352, 100);
	Thread.sleep (50);
	c.drawString ("O", 370, 100);
	Thread.sleep (50);
	c.drawString ("D", 388, 100);
	Thread.sleep (50);
	c.drawString ("E", 406, 100);
	Thread.sleep (50);
	c.drawString ("", 424, 100);
	Thread.sleep (50);
	c.drawString ("O", 28, 150);
	Thread.sleep (50);
	c.drawString ("R", 46, 150);
	Thread.sleep (50);
	c.drawString ("", 64, 150);
	Thread.sleep (50);
	c.drawString ("T", 82, 150);
	Thread.sleep (50);
	c.drawString ("H", 100, 150);
	Thread.sleep (50);
	c.drawString ("E", 118, 150);
	Thread.sleep (50);
	c.drawString ("", 136, 150);
	Thread.sleep (50);
	c.drawString ("M", 154, 150);
	Thread.sleep (50);
	c.drawString ("U", 172, 150);
	Thread.sleep (50);
	c.drawString ("L", 190, 150);
	Thread.sleep (50);
	c.drawString ("T", 208, 150);
	Thread.sleep (50);
	c.drawString ("I", 226, 150);
	Thread.sleep (50);
	c.drawString ("P", 244, 150);
	Thread.sleep (50);
	c.drawString ("L", 262, 150);
	Thread.sleep (50);
	c.drawString ("A", 280, 150);
	Thread.sleep (50);
	c.drawString ("Y", 298, 150);
	Thread.sleep (50);
	c.drawString ("E", 316, 150);
	Thread.sleep (50);
	c.drawString ("R", 334, 150);
	Thread.sleep (50);
	c.drawString ("", 352, 150);
	Thread.sleep (50);
	c.drawString ("M", 370, 150);
	Thread.sleep (50);
	c.drawString ("O", 388, 150);
	Thread.sleep (50);
	c.drawString ("D", 406, 150);
	Thread.sleep (50);
	c.drawString ("E", 424, 150);
	Thread.sleep (50);
	c.drawString ("?", 442, 150);

	c.setFont (new Font ("Times New Roman", Font.BOLD, 11));
	c.drawString ("E", 28, 250);
	Thread.sleep (50);
	c.drawString ("N", 43, 250);
	Thread.sleep (50);
	c.drawString ("T", 58, 250);
	Thread.sleep (50);
	c.drawString ("E", 73, 250);
	Thread.sleep (50);
	c.drawString ("R", 88, 250);
	Thread.sleep (50);
	c.drawString ("", 103, 250);
	Thread.sleep (50);
	c.drawString ("1", 118, 250);
	Thread.sleep (50);
	c.drawString ("", 133, 250);
	Thread.sleep (50);
	c.drawString ("F", 148, 250);
	Thread.sleep (50);
	c.drawString ("O", 163, 250);
	Thread.sleep (50);
	c.drawString ("R", 178, 250);
	Thread.sleep (50);
	c.drawString ("", 193, 250);
	Thread.sleep (50);
	c.drawString ("S", 208, 250);
	Thread.sleep (50);
	c.drawString ("I", 223, 250);
	Thread.sleep (50);
	c.drawString ("N", 238, 250);
	Thread.sleep (50);
	c.drawString ("G", 253, 250);
	Thread.sleep (50);
	c.drawString ("L", 268, 250);
	Thread.sleep (50);
	c.drawString ("E", 283, 250);
	Thread.sleep (50);
	c.drawString ("", 298, 250);
	Thread.sleep (50);
	c.drawString ("P", 313, 250);
	Thread.sleep (50);
	c.drawString ("L", 328, 250);
	Thread.sleep (50);
	c.drawString ("A", 343, 250);
	Thread.sleep (50);
	c.drawString ("Y", 358, 250);
	Thread.sleep (50);
	c.drawString ("E", 373, 250);
	Thread.sleep (50);
	c.drawString ("R", 388, 250);
	Thread.sleep (50);
	c.drawString (".", 403, 250);
	Thread.sleep (50);

	c.drawString ("E", 28, 275);
	Thread.sleep (50);
	c.drawString ("N", 43, 275);
	Thread.sleep (50);
	c.drawString ("T", 58, 275);
	Thread.sleep (50);
	c.drawString ("E", 73, 275);
	Thread.sleep (50);
	c.drawString ("R", 88, 275);
	Thread.sleep (50);
	c.drawString ("", 103, 275);
	Thread.sleep (50);
	c.drawString ("2", 118, 275);
	Thread.sleep (50);
	c.drawString ("", 133, 275);
	Thread.sleep (50);
	c.drawString ("F", 148, 275);
	Thread.sleep (50);
	c.drawString ("O", 163, 275);
	Thread.sleep (50);
	c.drawString ("R", 178, 275);
	Thread.sleep (50);
	c.drawString ("", 193, 275);
	Thread.sleep (50);
	c.drawString ("M", 208, 275);
	Thread.sleep (50);
	c.drawString ("U", 223, 275);
	Thread.sleep (50);
	c.drawString ("L", 238, 275);
	Thread.sleep (50);
	c.drawString ("T", 253, 275);
	Thread.sleep (50);
	c.drawString ("I", 268, 275);
	Thread.sleep (50);
	c.drawString ("P", 283, 275);
	Thread.sleep (50);
	c.drawString ("L", 298, 275);
	Thread.sleep (50);
	c.drawString ("A", 313, 275);
	Thread.sleep (50);
	c.drawString ("Y", 328, 275);
	Thread.sleep (50);
	c.drawString ("E", 343, 275);
	Thread.sleep (50);
	c.drawString ("R", 358, 275);
	Thread.sleep (50);
	c.drawString (".", 373, 275);
	Thread.sleep (50);

	c.setCursor (16, 4);
	gameMode = c.readInt ();
	while (gameMode < 1 || gameMode > 2)
	{
	    c.println ("Invalid Entry. Please enter either 1 or 2.");
	    gameMode = c.readInt ();
	}
	c.clear ();

	if (gameMode == 1)
	{
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	    c.setColour (Color.white);
	    c.drawString ("P", 28, 50);
	    Thread.sleep (50);
	    c.drawString ("L", 46, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 64, 50);
	    Thread.sleep (50);
	    c.drawString ("A", 82, 50);
	    Thread.sleep (50);
	    c.drawString ("S", 100, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 118, 50);
	    Thread.sleep (50);
	    c.drawString ("", 136, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 154, 50);
	    Thread.sleep (50);
	    c.drawString ("N", 172, 50);
	    Thread.sleep (50);
	    c.drawString ("T", 190, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 208, 50);
	    Thread.sleep (50);
	    c.drawString ("R", 226, 50);
	    Thread.sleep (50);
	    c.drawString ("", 244, 50);
	    Thread.sleep (50);
	    c.drawString ("T", 262, 50);
	    Thread.sleep (50);
	    c.drawString ("H", 280, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 298, 50);
	    Thread.sleep (50);
	    c.drawString ("", 316, 50);
	    Thread.sleep (50);
	    c.drawString ("N", 334, 50);
	    Thread.sleep (50);
	    c.drawString ("U", 352, 50);
	    Thread.sleep (50);
	    c.drawString ("M", 370, 50);
	    Thread.sleep (50);
	    c.drawString ("B", 388, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 406, 50);
	    Thread.sleep (50);
	    c.drawString ("R", 424, 50);
	    Thread.sleep (50);
	    c.drawString ("", 262, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 28, 100);
	    Thread.sleep (50);
	    c.drawString ("F", 46, 100);
	    Thread.sleep (50);
	    c.drawString ("", 64, 100);
	    Thread.sleep (50);
	    c.drawString ("S", 82, 100);
	    Thread.sleep (50);
	    c.drawString ("H", 100, 100);
	    Thread.sleep (50);
	    c.drawString ("I", 118, 100);
	    Thread.sleep (50);
	    c.drawString ("P", 136, 100);
	    Thread.sleep (50);
	    c.drawString ("S", 154, 100);
	    Thread.sleep (50);
	    c.drawString ("", 172, 100);
	    Thread.sleep (50);
	    c.drawString ("Y", 190, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 208, 100);
	    Thread.sleep (50);
	    c.drawString ("U", 226, 100);
	    Thread.sleep (50);
	    c.drawString ("", 244, 100);
	    Thread.sleep (50);
	    c.drawString ("W", 262, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 280, 100);
	    Thread.sleep (50);
	    c.drawString ("U", 298, 100);
	    Thread.sleep (50);
	    c.drawString ("L", 316, 100);
	    Thread.sleep (50);
	    c.drawString ("D", 334, 100);
	    Thread.sleep (50);
	    c.drawString ("", 352, 100);
	    Thread.sleep (50);
	    c.drawString ("L", 370, 100);
	    Thread.sleep (50);
	    c.drawString ("I", 388, 100);
	    Thread.sleep (50);
	    c.drawString ("K", 406, 100);
	    Thread.sleep (50);
	    c.drawString ("E", 424, 100);
	    Thread.sleep (50);
	    c.drawString ("T", 28, 150);
	    Thread.sleep (50);
	    c.drawString ("O", 46, 150);
	    Thread.sleep (50);
	    c.drawString ("", 64, 150);
	    Thread.sleep (50);
	    c.drawString ("P", 82, 150);
	    Thread.sleep (50);
	    c.drawString ("L", 100, 150);
	    Thread.sleep (50);
	    c.drawString ("A", 118, 150);
	    Thread.sleep (50);
	    c.drawString ("Y", 136, 150);
	    Thread.sleep (50);
	    c.drawString ("", 154, 150);
	    Thread.sleep (50);
	    c.drawString ("W", 172, 150);
	    Thread.sleep (50);
	    c.drawString ("I", 190, 150);
	    Thread.sleep (50);
	    c.drawString ("T", 208, 150);
	    Thread.sleep (50);
	    c.drawString ("H", 226, 150);
	    Thread.sleep (50);
	    c.drawString ("", 244, 150);
	    Thread.sleep (50);
	    c.drawString ("(", 262, 150);
	    Thread.sleep (50);
	    c.drawString ("F", 280, 150);
	    Thread.sleep (50);
	    c.drawString ("R", 298, 150);
	    Thread.sleep (50);
	    c.drawString ("O", 316, 150);
	    Thread.sleep (50);
	    c.drawString ("M", 334, 150);
	    Thread.sleep (50);
	    c.drawString ("", 352, 150);
	    Thread.sleep (50);
	    c.drawString ("1", 370, 150);
	    Thread.sleep (50);
	    c.drawString ("-", 388, 150);
	    Thread.sleep (50);
	    c.drawString ("5", 406, 150);
	    Thread.sleep (50);
	    c.drawString (")", 424, 150);
	    Thread.sleep (50);
	    c.drawString (":", 442, 150);
	    c.setCursor (10, 4);
	    numShipsChoice = c.readInt ();
	    while (numShipsChoice < 1 || numShipsChoice > 5)
	    {
		c.println ("Enter a number from 1-5.");
		numShipsChoice = c.readInt ();
	    }
	    if (numShipsChoice == 1)
	    {
		numShipsChoice = 1;
	    }
	    if (numShipsChoice == 2)
	    {
		numShipsChoice = 2;
	    }
	    if (numShipsChoice == 3)
	    {
		numShipsChoice = 3;
	    }
	    if (numShipsChoice == 4)
	    {
		numShipsChoice = 4;
	    }
	    if (numShipsChoice == 5)
	    {
		numShipsChoice = 5;
	    }
	    c.clear ();

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
			buildComputerShip (map1);
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
		    if (map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit + 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit - 1] [guessRowHit] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit + 1] == 2 || map2 [guessColumnHit] [guessRowHit] == 2 && map2 [guessColumnHit] [guessRowHit - 1] == 2)
		    {
			c.setCursor (28, 1);
			c.println ("The computer sank your ship!");
			guessColumnHit = 0;
			guessRowHit = 0;
		    }
		}
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
		displayPlayer2Graphics (map2);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{

		    d.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    d.setColour (Color.white);
		    d.drawString ("Y  O  U    W  I  N   ! ", 150, i);
		    Thread.sleep (300);
		    d.setColour (Color.black);
		    d.drawString ("Y  O  U    W  I  N   ! ", 150, i + 20);
		    Thread.sleep (300);
		}

		displayComputerGraphics (map1);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{

		    c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    c.setColour (Color.white);
		    c.drawString ("C  O  M  P  U  T  E  R    L  O  S  E  S   ! ", 75, i);
		    Thread.sleep (300);
		    c.setColour (Color.black);
		    c.drawString ("C  O  M  P  U  T  E  R    L  O  S  E  S   ! ", 75, i + 20);
		    Thread.sleep (300);
		}
	    }
	    if (numHit2 >= (numShipsChoice * 2))
	    {
		a = 2;
		displayComputerGraphics (map1);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{

		    c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    c.setColour (Color.white);
		    c.drawString ("C  O  M  P  U  T  E  R    W  I  N  S  ! ", 75, i);
		    Thread.sleep (300);
		    c.setColour (Color.black);
		    c.drawString ("C  O  M  P  U  T  E  R    W  I  N  S  ! ", 75, i + 20);
		    Thread.sleep (300);
		}

		displayPlayer2Graphics (map2);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{

		    d.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    d.setColour (Color.white);
		    d.drawString ("Y  O  U    L  O  S  E   ! ", 150, i);
		    Thread.sleep (300);
		    d.setColour (Color.black);
		    d.drawString ("Y  O  U    L  O  S  E   ! ", 150, i + 20);
		    Thread.sleep (300);
		}
	    }
	}


	if (gameMode == 2)
	{
	    c.setFont (new Font ("Times New Roman", Font.BOLD, 14));
	    c.setColour (Color.white);
	    c.drawString ("P", 28, 50);
	    Thread.sleep (50);
	    c.drawString ("L", 46, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 64, 50);
	    Thread.sleep (50);
	    c.drawString ("A", 82, 50);
	    Thread.sleep (50);
	    c.drawString ("S", 100, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 118, 50);
	    Thread.sleep (50);
	    c.drawString ("", 136, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 154, 50);
	    Thread.sleep (50);
	    c.drawString ("N", 172, 50);
	    Thread.sleep (50);
	    c.drawString ("T", 190, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 208, 50);
	    Thread.sleep (50);
	    c.drawString ("R", 226, 50);
	    Thread.sleep (50);
	    c.drawString ("", 244, 50);
	    Thread.sleep (50);
	    c.drawString ("T", 262, 50);
	    Thread.sleep (50);
	    c.drawString ("H", 280, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 298, 50);
	    Thread.sleep (50);
	    c.drawString ("", 316, 50);
	    Thread.sleep (50);
	    c.drawString ("N", 334, 50);
	    Thread.sleep (50);
	    c.drawString ("U", 352, 50);
	    Thread.sleep (50);
	    c.drawString ("M", 370, 50);
	    Thread.sleep (50);
	    c.drawString ("B", 388, 50);
	    Thread.sleep (50);
	    c.drawString ("E", 406, 50);
	    Thread.sleep (50);
	    c.drawString ("R", 424, 50);
	    Thread.sleep (50);
	    c.drawString ("", 262, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 28, 100);
	    Thread.sleep (50);
	    c.drawString ("F", 46, 100);
	    Thread.sleep (50);
	    c.drawString ("", 64, 100);
	    Thread.sleep (50);
	    c.drawString ("S", 82, 100);
	    Thread.sleep (50);
	    c.drawString ("H", 100, 100);
	    Thread.sleep (50);
	    c.drawString ("I", 118, 100);
	    Thread.sleep (50);
	    c.drawString ("P", 136, 100);
	    Thread.sleep (50);
	    c.drawString ("S", 154, 100);
	    Thread.sleep (50);
	    c.drawString ("", 172, 100);
	    Thread.sleep (50);
	    c.drawString ("Y", 190, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 208, 100);
	    Thread.sleep (50);
	    c.drawString ("U", 226, 100);
	    Thread.sleep (50);
	    c.drawString ("", 244, 100);
	    Thread.sleep (50);
	    c.drawString ("W", 262, 100);
	    Thread.sleep (50);
	    c.drawString ("O", 280, 100);
	    Thread.sleep (50);
	    c.drawString ("U", 298, 100);
	    Thread.sleep (50);
	    c.drawString ("L", 316, 100);
	    Thread.sleep (50);
	    c.drawString ("D", 334, 100);
	    Thread.sleep (50);
	    c.drawString ("", 352, 100);
	    Thread.sleep (50);
	    c.drawString ("L", 370, 100);
	    Thread.sleep (50);
	    c.drawString ("I", 388, 100);
	    Thread.sleep (50);
	    c.drawString ("K", 406, 100);
	    Thread.sleep (50);
	    c.drawString ("E", 424, 100);
	    Thread.sleep (50);
	    c.drawString ("T", 28, 150);
	    Thread.sleep (50);
	    c.drawString ("O", 46, 150);
	    Thread.sleep (50);
	    c.drawString ("", 64, 150);
	    Thread.sleep (50);
	    c.drawString ("P", 82, 150);
	    Thread.sleep (50);
	    c.drawString ("L", 100, 150);
	    Thread.sleep (50);
	    c.drawString ("A", 118, 150);
	    Thread.sleep (50);
	    c.drawString ("Y", 136, 150);
	    Thread.sleep (50);
	    c.drawString ("", 154, 150);
	    Thread.sleep (50);
	    c.drawString ("W", 172, 150);
	    Thread.sleep (50);
	    c.drawString ("I", 190, 150);
	    Thread.sleep (50);
	    c.drawString ("T", 208, 150);
	    Thread.sleep (50);
	    c.drawString ("H", 226, 150);
	    Thread.sleep (50);
	    c.drawString ("", 244, 150);
	    Thread.sleep (50);
	    c.drawString ("(", 262, 150);
	    Thread.sleep (50);
	    c.drawString ("F", 280, 150);
	    Thread.sleep (50);
	    c.drawString ("R", 298, 150);
	    Thread.sleep (50);
	    c.drawString ("O", 316, 150);
	    Thread.sleep (50);
	    c.drawString ("M", 334, 150);
	    Thread.sleep (50);
	    c.drawString ("", 352, 150);
	    Thread.sleep (50);
	    c.drawString ("1", 370, 150);
	    Thread.sleep (50);
	    c.drawString ("-", 388, 150);
	    Thread.sleep (50);
	    c.drawString ("5", 406, 150);
	    Thread.sleep (50);
	    c.drawString (")", 424, 150);
	    Thread.sleep (50);
	    c.drawString (":", 442, 150);
	    c.setCursor (10, 4);
	    numShipsChoice = c.readInt ();
	    while (numShipsChoice < 1 || numShipsChoice > 5)
	    {
		c.println ("Enter a number from 1-5.");
		numShipsChoice = c.readInt ();
	    }
	    if (numShipsChoice == 1)
	    {
		numShipsChoice = 1;
	    }
	    if (numShipsChoice == 2)
	    {
		numShipsChoice = 2;
	    }
	    if (numShipsChoice == 3)
	    {
		numShipsChoice = 3;
	    }
	    if (numShipsChoice == 4)
	    {
		numShipsChoice = 4;
	    }
	    if (numShipsChoice == 5)
	    {
		numShipsChoice = 5;
	    }
	    c.clear ();
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
	    d.println ("You've finished placing your ships! ");
	    d.print ("Now it's your opponents turn. ");
	    d.print ("Your ships are now hidden to prevent your opponent from seeing them.");

	    a = 0;
	    x = 0;
	    numShips = 0;

	    do
	    {
		displayPlayer1Graphics (map1);

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
			displayPlayer1Graphics (map1);
			buildPlayer1Ship (map1);
		    }

		    while (y == 1)
		    {
			cursorHeight = cursorHeight + 1;
			c.setCursor (cursorHeight, cursorLength);
			c.println ("Where would you like to put your ship?");
			cursorHeight = cursorHeight + 1;
			c.setCursor (cursorHeight, cursorLength);
			c.println ("Please enter a column: ");
			cursorHeight = cursorHeight + 1;
			c.setCursor (cursorHeight, cursorLength);
			column = c.readInt ();

			cursorHeight = cursorHeight + 1;
			c.setCursor (cursorHeight, cursorLength);
			c.println ("Please enter a row ");
			cursorHeight = cursorHeight + 1;
			c.setCursor (cursorHeight, cursorLength);
			row = c.readInt ();

			checkPlayer1Valid (map1);

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

	    a = a + 1;
	    displayPlayer1Graphics (map1);

	    d.clear ();
	    c.clear ();
	    displayPlayer2Graphics (map2);
	    displayPlayer1Graphics (map1);

	    d.setCursor (23, 5);
	    d.println ("The game will now begin!");
	    c.setCursor (23, 5);
	    c.println ("The game will now begin!");

	    do
	    {
		d.setCursor (24, 1);
		d.println ("Please guess a column: ");
		guessColumn = d.readInt ();
		d.println ("Please guess a row: ");
		guessRow = d.readInt ();
		checkGuess2Valid (map2);

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
		    displayPlayer1Graphics (map1);
		    d.println ("You hit your opponent's ship!");
		    numHit1 = numHit1 + 1;
		}
		else
		{
		    map1 [guessColumn] [guessRow] = 3;
		    displayPlayer1Graphics (map1);
		    d.println ("You missed your opponent's ship!");
		}
		if (guessColumn + 1 <= 10 && guessColumn - 1 >= 0 && guessRow + 1 <= 10 && guessRow - 1 >= 0)
		{
		    if (map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn + 1] [guessRow] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn - 1] [guessRow] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn] [guessRow + 1] == 2 || map1 [guessColumn] [guessRow] == 2 && map1 [guessColumn] [guessRow - 1] == 2)
		    {
			checkGuess2Valid (map2);
			d.println ("You sank your opponent's ship!");
		    }
		}
		d.println ("Now it's your opponent's turn!");

		if (numHit1 >= (numShipsChoice * 2))
		{
		    break;
		}
		c.clear ();
		displayPlayer1Graphics (map1);

		c.setCursor (24, 1);
		c.println ("Please guess a column: ");
		guessColumn = c.readInt ();
		c.println ("Please guess a row: ");
		guessRow = c.readInt ();
		checkGuess1Valid (map1);

		while (map2 [guessColumn] [guessRow] == 2 || map2 [guessColumn] [guessRow] == 3)
		{
		    c.clear ();
		    displayPlayer1Graphics (map1);
		    c.setCursor (24, 1);
		    c.println ("You've already guessed this position.");
		    c.println ("Please guess another column: ");
		    guessColumn = c.readInt ();
		    c.println ("Please guess another row: ");
		    guessRow = c.readInt ();
		    checkGuess1Valid (map1);
		}
		if (map2 [guessColumn] [guessRow] == 1)
		{
		    map2 [guessColumn] [guessRow] = 2;
		    displayPlayer2Graphics (map2);
		    c.println ("You hit your opponent's ship!");
		    numHit2 = numHit2 + 1;
		}
		else
		{
		    map2 [guessColumn] [guessRow] = 3;
		    displayPlayer2Graphics (map2);
		    c.println ("You missed your opponent's ship!");
		}
		if (guessColumn + 1 <= 10 && guessColumn - 1 >= 0 && guessRow + 1 <= 10 && guessRow - 1 >= 0)
		{
		    if (map2 [guessColumn] [guessRow] == 2 && map2 [guessColumn + 1] [guessRow] == 2 || map2 [guessColumn] [guessRow] == 2 && map2 [guessColumn - 1] [guessRow] == 2 || map2 [guessColumn] [guessRow] == 2 && map2 [guessColumn] [guessRow + 1] == 2 || map2 [guessColumn] [guessRow] == 2 && map2 [guessColumn] [guessRow - 1] == 2)
		    {
			c.println ("You sank your opponent's ship!");
			checkGuess1Valid (map1);
		    }
		}
		c.println ("Now it's your opponent's turn!");

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
		displayPlayer2Graphics (map2);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{
		    d.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    d.setColour (Color.white);
		    d.drawString ("Y  O  U    W  I  N   ! ", 150, i);
		    Thread.sleep (300);
		    d.setColour (Color.black);
		    d.drawString ("Y  O  U    W  I  N   ! ", 150, i + 20);
		    Thread.sleep (300);
		}

		displayPlayer1Graphics (map1);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{
		    c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    c.setColour (Color.white);
		    c.drawString ("Y  O  U    L  O  S  E   ! ", 150, i);
		    Thread.sleep (300);
		    c.setColour (Color.black);
		    c.drawString ("Y  O  U    L  O  S  E   ! ", 150, i + 20);
		    Thread.sleep (300);
		}
	    }
	    if (numHit2 >= (numShipsChoice * 2))
	    {
		a = 0;
		displayPlayer1Graphics (map1);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{
		    c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    c.setColour (Color.white);
		    c.drawString ("Y  O  U    W  I  N   ! ", 150, i);
		    Thread.sleep (300);
		    c.setColour (Color.black);
		    c.drawString ("Y  O  U    W  I  N   ! ", 150, i + 20);
		    Thread.sleep (300);
		}

		displayPlayer2Graphics (map2);
		for (int i = 600 ; i > 500 ; i = i - 20)
		{
		    d.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		    d.setColour (Color.white);
		    d.drawString ("Y  O  U    L  O  S  E   ! ", 150, i);
		    Thread.sleep (300);
		    d.setColour (Color.black);
		    d.drawString ("Y  O  U    L  O  S  E   ! ", 150, i + 20);
		    Thread.sleep (300);
		}
	    }
	}
    }
    
    //This method displays the grid for Player 1 as well as the appropriate 
    //color for each tile. White for empty, yellow for a ship, black circle 
    //for a miss, red circle for a hit.
    public static void displayPlayer1Graphics (int[] [] map1)
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
			c.setColor (Color.yellow);
		    }
		}
		if (a == 1)
		{
		    if (map1 [i] [j] == 1)
		    {
			c.setColor (Color.white);
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
    
    //This method displays the grid for Player 2 as well as the appropriate 
    //color for each tile. White for empty, yellow for a ship, black circle 
    //for a miss, red circle for a hit.
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
			d.setColor (Color.white);
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
    
    //This method displays the grid for the computer as well as the appropriate 
    //color for each tile. White for empty, yellow for a ship, black circle 
    //for a miss, red circle for a hit.
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

    //This method forces Player 1 to finish building their ship by placing
    //an adjacent tile to the previous tile they entered. If they do not place
    //an adjacent tile, it will re-prompt until the user does.
    public static void buildPlayer1Ship (int[] [] map1)
    {
	int cursorLength = 5;
	int cursorHeight = 23;
	if ((column == (columnPosition + 1)) && (row == rowPosition) || (column == (columnPosition - 1)) && (row == rowPosition) || (column == columnPosition) && (row == (rowPosition - 1)) || (column == columnPosition) && ((row == rowPosition + 1)))
	{
	    x = 0;
	}
	else
	{
	    cursorHeight = cursorHeight + 1;
	    c.setCursor (cursorHeight, cursorLength);
	    c.println ("Choose an adjacent tile to finish building your ship!");
	    cursorHeight = cursorHeight + 1;
	    c.setCursor (cursorHeight, cursorLength);
	    c.println ("Please enter a column: ");
	    cursorHeight = cursorHeight + 1;
	    c.setCursor (cursorHeight, cursorLength);
	    column = c.readInt ();
	    cursorHeight = cursorHeight + 1;
	    c.setCursor (cursorHeight, cursorLength);
	    c.println ("Please enter a row: ");
	    cursorHeight = cursorHeight + 1;
	    c.setCursor (cursorHeight, cursorLength);
	    row = c.readInt ();
	    checkPlayer1Valid (map1);
	    c.clear ();
	}
    }
    
    //This method forces Player 2 to finish building their ship by placing
    //an adjacent tile to the previous tile they entered. If they do not place
    //an adjacent tile, it will re-prompt until the user does.
    public static void buildPlayer2Ship (int[] [] map2)
    {
	int cursorLength = 5;
	int cursorHeight = 23;
	if ((column == (columnPosition + 1)) && (row == rowPosition) || (column == (columnPosition - 1)) && (row == rowPosition) || (column == columnPosition) && (row == (rowPosition - 1)) || (column == columnPosition) && ((row == rowPosition + 1)))
	{
	    x = 0;
	}
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
    }
    
    //This method forces the computer to finish building its ship by placing
    //an adjacent tile to the previous tile it entered. If it do not place
    //an adjacent tile, it will continue to randomize the column and row
    //until the condition of an adjacent tile is satisfied.
    public static void buildComputerShip (int[] [] map1)
    {
	int cursorLength = 5;
	int cursorHeight = 23;
	if ((column == (columnPosition + 1)) && (row == rowPosition) || (column == (columnPosition - 1)) && (row == rowPosition) || (column == columnPosition) && (row == (rowPosition - 1)) || (column == columnPosition) && ((row == rowPosition + 1)))
	{
	    x = 0;
	}
	else
	{
	    column = (int) (10 * Math.random () + 1);
	    row = (int) (10 * Math.random () + 1);
	    checkComputerValid (map1);
	    c.clear ();
	}
    }

    //This method checks that Player 1 has entered valid entrys when placing
    //ships. If they enter a column or row greater than 10 or less than or 
    //equal to 0, it will re-prompt until the user enters a valid entry. If
    //they enter the column and row of a tile that had already been entered, 
    //it will also re-prompt.
    public static void checkPlayer1Valid (int[] [] map1)
    {
	while (column > 10 || column <= 0)
	{
	    c.println ("Please re-enter a column: ");
	    column = c.readInt ();
	}

	while (row > 10 || row <= 0)
	{
	    c.println ("Please re-enter a row: ");
	    row = c.readInt ();
	}

	while (map1 [column] [row] == 1)
	{
	    c.clear ();
	    displayPlayer1Graphics (map1);
	    c.setCursor (23, 1);
	    c.println ("You already have a ship there.");
	    c.println ("Please re-enter a column: ");
	    column = c.readInt ();
	    c.println ("Please re-enter a row: ");
	    row = c.readInt ();
	}
    }
    
    //This method checks that Player 2 has entered valid entrys when placing
    //ships. If they enter a column or row greater than 10 or less than or 
    //equal to 0, it will re-prompt until the user enters a valid entry. If 
    //they enter the column and row of a tile that had already been entered, 
    //it will also re-prompt.
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
    
    //This method checks that the computer has entered valid entrys when 
    //placing ships. If it enters the column and row of a tile that had 
    //already been entered, it will randomize another tile that had not 
    //been entered.
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
    
    //This method checks that Player 1 has entered valid entrys when guessing
    //ships. If they enter a column or row greater than 10 or less than or 
    //equal to 0, it will re-prompt until the user enters a valid entry.
    public static void checkGuess1Valid (int[] [] map1)
    {
	while (guessColumn > 10 || guessColumn <= 0)
	{
	    c.println ("Please re-enter a column: ");
	    guessColumn = c.readInt ();
	}

	while (guessRow > 10 || guessRow <= 0)
	{
	    c.println ("Please re-enter a row: ");
	    guessRow = c.readInt ();
	}
    }
    
    //This method checks that Player 2 has entered valid entrys when guessing
    //ships. If they enter a column or row greater than 10 or less than or 
    //equal to 0, it will re-prompt until the user enters a valid entry.
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
}



