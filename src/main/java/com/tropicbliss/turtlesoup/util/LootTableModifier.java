package com.tropicbliss.turtlesoup.util;

import com.tropicbliss.turtlesoup.item.ItemRegistrar;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTableModifier {

  private static final Identifier TURTLE_ID = new Identifier("minecraft", "entities/turtle");

  public static void initialise() {
    LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
      if (id.equals(TURTLE_ID)) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(
                ConstantLootNumberProvider.create(1))
            .conditionally(RandomChanceLootCondition.builder(0.5F)).with(
                ItemEntry.builder(ItemRegistrar.TURTLE)).withFunction(SetCountLootFunction.builder(
                UniformLootNumberProvider.create(1, 1)).build());
        supplier.withPool(poolBuilder.build());
      }
      if (id.toString().startsWith("minecraft:entities")) {
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
            .rolls(ConstantLootNumberProvider.create(1))
            .conditionally(RandomChanceLootCondition.builder(0.02F))
            .with(ItemEntry.builder(ItemRegistrar.TURTLE_PIZZA))
            .withFunction(
                SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)).build());
        supplier.withPool(poolBuilder.build());
      }
    }));
  }
}
