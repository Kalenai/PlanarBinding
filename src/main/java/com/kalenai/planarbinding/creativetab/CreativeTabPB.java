package com.kalenai.planarbinding.creativetab;

import com.kalenai.planarbinding.init.ModItems;
import com.kalenai.planarbinding.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPB {
    public static final CreativeTabs PB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
@Override
public Item getTabIconItem() {
        return ModItems.purifiedSalt;
        }
        };
        }
