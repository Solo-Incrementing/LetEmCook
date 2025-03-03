package com.gmail.soloincrementing.letemcookmod.item;

import com.gmail.soloincrementing.letemcookmod.LetEmCookMod;
import com.gmail.soloincrementing.letemcookmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LetEmCookMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LETEMCOOK_FOOD_TAB =
            CREATIVE_MODE_TABS.register("letemcook_food_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.BANANA.get()))
                            .title(Component.translatable("creativetab.letemcookmod.letemcook_food"))
                            .displayItems((itemDisplayParameters, output) ->{
                                output.accept(ModItems.BANANA.get());
                                output.accept(ModItems.PEAR.get());
                                output.accept(ModItems.PEELED_BANANA.get());
                                output.accept(ModItems.CHOPPED_BANANA.get());
                                output.accept(ModItems.DEEP_PLATE.get());
                                output.accept(ModItems.CHOPPED_BANANA_DEEP_PLATE.get());
                            })
                            .build());

    public static final RegistryObject<CreativeModeTab> LETEMCOOK_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register("letemcook_blocks_tab",
                    () -> CreativeModeTab.builder()
                            .withTabsBefore(LETEMCOOK_FOOD_TAB.getId())
                            .icon(() -> new ItemStack(ModBlocks.KITCHEN_COUNTER_BLOCK.get()))
                            .title(Component.translatable("creativetab.letemcookmod.letemcook_blocks"))
                            .displayItems((itemDisplayParameters, output) ->{
                                output.accept(ModBlocks.KITCHEN_COUNTER_BLOCK.get());
                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}