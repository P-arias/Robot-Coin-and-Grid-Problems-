/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotcoincollection;

import java.util.Arrays;

/**
 *
 * @author paria
 */
public class RobotCoinCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** Input Board */
        int board[][] = {{0,0,0,0,0},{0,1,0,1,0},{0,1,1,0,0},{0,0,1,0,1},{0,1,0,1,0}}; 
        System.out.println(Arrays.deepToString(board).replace(']', '\n').replace('[', ' ').replace(',', ' '));
       
        for(int j = 2; j < board[0].length;j++){
            board[1][j] = board[1][j-1] + board[1][j];
        }
        for(int i = 2; i < board.length;i++){
            board[i][1] = board[i-1][1] + board[i][1];
            for(int j = 2; j < board[0].length;j++)
                board[i][j] = Math.max(board[i-1][j], board[i][j-1])+board[i][j];
        }
        System.out.println(Arrays.deepToString(board).replace(']', '\n').replace('[', ' ').replace(',', ' '));
    }
    
}
