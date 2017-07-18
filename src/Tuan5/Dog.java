/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

/**
 *
 * @author BaoHa
 */
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String image) {
        super(name, image);
    }
    
    @Override
    public String sayHello(){
        return "Woaf woaf woaf!";
    }
}
