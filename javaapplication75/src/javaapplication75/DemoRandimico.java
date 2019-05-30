/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class DemoRandimico {
    public static void main(String[] args) {
         Random aleatorios = new Random();
         int y = aleatorios.nextInt(4);
         System.out.printf("%d\n",y);
    }
}
