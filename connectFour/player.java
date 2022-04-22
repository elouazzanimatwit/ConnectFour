package connectFour;

import javafx.scene.control.Button;

public class player extends playerbase{
	public player(String[][] board) {
        int player = 1;
        while(true) {
            printBoard(board);
            System.out.println("\nPlayer One:");
            board = updateBoard(board, askForPlay(in), player);
            if(winPlay(board, "Player One","Player Two"));
        }
        player = 2
        printBoard(board);
        System.out.println("\nPlayer Two:");
        board = updateBoard(board, askForPlay(in), player);
        if(winPlay(board, "Player Two","Player One"));
    }

	private static void printBoard(String[][] board) {
		
	}

	private static boolean winPlay(String[][] board, String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}
        }
    }
}
}
