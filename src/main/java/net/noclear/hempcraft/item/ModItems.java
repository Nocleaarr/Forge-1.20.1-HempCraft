package net.noclear.hempcraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noclear.hempcraft.HempCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HempCraft.MOD_ID);

    public static final RegistryObject<Item> HEMP_ITEM = ITEMS.register("hemp_item",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TARP_ITEM = ITEMS.register("tarp_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
