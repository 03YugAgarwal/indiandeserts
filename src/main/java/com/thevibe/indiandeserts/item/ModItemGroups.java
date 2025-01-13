package com.thevibe.indiandeserts.item;

import com.thevibe.indiandeserts.IndianDeserts;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup INDIAN_DESERT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(IndianDeserts.MOD_ID, "indian_deserts_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JAGGERY))
                    .displayName(Text.translatable("itemgroup.indiandeserts.itemgroup"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.JAGGERY);
                        entries.add(ModItems.FRESH_MILK);
                    }).build());


    public static void registerItemGroups(){


        IndianDeserts.LOGGER.info("Registering Mod Item groups for "+ IndianDeserts.MOD_ID);
    }

}
