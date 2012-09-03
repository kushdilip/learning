package day6.snakeandladder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {
	private static Board board;
	final private int LAST = 100;
	private boolean automated = true;
	private Player player1;
	private Player player2;
	Snake[] snakes;
	Ladder[] ladders;
	private Scanner sc;

	
	private Board() throws Exception {
		player1 = new Player(new Position(0), "Player1");
		player2 = new Player(new Position(0), "Player2");
	}

	public static synchronized Board getInstance() throws Exception {
		if (board == null) {
			board = new Board();
		}
		return board;
	}

	public static int throwDice() {
		Random random = new Random();
		return (random.nextInt(6) + 1);
	}

	public void createBoard() throws Exception {
		int[] snakeHeadValues = { 17, 24, 34, 47, 56, 98 };
		int[] snakeTailValues = { 10, 9, 14, 10, 27, 62 };
		int[] ladderTopValues = { 31, 87, 81, 97 };
		int[] ladderBottomValues = { 8, 66, 42, 53 };

		try {
			String inFileName = "D:\\workspace\\Learning\\Data\\snakeNladdder.txt";
			ArrayList<int[]> snakeLadderArrays = readSnakeLadderFile(inFileName);
			snakes = createSnakes(snakeLadderArrays.get(0), snakeLadderArrays
					.get(1));
			ladders = createLadders(snakeLadderArrays.get(2), snakeLadderArrays
					.get(3));
		} catch (Exception e) {
			// TODO: handle exception
			System.out
					.println("File has errors, so using default values for snakes and ladders\n");
			snakes = createSnakes(snakeHeadValues, snakeTailValues);
			ladders = createLadders(ladderTopValues, ladderBottomValues);
		}

	}

	public Snake[] createSnakes(int[] heads, int[] tails) throws Exception {
		Snake[] snakes = new Snake[heads.length];
		for (int i = 0; i < snakes.length; i++) {
			snakes[i] = new Snake(new Position(heads[i]),
					new Position(tails[i]));
		}

		return snakes;
	}

	public Ladder[] createLadders(int[] tops, int[] bottoms) throws Exception {
		Ladder[] ladders = new Ladder[tops.length];
		for (int i = 0; i < ladders.length; i++) {
			ladders[i] = new Ladder(new Position(tops[i]), new Position(
					bottoms[i]));
		}

		return ladders;

	}

	public int findSnake(Snake[] snakeArray, int value) {
		int indexOfSnake = -1;
		for (int i = 0; i < snakeArray.length; i++) {
			if (value == snakeArray[i].getHead().getPositionNumber()) {
				indexOfSnake = i;
				break;
			}
		}
		return indexOfSnake;
	}

	public int findLadder(Ladder[] ladderArray, int value) {
		int indexOfLadder = -1;
		for (int i = 0; i < ladderArray.length; i++) {
			if (value == ladderArray[i].getBottom().getPositionNumber()) {
				indexOfLadder = i;
				break;
			}
		}
		return indexOfLadder;
	}

	public ArrayList<int[]> readSnakeLadderFile(String inFileName) {
		ArrayList<int[]> snakeLadderArrays = new ArrayList<int[]>();
		String[] valuesArray;
		int[] valuesArrayInt;

		String tempString;
		try {
			BufferedReader in = new BufferedReader(new FileReader(inFileName));
			while ((tempString = in.readLine()) != null) {
				if (!tempString.isEmpty()) {
					valuesArray = tempString.split(",");
					valuesArrayInt = new int[valuesArray.length];
					for (int i = 0; i < valuesArrayInt.length; i++) {
						valuesArrayInt[i] = Integer.parseInt(valuesArray[i]);
					}
					snakeLadderArrays.add(valuesArrayInt);
				}

			}
			in.close();
		} catch (IOException e) {
			System.out.println("Couldn't read the file");
		}
		return snakeLadderArrays;
	}

	public Player playTurn(Player player) throws Exception {
		int currentPositionValue, nextPositionValue;
		int diceValue;
		int snakeIndex, ladderIndex;

		// First player's turn
		System.out.print(player.getName() + "'s turn");
		sc = new Scanner(System.in);

		if (!automated) {
			while (!sc.nextLine().equals(""))
				; // Wait for user to enter
		}

		diceValue = throwDice();
		currentPositionValue = player.getCurrentPosition().getPositionNumber();
		nextPositionValue = currentPositionValue + diceValue;

		snakeIndex = findSnake(snakes, nextPositionValue);
		ladderIndex = findLadder(ladders, nextPositionValue);

		if (snakeIndex >= 0) {
			System.out.println("Dice Value: " + diceValue
					+ "\nSnake Bites you at " + nextPositionValue
					+ ", You will go to position "
					+ snakes[snakeIndex].getTail().getPositionNumber() + "\n");
			player.move(new Position(snakes[snakeIndex].getTail()
					.getPositionNumber()));
		} else if (ladderIndex >= 0) {
			System.out.println("Dice Value: " + diceValue
					+ "\nGood! You got ladder at " + nextPositionValue
					+ ", You will go to position "
					+ ladders[ladderIndex].getTop().getPositionNumber() + "\n");
			player.move(new Position(ladders[ladderIndex].getTop()
					.getPositionNumber()));
		} else if (nextPositionValue <= LAST) {
			player.move(new Position(nextPositionValue));
			System.out.println("Dice Value: " + diceValue + "\nNext Position: "
					+ nextPositionValue + "\n");
		} else {
			System.out.println("Dice Value: " + diceValue
					+ "\nWait for next turn\n");
		}

		return player;
	}

	public Player[] decideWhoMovesFirst() throws IOException {
		boolean firstToPlayDecided = false;
		Player firstToPlay = player1;
		Player secondToplay = player2;
		int diceValue;
		// loop to decide who gets to move first based on who gets 6 first on
		// dice

		System.out
				.println("Please, Press Enter on your turn\nThe player who gets 6 on Dice first, will move first:\n");
		while (!firstToPlayDecided) {
			System.out.print(firstToPlay.getName() + "'s turn:");
//			Scanner sc = new Scanner(System.in);
			if (!automated) {
				while (!sc.nextLine().equals(""))
					; // Wait for user to enter
			}
			diceValue = throwDice();

			System.out.println(diceValue);
			if (diceValue == 6) {
				firstToPlayDecided = true;
				break;
			}

			System.out.print(secondToplay.getName() + "'s turn:");
			if (!automated) {
				while (!sc.nextLine().equals(""))
					; // Wait for user to enter
			}
			diceValue = throwDice();
			System.out.println(diceValue);
			if (diceValue == 6) {
				firstToPlayDecided = true;
				firstToPlay = player2;
				secondToplay = player1;
				break;
			}
		}

		System.out.println(firstToPlay.getName() + " gets to play first");

		return new Player[] { firstToPlay, secondToplay };
	}

	public void startGame() throws Exception {

		createBoard();

		// Decide if game to be automated or not
//		Scanner sc = new Scanner(System.in);
		System.out
				.println("Press Enter if you want game to be automated\nOr press any other key and Enter for manual game:\n");
		if (!sc.nextLine().equals("")) {
			automated = false;
		}

		Player[] players = decideWhoMovesFirst();
		int currentPositionValue;
		System.out.println("");
		while (true) {
			// First player's turn
			currentPositionValue = playTurn(players[0]).getCurrentPosition()
					.getPositionNumber();
			if (currentPositionValue == LAST) {
				System.out.println(players[0].getName() + " Wins the game!!!");
				break;
			}

			// Second player's turn
			currentPositionValue = playTurn(players[1]).getCurrentPosition()
					.getPositionNumber();
			if (currentPositionValue == LAST) {
				System.out.println(players[1].getName() + " Wins the game!!!");
				break;
			}
		}
	}
}
