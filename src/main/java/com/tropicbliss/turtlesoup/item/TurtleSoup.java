package com.tropicbliss.turtlesoup.item;

import java.util.List;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TurtleSoup extends Item {

  public TurtleSoup(Settings settings) {
    super(settings);
  }

  @Override
  public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
    super.finishUsing(stack, world, user);
    if (stack.isEmpty()) {
      return new ItemStack(Items.BOWL);
    } else {
      if (user instanceof PlayerEntity playerEntity
          && !((PlayerEntity) user).getAbilities().creativeMode) {
        ItemStack itemStack = new ItemStack(Items.BOWL);
        if (!playerEntity.getInventory().insertStack(itemStack)) {
          playerEntity.dropItem(itemStack, false);
        }
      }
      return stack;
    }
  }

  @Override
  public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip,
      TooltipContext context) {
    tooltip.add(new TranslatableText("item.turtlesoup.turtle_soup.tooltip"));
  }
}
