/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import com.sun.prism.paint.Color;

/**
 *
 * @author manuel
 */
public class Board {
    // this is a 2-D array of class disc; member variables are always "private"
    private Disc[][] board;
    
    // constructor with initObjects method called
    public Board(){
        
        initObjects();
        
    }
    
    // defining the initObjects method
    private void initObjects() {
        // creating the Disc array for the board based on constants
        board = new Disc[Constants.ROWS][Constants.COLUMNS];
        
        /* loop through the array, create new Disc objects for each element 
        in the array */
        for(int row = 0; row < Constants.ROWS; row++){
            
            for(int col = 0; col < Constants.COLUMNS; col++){
                
                board[row][col] = new Disc();
                
            }
        }
        
        /* Set up default state for 4 discs
        NOTE: These are currently hardcoded positions!
        */
        board[3][3].setColor(Constants.LIGHT);
        board[3][4].setColor(Constants.DARK);
        board[4][3].setColor(Constants.LIGHT);
        board[4][4].setColor(Constants.DARK);
        
        
    }

    /**
     * @return the board
     */
    public Disc[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Disc[][] board) {
        this.board = board;
    }
    
}
