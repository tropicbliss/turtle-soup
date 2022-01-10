package com.tropicbliss.turtlesoup.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Foods {

  public static FoodComponent RAW_TURTLE = new FoodComponent.Builder().meat().hunger(3)
      .saturationModifier(1.8F).build();
  public static FoodComponent COOKED_TURTLE = new FoodComponent.Builder().meat().hunger(5)
      .saturationModifier(6).build();
  public static FoodComponent TURTLE_SOUP = new FoodComponent.Builder().hunger(10)
      .saturationModifier(12).build();
  public static FoodComponent TURTLE_PIZZA = new FoodComponent.Builder().hunger(14)
      .saturationModifier(2.8F).statusEffect(new StatusEffectInstance(
          StatusEffects.REGENERATION, 5), 1)
      .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
      .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
      .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 0), 1.0F).build();
  public static FoodComponent MILK_STEAK = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
}
