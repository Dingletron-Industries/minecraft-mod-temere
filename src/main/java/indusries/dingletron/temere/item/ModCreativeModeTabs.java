package indusries.dingletron.temere.item;

import indusries.dingletron.temere.Temere;
import indusries.dingletron.temere.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Temere.MOD_ID);

    // Mod Items
    public static final Supplier<CreativeModeTab> TEMERE_ITEM_TAB = CREATIVE_MODE_TAB.register("temere_item_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RAW_TIN.get())).title(Component.translatable("creativetab.temere.items"))
            .displayItems((itemDisplayParameters, output) -> {
                // Misc Items
                output.accept(ModItems.COAL_CHUNK);
                output.accept(ModItems.FISH_BONES);
                output.accept(ModItems.FOSSIL);
                // Tin
                output.accept(ModItems.RAW_TIN);
                output.accept(ModItems.TIN_INGOT);
                // Foods

                // Fish
                output.accept(ModItems.ANCHOVY);
                output.accept(ModItems.BASS);
                output.accept(ModItems.BREAM);
                output.accept(ModItems.CARP);
                output.accept(ModItems.CATFISH);
                output.accept(ModItems.CRAYFISH);
                output.accept(ModItems.DORADO);
                output.accept(ModItems.HERRING);
                output.accept(ModItems.LOBSTER);
                output.accept(ModItems.OYSTER);
                output.accept(ModItems.PIKE);
                output.accept(ModItems.PURPLE_REEF_FISH);
                output.accept(ModItems.SARDINE);
                output.accept(ModItems.SEA_SNAIL);
                output.accept(ModItems.TUNA);
            })
            .build());

    // Mod Blocks
    public static final Supplier<CreativeModeTab> TEMERE_BLOCK_TAB = CREATIVE_MODE_TAB.register("temere_block_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.TIN_ORE.get())).withTabsBefore(ResourceLocation.fromNamespaceAndPath(Temere.MOD_ID, "temere_item_tab")).title(Component.translatable("creativetab.temere.blocks"))
            .displayItems((itemDisplayParameters, output) -> {
                // Tin
                output.accept(ModBlocks.TIN_ORE);
                output.accept(ModBlocks.DEEPSLATE_TIN_ORE);
                output.accept(ModBlocks.RAW_TIN_BLOCK);
                output.accept(ModBlocks.TIN_BLOCK);
            })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
