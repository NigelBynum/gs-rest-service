package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {this.board = board;}

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {return board[value];}

    public String[] getColumn(Integer value)  {
        String[] column = new String[3];

        for(int i = 0; i < 3; i++){

            column[i] = getRow(i)[value];
        }
        return column;
    }

    //
    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
