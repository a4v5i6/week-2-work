package com.memorycardabstractfactorypattern;

public class SDCard extends MemoryCardFactory{
    @Override
    protected MemoryCard ManufacturingMemoryCard(String name) {
        if(name.equals("sd")){
          return new SD();
         } else if (name.equals("sdhc")){
             return new SDHC();
         } else if(name.equals("sdxc")){
             return new SDXC();
         } else if(name.endsWith("sduc")){
             return new SDUC();
         }
         else return null;
    }
}
