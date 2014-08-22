package com.kalenai.planarbinding.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.purifiedSalt), " s ", "s s", " s ", 's', new ItemStack(ModItems.salt));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.salt), new ItemStack(ModItems.purifiedSalt), new ItemStack(Blocks.dirt));
    }
}