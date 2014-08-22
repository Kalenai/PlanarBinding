package com.kalenai.planarbinding.init;

import com.kalenai.planarbinding.item.*;
import com.kalenai.planarbinding.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemPB salt = new ItemSalt();
    public static final ItemPB purifiedSalt = new ItemPurifiedSalt();

    public static final ItemPB inscriptionTools = new ItemIncriptionTools();
    public static final ItemPB inscribedStone = new ItemInscribedStone();

    public static void init(){
        GameRegistry.registerItem(salt, "salt");
        GameRegistry.registerItem(purifiedSalt, "purifiedSalt");
        GameRegistry.registerItem(inscriptionTools, "inscriptionTools");
        GameRegistry.registerItem(inscribedStone, "inscribedStone");
    }
}