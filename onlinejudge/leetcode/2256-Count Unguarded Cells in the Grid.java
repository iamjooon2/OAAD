class Solution {
    
    static int[][] map;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        map = new int[m][n];

        for (int[] guard : guards) {
            int guardX = guard[0];
            int guardY = guard[1];

            map[guardX][guardY] = 2;
        }

        for (int[] wall : walls) {
            int wallX = wall[0];
            int wallY = wall[1];

            map[wallX][wallY] = 2;
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int[] guard : guards) {
            for (int k = 0; k < 4; k++) {
                int x = guard[0];
                int y = guard[1];

                while (true) {
                    x += dx[k];
                    y += dy[k];

                    if (x < 0 || x >= m || y < 0 || y >= n || map[x][y] == 2) {
                        break;
                    }

                    map[x][y] = 1;
                }
            }
        }

        int answer = 0;
        for (int[] rowLine : map) {
            for (int element : rowLine) {
                if (element == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
