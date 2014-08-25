package com.kalenai.planarbinding.block;

import com.kalenai.planarbinding.tileentity.TileEntityBindingTable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBindingTable extends BlockPB implements ITileEntityProvider{
    public BlockBindingTable(){
        super(Material.wood);
        this.setBlockName("bindingTable");
        this.setBlockTextureName("bindingTable");
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeWood);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metaData) {
        return new TileEntityBindingTable();
    }

    /*TODO setup rendering and such
    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return RenderIds.bindingTable;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }*/
}
