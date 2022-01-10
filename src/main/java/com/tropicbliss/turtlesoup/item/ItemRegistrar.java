package com.tropicbliss.turtlesoup.item;

import com.tropicbliss.turtlesoup.TurtleSoupMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistrar {

  public static final Item TURTLE_SOUP = foodItemBuilder(Foods.TURTLE_SOUP, true, false, false);
  public static final Item TURTLE = foodItemBuilder(Foods.RAW_TURTLE, false, false, false);
  public static final Item TURTLE_PIZZA = foodItemBuilder(Foods.TURTLE_PIZZA, false, true, false);

  public static void register() {
    registerItem("turtle", TURTLE);
    registerItem("cooked_turtle", foodItemBuilder(Foods.COOKED_TURTLE, false, false, false));
    registerItem("turtle_soup", TURTLE_SOUP);
    registerItem("turtle_pizza", TURTLE_PIZZA);
    registerItem("milk_steak", foodItemBuilder(Foods.MILK_STEAK, false, false, true));
  }

  private static void registerItem(String path, Item item) {
    Registry.register(Registry.ITEM, new Identifier(TurtleSoupMod.MOD_ID, path), item);
  }

  private static Item foodItemBuilder(FoodComponent food, boolean isSoup, boolean isTooltip, boolean isMilk) {
    Item.Settings settings = new FabricItemSettings().group(Groups.TURTLE_SOUP).food(food);
    if (isSoup) {
      settings = settings.maxCount(16);
      return new TurtleSoup(settings);
    }
    if (isTooltip) {
      return new TurtlePizza(settings);
    }
    if (isMilk) {
      return new MilkSteak(settings);
    }
    return new Item(settings);
  }
}
