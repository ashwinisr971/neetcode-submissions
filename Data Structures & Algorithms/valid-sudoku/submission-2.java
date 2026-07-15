class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> cols=new HashMap<>();
        Map<Integer,Set<Character>> rows=new HashMap<>();
        Map<String,Set<Character>> squares=new HashMap<>();

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;
                String squareId=(r/3)+","+(c/3);
                char elm=board[r][c];
                if(rows.computeIfAbsent(r,k->new HashSet<>()).contains(elm) || 
                    cols.computeIfAbsent(c,k->new HashSet<>()).contains(elm) ||
                    squares.computeIfAbsent(squareId,k->new HashSet<>()).contains(elm)){
                    return false;
                }

                rows.get(r).add(elm);
                cols.get(c).add(elm);
                squares.get(squareId).add(elm);
                
            }
        }

        return true;
    }
}
