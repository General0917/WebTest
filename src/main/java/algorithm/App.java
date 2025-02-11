package algorithm;

import java.util.Scanner;
public class App {
    private static final char START = 'S';
    private static final char GOAL = 'G';
    private static final char WALL = '#';
    private static final char EMPTY = '.';
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("歩数を入力してください (1 <= k <= 1000): ");
        int steps = scanner.nextInt();
        // ダンジョンのサイズを設定
        int n = 2;
        int m = steps + 2;
        if (steps == 1) {
            n = 10;
            m = 10;
        }
        char[][] dungeon = generateDungeon(n, m, steps);
        printDungeon(dungeon);
    }
    private static char[][] generateDungeon(int n, int m, int steps) {
        char[][] dungeon = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dungeon[i][j] = EMPTY;
            }
        }
        if (steps == 1) {
            dungeon[n - 1][m - 2] = GOAL;
            dungeon[n - 1][m - 1] = START;
            return dungeon;
        }
        // スタートとゴールを配置
        dungeon[0][1] = START;
        dungeon[0][m - 1] = GOAL;
        // スタートからゴールへの道を確保
        for (int i = 2; i < m - 1; i++) {
            dungeon[0][i] = EMPTY;
        }
        return dungeon;
    }
    private static void printDungeon(char[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        System.out.println(n + " " + m);
        for (char[] row : dungeon) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}