package com.kalenai.planarbinding.block;

import net.minecraft.block.material.Material;

public class BlockBindingTable extends BlockPB{
    public BlockBindingTable(){
        super(Material.wood);
        this.setBlockName("bindingTable");
        this.setBlockTextureName("bindingTable");
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeWood);
    }
}
