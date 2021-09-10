package com.memorycardabstractfactorypattern;

public class MemoryCardTesting {
        public static void main(String[] args){
        MemoryCardFactory memorycardsd = new SDCard();
        MemoryCardFactory memorycardusb = new USB();
        
        MemoryCard memorycard= memorycardsd.orderMemoryCard("sduc");
        System.out.println("Nikhil ordered a " +memorycard.getName() + "\n");
        
        memorycard = memorycardusb.orderMemoryCard("64 gb");
        System.out.println("Ramesh ordered a " +memorycard.getName() + "\n");
    }

    
}
