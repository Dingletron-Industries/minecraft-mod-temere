package indusries.dingletron.temere.item;

import indusries.dingletron.temere.Temere;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Temere.MOD_ID);
    //Materials
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FISH_BONES = ITEMS.register("fish_bones", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FOSSIL = ITEMS.register("fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SNAIL_SHELL = ITEMS.register("snail_shell", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OYSTER_SHELL = ITEMS.register("oyster_shell", () -> new Item(new Item.Properties()));
    //Fish
    public static final DeferredItem<Item> ANCHOVY = ITEMS.register("anchovy", () -> new Item(new Item.Properties().food(ModFoodProperties.ANCHOVY)));
    public static final DeferredItem<Item> BASS = ITEMS.register("bass", () -> new Item(new Item.Properties().food(ModFoodProperties.BASS)));
    public static final DeferredItem<Item> BREAM = ITEMS.register("bream", () -> new Item(new Item.Properties().food(ModFoodProperties.BREAM)));
    public static final DeferredItem<Item> CARP = ITEMS.register("carp", () -> new Item(new Item.Properties().food(ModFoodProperties.CARP)));
    public static final DeferredItem<Item> CATFISH = ITEMS.register("catfish", () -> new Item(new Item.Properties().food(ModFoodProperties.CATFISH)));
    public static final DeferredItem<Item> CRAYFISH = ITEMS.register("crayfish", () -> new Item(new Item.Properties().food(ModFoodProperties.CRAYFISH)));
    public static final DeferredItem<Item> DORADO = ITEMS.register("dorado", () -> new Item(new Item.Properties().food(ModFoodProperties.DORADO)));
    public static final DeferredItem<Item> HERRING = ITEMS.register("herring", () -> new Item(new Item.Properties().food(ModFoodProperties.HERRING)));
    public static final DeferredItem<Item> LOBSTER = ITEMS.register("lobster", () -> new Item(new Item.Properties().food(ModFoodProperties.LOBSTER)));
    public static final DeferredItem<Item> OYSTER = ITEMS.register("oyster", () -> new Item(new Item.Properties().food(ModFoodProperties.OYSTER)));
    public static final DeferredItem<Item> PIKE = ITEMS.register("pike", () -> new Item(new Item.Properties().food(ModFoodProperties.PIKE)));
    public static final DeferredItem<Item> PURPLE_REEF_FISH = ITEMS.register("purple_reef_fish", () -> new Item(new Item.Properties().food(ModFoodProperties.PURPLE_REEF_FISH)));
    public static final DeferredItem<Item> SARDINE = ITEMS.register("sardine", () -> new Item(new Item.Properties().food(ModFoodProperties.SARDINE)));
    public static final DeferredItem<Item> SEA_SNAIL = ITEMS.register("sea_snail", () -> new Item(new Item.Properties().food(ModFoodProperties.SEA_SNAIL)));
    public static final DeferredItem<Item> TUNA = ITEMS.register("tuna", () -> new Item(new Item.Properties().food(ModFoodProperties.TUNA)));
    //Fuels
    public static final DeferredItem<Item> COAL_CHUNK = ITEMS.register("coal_chunk", () -> new FuelItem(new Item.Properties(), 200){
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.temere.coal_chunk"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
