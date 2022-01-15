package com.tropicbliss.turtlesoup.item;

import java.util.List;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TurtleMeat extends Item {

  public TurtleMeat(Settings settings) {
    super(settings);
  }

  @Override
  public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip,
      TooltipContext context) {
    tooltip.add(new TranslatableText("item.turtlesoup.turtle_meat.tooltip"));
  }
}
