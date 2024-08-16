public class ValidSudoku{
    public static void public static void main(String[] args) {
        // call isValidSudoku for a character[][]    
    }

    public boolean isValidSudoku(char[][] board) {
        // row
        for(int i=0;i<9;i++){
            Set<Integer> st = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                boolean value = st.add(board[i][j]-48);
                if(!value){
                    return false;
                }
            }
        }
        // column
        for(int i=0;i<9;i++){
            Set<Integer> st = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.'){
                    continue;
                }
                boolean value = st.add(board[j][i]-48);
                 if(!value){
                    return false;
                }
            }
        }
        boolean one = checker(board,0,0);
        if(!one){
            return false;
        }
        boolean two = checker(board,0,3);
        if(!two){
            return false;
        }
        boolean three = checker(board,0,6);
        if(!three){
            return false;
        }
        boolean four = checker(board,3,0);
        if(!four){
            return false;
        }
        boolean five = checker(board,3,3);
        if(!five){
            return false;
        }
        boolean six = checker(board,3,6);
        if(!six){
            return false;
        }
        boolean seven = checker(board,6,0);
        if(!seven){
            return false;
        }
        boolean eight = checker(board,6,3);
        if(!eight){
            return false;
        }
        boolean nine = checker(board,6,6);
        if(!nine){
            return false;
        }
        
        return true;
    }
    public boolean checker(char[][] board,int p,int q){
        int endI = p+3;
        int endJ = q+3;
        Set<Integer> st = new HashSet<>();
        for(int i = p;i<endI;i++){
            for(int j = q;j<endJ;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                boolean value = st.add(board[i][j]-48);
                 if(!value){
                    return false;
                }
            }
        }
        return true;
    }
}