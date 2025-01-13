package com.thevibe.indiandeserts.item;

import com.thevibe.indiandeserts.IndianDeserts;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item JAGGERY = registerItem("jaggery", new Item(new Item.Settings()
            .food(ModFoodComponents.JAGGERY)));


    public static final Item FRESH_MILK = registerItem("fresh_milk",new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(IndianDeserts.MOD_ID, name),item);
    }

    public static void registerModItems(){
        IndianDeserts.LOGGER.info("Registering Mod Items for "+IndianDeserts.MOD_ID);

    }

}
