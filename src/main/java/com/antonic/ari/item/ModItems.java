package com.antonic.ari.item;

import com.antonic.ari.AriMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OAKSTICK = registerItem("oakstick", new Item(new FabricItemSettings()));
    public static final Item SPRUCESTICK = registerItem("sprucestick", new Item(new FabricItemSettings()));
    public static final Item BIRCHSTICK = registerItem("birchstick", new Item(new FabricItemSettings()));
    public static final Item JUNGLESTICK = registerItem("junglestick", new Item(new FabricItemSettings()));
    public static final Item ACACIASTICK = registerItem("acaciastick", new Item(new FabricItemSettings()));
    public static final Item DARKOAKSTICK = registerItem("darkoakstick", new Item(new FabricItemSettings()));
    public static final Item MANGROVESTICK = registerItem("mangrovestick", new Item(new FabricItemSettings()));
    public static final Item CRIMSONSTICK = registerItem("crimsonstick", new Item(new FabricItemSettings()));
    public static final Item WARPEDSTICK = registerItem("warpedstick", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AriMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addItemsToItemGroup(ItemGroups.INGREDIENTS, OAKSTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, SPRUCESTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, BIRCHSTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, JUNGLESTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, ACACIASTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, DARKOAKSTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, MANGROVESTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, CRIMSONSTICK);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, WARPEDSTICK);
    }

    public static void addItemsToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        AriMod.LOGGER.info("Registering Mod Items for " + AriMod.MOD_ID);

        addItemsToItemGroup();
    }
}