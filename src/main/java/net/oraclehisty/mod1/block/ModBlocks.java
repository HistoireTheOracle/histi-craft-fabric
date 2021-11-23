package net.oraclehisty.mod1.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oraclehisty.mod1.Mod1;

public class ModBlocks {
    


    private static Block registerBlock(String name, Block block) {

        return Registry.register(Registry.BLOCK, new Identifier(Mod1.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registry.ITEM, new Identifier(Mod1.MOD_ID, name), block),
            new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Modblocks for" + Mod1.MOD_ID);
    }

}
