package com.memorycardabstractfactorypattern;

public abstract class MemoryCardFactory {
    public MemoryCard orderMemoryCard(String type){
        MemoryCard memorycard;
        memorycard = ManufacturingMemoryCard(type);
        memorycard.Specification();
        memorycard.packing();
        memorycard.delivering();
        
        return memorycard;
    }
    
    protected abstract MemoryCard ManufacturingMemoryCard(String type);
}
