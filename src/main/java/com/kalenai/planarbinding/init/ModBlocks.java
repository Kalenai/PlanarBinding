package com.kalenai.planarbinding.init;

import com.kalenai.planarbinding.block.BlockBindingTable;
import com.kalenai.planarbinding.block.BlockPB;
import com.kalenai.planarbinding.block.BlockRunicStone;
import com.kalenai.planarbinding.block.BlockSanctifiedStone;
import com.kalenai.planarbinding.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockPB sanctifiedStone = new BlockSanctifiedStone();
    public static final BlockPB runicStone = new BlockRunicStone();
    public static final BlockPB bindingTable = new BlockBindingTable();

    public static void init(){
        GameRegistry.registerBlock(sanctifiedStone, "sanctifiedStone");
        GameRegistry.registerBlock(runicStone, "runicStone");
        GameRegistry.registerBlock(bindingTable, "bindingTable");
    }
}
