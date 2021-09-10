package com.memorycardabstractfactorypattern;

public abstract class MemoryCard {
    String name;
    String capacity;
    double price;
    
    void Specification(){
         System.out.println("Specification of "+ name+":");
         System.out.println("Capacity of "+name+" is "+capacity);
         System.out.println("Price of "+name+" is $"+price);
     }
     
     void packing(){
         System.out.println("Packaging the "+name);
     }
     
     void delivering(){
         System.out.println("Delivery ready of "+name);
     }
     
     public String getName(){
         return name;
     }
}
