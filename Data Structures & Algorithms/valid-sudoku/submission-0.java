class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet[] rows = new HashSet[9];
        HashSet[] columns = new HashSet[9];
        HashSet[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char a = board[i][j];
                if (a == '.') continue;
                if (!rows[i].add(a) || !columns[j].add(a) || !boxes[i / 3 * 3 + j / 3].add(a)) {
                    return false;
                }
            }
        }


        return true;
    }
}
