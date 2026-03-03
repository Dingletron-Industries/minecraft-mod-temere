package indusries.dingletron.temere.item;

import indusries.dingletron.temere.Temere;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Temere.MOD_ID);

    public static final DeferredItem<Item> COAL_CHUNK = ITEMS.register("coal_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FISH_BONES = ITEMS.register("fish_bones", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANCHOVY=  ITEMS.register("anchovy", () -> new Item(new Item.Properties().food(ModFoodProperties.ANCHOVY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
