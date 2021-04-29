/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.Serializable;

/**
 *
 * @author bianchi.emmanuele
 */
public class RandomCharArray implements Serializable {
    private char[] arr = new char[10];
    private char[] caratteri = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        public RandomCharArray(){
            for(int i = 0; i < 10; i++ ){
                char a = caratteri[(int)(Math.random()*24)];
                arr[i] = a;
            }
        }

    public char[] getArr() {
        return arr;
    }
        
}
