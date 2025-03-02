package com.gmail.soloincrementing.letemcookmod.item;

import com.gmail.soloincrementing.letemcookmod.LetEmCookMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LetEmCookMod.MOD_ID);

    public static final RegistryObject<Item> PEAR =
            ITEMS.register("pear", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:pear")))));

    public static final RegistryObject<Item> BANANA =
            ITEMS.register("banana", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:banana")))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}