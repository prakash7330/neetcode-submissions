class Solution {
    public boolean isValidSudoku(char[][] board) {      
        for(int i=0; i<9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(row.contains(board[i][j])){
                        return false;
                    }else{
                        row.add(board[i][j]);
                    }
                }
                if(board[j][i] != '.'){
                    if(col.contains(board[j][i])){
                        return false;
                    }else{
                        col.add(board[j][i]);
                    }
                }

                int boxRow = (i/3)*3 + j/3;
                int boxCol = (i%3)*3 + j%3;

                if(board[boxRow][boxCol] != '.'){
                    if(box.contains(board[boxRow][boxCol])){
                        return false;
                    }else{
                        box.add(board[boxRow][boxCol]);
                    }
                }
            }
        }
        return true;
    }
}
