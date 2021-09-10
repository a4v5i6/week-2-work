package com.memorycardabstractfactorypattern;


public class USB extends MemoryCardFactory{

    @Override
    protected MemoryCard ManufacturingMemoryCard(String name) {
        if(name.equals("4 gb")){
          return new GB4USB();
         } else if (name.equals("8 gb")){
             return new GB8();
         } else if(name.equals("16 gb")){
             return new GB16();
         } else if(name.endsWith("32 gb")){
             return new GB32();
         }else if(name.equals("64 gb")){
             return new GB64();
         }
         else return null;
    }
    
}
