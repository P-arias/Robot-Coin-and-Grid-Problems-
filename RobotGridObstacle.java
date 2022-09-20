/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotgridobstacle;

import java.util.Arrays;

/**
 *
 * @author paria
 */
public class RobotGridObstacle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int F[][] = {{0,0,-1,0,0},{0,0,0,-1,0},{0,0,0,-1,0},{0,0,0,0,0}};
        System.out.println(Arrays.deepToString(F).replace(']', '\n').replace('[', ' ').replace(',', ' '));
        
        F[0][0] = 1;
        
        int n = F.length; //Rows
        int m = F[0].length; // Columns
        
        for(int i = 1; i < n;i++){
            if(F[i][0] != -1)
                F[i][0] = F[i-1][0];
            else F[i][0] = 0;
        }
        for(int j = 1; j < m;j++){
            if(F[0][j] != -1)
                F[0][j] = F[0][j-1]; 
            else F[0][j] = 0;
        }
        
        for(int i = 1; i < n;i++){
           for(int j = 1; j < m;j++){
                if(F[i][j] != -1)
                    F[i][j] = F[i-1][j] + F[i][j-1];
                else F[i][j] = 0;
               
            }
        }
        
       
        System.out.println(Arrays.deepToString(F).replace(']', '\n').replace('[', ' ').replace(',', ' '));
        System.out.println("Output: " + F[n-1][m-1]);
        
    }
    
}
