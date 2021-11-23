package net.oraclehisty.mod1.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oraclehisty.mod1.Mod1;

public class ModItems {
    
    public static final Item RUBY = registerItem( "ruby",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mod1.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items For" + Mod1.MOD_ID);
    }

}
