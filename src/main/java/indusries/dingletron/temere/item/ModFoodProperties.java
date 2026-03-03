package indusries.dingletron.temere.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ANCHOVY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).usingConvertsTo(ModItems.FISH_BONES).build();
}