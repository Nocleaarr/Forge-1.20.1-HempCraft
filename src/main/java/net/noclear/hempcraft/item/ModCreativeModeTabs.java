package net.noclear.hempcraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noclear.hempcraft.HempCraft;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HempCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HEMP_TAB = CREATIVE_MODE_TABS.register("hemp_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEMP_ITEM.get()))
                    .title(Component.translatable("creativetab.hemp_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HEMP_ITEM.get());
                        output.accept(ModItems.TARP_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
