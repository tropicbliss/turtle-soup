package com.tropicbliss.turtlesoup.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class MilkSteak extends Item {

  public MilkSteak(Settings settings) {
    super(settings);
  }

  @Override
  public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
    if (!world.isClient) {
      user.clearStatusEffects();
    }
    return super.finishUsing(stack, world, user);
  }


}
