package name.modid.item;

import name.modid.MoreApples;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COAL_APPLE = registerItem("coal_apple", new Item(new Item.Settings().food(ModFoodComponents.COAL_APPLE)));
    public static final Item COPPER_APPLE = registerItem("copper_apple", new Item(new Item.Settings().food(ModFoodComponents.COPPER_APPLE)));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", new Item(new Item.Settings().food(ModFoodComponents.DIAMOND_APPLE)));
    public static final Item EMERALD_APPLE = registerItem("emerald_apple", new Item(new Item.Settings().food(ModFoodComponents.EMERALD_APPLE)));
    public static final Item IRON_APPLE = registerItem("iron_apple", new Item(new Item.Settings().food(ModFoodComponents.IRON_APPLE)));
    public static final Item LAPIS_APPLE = registerItem("lapis_apple", new Item(new Item.Settings().food(ModFoodComponents.LAPIS_APPLE)));
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple", new Item(new Item.Settings().food(ModFoodComponents.NETHERITE_APPLE)));
    public static final Item REDSTONE_APPLE = registerItem("redstone_apple", new Item(new Item.Settings().food(ModFoodComponents.REDSTONE_APPLE)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(MoreApples.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MoreApples.LOGGER.info("Registering mod items for " + MoreApples.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(COAL_APPLE);
            entries.add(COPPER_APPLE);
            entries.add(DIAMOND_APPLE);
            entries.add(EMERALD_APPLE);
            entries.add(IRON_APPLE);
            entries.add(LAPIS_APPLE);
            entries.add(NETHERITE_APPLE);
            entries.add(REDSTONE_APPLE);
        });
    }
}