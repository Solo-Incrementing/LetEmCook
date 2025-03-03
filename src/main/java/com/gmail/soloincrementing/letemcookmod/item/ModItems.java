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

    public static final RegistryObject<Item> PEELED_BANANA =
            ITEMS.register("peeled_banana", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:peeled_banana")))));

    public static final RegistryObject<Item> CHOPPED_BANANA =
            ITEMS.register("chopped_banana", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:chopped_banana")))));

    public static final RegistryObject<Item> DEEP_PLATE =
            ITEMS.register("deep_plate", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:deep_plate")))));

    public static final RegistryObject<Item> CHOPPED_BANANA_DEEP_PLATE =
            ITEMS.register("chopped_banana_deep_plate", () -> new Item(
                    new Item.Properties().setId(
                            ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:chopped_banana_deep_plate")))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}