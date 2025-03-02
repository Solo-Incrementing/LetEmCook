package com.gmail.soloincrementing.letemcookmod.block;

import com.gmail.soloincrementing.letemcookmod.LetEmCookMod;
import com.gmail.soloincrementing.letemcookmod.item.ModItems;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LetEmCookMod.MOD_ID);

    public static final RegistryObject<Block> KITCHEN_COUNTER_BLOCK = registerBlock("kitchen_counter_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.parse("letemcookmod:kitchen_counter_block")))));

    private static <T  extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().setId(
                        ResourceKey.create(Registries.ITEM, ResourceLocation.parse("letemcookmod:kitchen_counter_block")))));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}