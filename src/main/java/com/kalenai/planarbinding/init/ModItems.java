package com.kalenai.planarbinding.init;

import com.kalenai.planarbinding.item.ItemPB;
import com.kalenai.planarbinding.item.ItemPurifiedSalt;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemPB purifiedSalt = new ItemPurifiedSalt();

    public static void init(){
        GameRegistry.registerItem(purifiedSalt, "purifiedSalt");
    }
}
