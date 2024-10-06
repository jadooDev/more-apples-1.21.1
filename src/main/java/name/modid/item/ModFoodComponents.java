package name.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents
{
    public static final FoodComponent COAL_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200), 0.6f)
            .alwaysEdible()
            .build();

    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();


}
