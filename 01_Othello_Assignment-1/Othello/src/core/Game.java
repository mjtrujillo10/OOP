/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class Game {
    
    // member variables
    private ArrayList<Player> players;
    private Board board;
    
    // constructor
    public Game(){
        
        initObjects();
        
    }

    
    // initializing the board and player objects
    private void initObjects() {
        // insantiate our board
        board = new Board();
        
        createPlayers();
        
        printPlayers();
        
    }

    
    // Defining the createPlayers method
    private void createPlayers() {
        
        players = new ArrayList<>();
        
        for(int max = 0; max < Constants.MAX_PLAYERS; max++) {
            
            // Acquiring the player's name from the user
            String name;
            name = JOptionPane.showInputDialog(null, "Enter player's name");
            
            // Creating a local Player variable for this loop
            Player newPlayer = new Player();
            
            // Setting the name of the player variable to the input string
            newPlayer.setName(name);
            
            // Check which player it is, then assign them colors            
            if(max == Constants.PLAYER_ONE)
                newPlayer.setColor(Constants.DARK);
            if(max == Constants.PLAYER_TWO)
                newPlayer.setColor(Constants.LIGHT);
            
            // Add the player to the ArrayList
            players.add(max, newPlayer);
            
        }
    }
    
    
    // Defining the printPlayers method
    private void printPlayers() {
        
        System.out.println("The game has the following players:");
        
        // A "for each" loop listing the players
        for (Player player : players)
            System.out.println("Player " + player.getName() + " is playing disc"
                    + " color " + player.getColor());
        
                
    }
    
    
    // Getters and setters for member variables
    /**
     * @return the players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Board board) {
        this.board = board;
    }
}
