package name.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents
{
    public static final FoodComponent COAL_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent COPPER_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200), 0.3f)
            .alwaysEdible()
            .build();

    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent EMERALD_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 2400), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 140, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent IRON_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent LAPIS_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent REDSTONE_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10000000), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1.0f)
            .alwaysEdible()
            .build();
}
