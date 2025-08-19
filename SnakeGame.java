import java.util.*;

public class SnakeGame {
    static int width = 10;
    static int height = 10;
    static char[][] board = new char[height][width];
    static LinkedList<int[]> snake = new LinkedList<>();
    static int[] food;
    static String direction = "RIGHT";
    static boolean gameOver = false;
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        snake.add(new int[]{5, 5});
        generateFood();

        while (!gameOver) {
            drawBoard();
            System.out.print("Move (WASD): ");
            String move = sc.nextLine().toUpperCase();
            setDirection(move);
            moveSnake();
        }

        System.out.println("Game Over!");
    }

    static void drawBoard() {
        for (int i = 0; i < height; i++)
            Arrays.fill(board[i], '.');

        for (int[] part : snake)
            board[part[0]][part[1]] = 'O';

        board[food[0]][food[1]] = 'F';

        for (char[] row : board)
            System.out.println(new String(row));
    }

    static void setDirection(String move) {
        switch (move) {
            case "W": direction = "UP"; break;
            case "A": direction = "LEFT"; break;
            case "S": direction = "DOWN"; break;
            case "D": direction = "RIGHT"; break;
        }
    }

    static void moveSnake() {
        int[] head = snake.peekFirst();
        int newRow = head[0], newCol = head[1];

        switch (direction) {
            case "UP": newRow--; break;
            case "DOWN": newRow++; break;
            case "LEFT": newCol--; break;
            case "RIGHT": newCol++; break;
        }

        // Collision check
        if (newRow < 0 || newRow >= height || newCol < 0 || newCol >= width) {
            gameOver = true;
            return;
        }

        for (int[] part : snake) {
            if (part[0] == newRow && part[1] == newCol) {
                gameOver = true;
                return;
            }
        }

        // Move snake
        snake.addFirst(new int[]{newRow, newCol});

        // Eat food
        if (newRow == food[0] && newCol == food[1]) {
            generateFood();
        } else {
            snake.removeLast(); // Move forward only
        }
    }

    static void generateFood() {
        while (true) {
            int r = rand.nextInt(height);
            int c = rand.nextInt(width);
            boolean found = false;
            for (int[] part : snake)
                if (part[0] == r && part[1] == c)
                    found = true;

            if (!found) {
                food = new int[]{r, c};
                break;
            }
        }
    }
}
