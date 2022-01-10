package com.tropicbliss.turtlesoup.item;

import com.tropicbliss.turtlesoup.TurtleSoupMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Groups {

  public static final ItemGroup TURTLE_SOUP = FabricItemGroupBuilder.build(new Identifier(
      TurtleSoupMod.MOD_ID, "turtlesoup"), () -> new ItemStack(ItemRegistrar.TURTLE_SOUP));
}
