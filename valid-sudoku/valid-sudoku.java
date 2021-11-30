class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRowOrColumn(board[i])) return false;
            
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            if (!isValidRowOrColumn(column)) return false;
        }
        
        for (int k = 0; k < 3; k++) {
            for (int w = 0; w < 3; w++) {
                char[][] box = new char[3][3];
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        box[i][j] = board[3*k+i][3*w+j];
                    }
                }
                if (!isValidBox(box)) return false;
            }
        } 
        
        return true;
    }
    
    private boolean isValidRowOrColumn(char[] row) {
        ArrayList<Character> numbers = new ArrayList();
        
        for (int i = 0; i < 9; i++) {
            if (row[i] != '.') {
                if (!numbers.contains(row[i])) {
                    numbers.add(row[i]);
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean isValidBox(char[][] box) {
        ArrayList<Character> numbers = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (box[i][j] != '.') {
                    if (!numbers.contains(box[i][j])) {
                        numbers.add(box[i][j]);
                    } else {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}