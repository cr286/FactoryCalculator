/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.factorycalculator;

/**
 *
 * @author charm_000
 */
public class MathFactory {
    public static MathCommand get(String key){
        switch (key) {
            case "+":
                return new AddCommmand();
            case "-":
                return new SubCommmand();
            case "*":
                return new MulCommand();
            case "/":
                return new DivCommmand();
        }
           
        return null;
        
}
}
