package com.tropicbliss.turtlesoup;

import com.tropicbliss.turtlesoup.item.ItemRegistrar;
import com.tropicbliss.turtlesoup.util.LootTableModifier;
import net.fabricmc.api.ModInitializer;

public class TurtleSoupMod implements ModInitializer {

  public static final String MOD_ID = "turtlesoup";

  @Override
  public void onInitialize() {
    ItemRegistrar.register();
    LootTableModifier.initialise();
  }
}
