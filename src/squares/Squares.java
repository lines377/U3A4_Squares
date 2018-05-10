
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squares;

import java.util.ArrayList;

/**
 *
 * @author xagod6351
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> indexSquares=new ArrayList();
        
        for (int i=0;i < 10; i++){
            indexSquares.add(i,i*i);
        }
         for (int i=0;i < 10; i++){
            System.out.println("Number: "+ i +" Square: "+ indexSquares.get(i));
        }
    }
    
}
