package com.vinkaitems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionType;

public class VinkaItems extends JavaPlugin {
	public static List<VinkaItem> items = new ArrayList<VinkaItem>();
	public static List<NamespacedKey> recipes = new ArrayList<NamespacedKey>();

	public static VinkaItem OAK_BOAT() {
		VinkaItem item = new VinkaItem(Material.OAK_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem BIRCH_BOAT() {
		VinkaItem item = new VinkaItem(Material.BIRCH_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem SPRUCE_BOAT() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem JUNGLE_BOAT() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem ACACIA_BOAT() {
		VinkaItem item = new VinkaItem(Material.ACACIA_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem DARK_OAK_BOAT() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_BOAT);
		item.setLore("Travel across seas.");
		item.setRarity(Rarity.COMMON());
		item.setValue(250);
		item.setWeight(0.05);
		item.setCategory("transport");
		
		return item;
	}

	public static VinkaItem BLACK_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BLACK_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.RED_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.GREEN_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BROWN_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BLUE_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.PURPLE_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.CYAN_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.GRAY_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.PINK_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIME_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.YELLOW_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.ORANGE_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_GLAZED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.WHITE_GLAZED_TERRACOTTA);
		item.setLore("Respawnable");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(1000000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("respawnable");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ENDER_EYE() {
		VinkaItem item = new VinkaItem(Material.ENDER_EYE);
		item.setLore("So Dense with Ender\nIt Formed a Eye");
		item.setRarity(Rarity.EPIC());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem ENDER_CHEST() {
		VinkaItem item = new VinkaItem(Material.ENDER_CHEST);
		item.setLore("Universal Storage");
		item.setRarity(Rarity.EPIC());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAP() {
		VinkaItem item = new VinkaItem(Material.MAP);
		item.setLore("Show the way!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem PAPER() {
		VinkaItem item = new VinkaItem(Material.PAPER);
		item.setLore("Super thin!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(300);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem BLACK_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.BLACK_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.RED_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.GREEN_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.BROWN_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.BLUE_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.PURPLE_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.CYAN_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.GRAY_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.PINK_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.LIME_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.YELLOW_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.ORANGE_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_CONCRETE_POWDER() {
		VinkaItem item = new VinkaItem(Material.WHITE_CONCRETE_POWDER);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLACK_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.BLACK_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem RED_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.RED_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GREEN_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.GREEN_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BROWN_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.BROWN_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BLUE_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.BLUE_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem PURPLE_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.PURPLE_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem CYAN_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.CYAN_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GRAY_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.GRAY_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem PINK_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.PINK_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIME_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.LIME_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem YELLOW_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.YELLOW_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem MAGENTA_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem ORANGE_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.ORANGE_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem WHITE_CONCRETE() {
		VinkaItem item = new VinkaItem(Material.WHITE_CONCRETE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BLACK_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.BLACK_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.RED_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.GREEN_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.BROWN_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.BLUE_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.PURPLE_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.CYAN_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.GRAY_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.PINK_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.LIME_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.YELLOW_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.ORANGE_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.WHITE_SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SHULKER_BOX() {
		VinkaItem item = new VinkaItem(Material.SHULKER_BOX);
		item.setRarity(Rarity.EPIC());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("storage");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGMA_CREAM() {
		VinkaItem item = new VinkaItem(Material.MAGMA_CREAM);
		item.setLore("Exotic Ore");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem MAGMA_BLOCK() {
		VinkaItem item = new VinkaItem(Material.MAGMA_BLOCK);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("block");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_WEAKNESS() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.WEAKNESS);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_WATER_BREATHING() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.WATER_BREATHING);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_WATER() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.WATER);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_UNCRAFTABLE() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.UNCRAFTABLE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_TURTLE_MASTER() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.TURTLE_MASTER);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_THICK() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.THICK);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_STRENGTH() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.STRENGTH);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_SPEED() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.SPEED);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_SLOWNESS() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.SLOWNESS);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_SLOW_FALLING() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.SLOW_FALLING);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_REGEN() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.REGEN);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_POISON() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.POISON);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_NIGHT_VISION() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.NIGHT_VISION);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_MUNDANE() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.MUNDANE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_LUCK() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.LUCK);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_JUMP() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.JUMP);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_INVISIBILITY() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.INVISIBILITY);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_INSTANT_HEAL() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.INSTANT_HEAL);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_INSTANT_DAMAGE() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.INSTANT_DAMAGE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPLASH_FIRE_RESISTANCE() {
		VinkaItem item = new VinkaItem(Material.SPLASH_POTION, null, null, PotionType.FIRE_RESISTANCE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_WEAKNESS() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.WEAKNESS);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_WATER_BREATHING() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.WATER_BREATHING);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_WATER() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.WATER);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_UNCRAFTABLE() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.UNCRAFTABLE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_TURTLE_MASTER() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.TURTLE_MASTER);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_THICK() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.THICK);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_STRENGTH() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.STRENGTH);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SPEED() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.SPEED);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SLOWNESS() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.SLOWNESS);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_SLOW_FALLING() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.SLOW_FALLING);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_REGEN() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.REGEN);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_POISON() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.POISON);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_NIGHT_VISION() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.NIGHT_VISION);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_MUNDANE() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.MUNDANE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_LUCK() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.LUCK);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_JUMP() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.JUMP);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_INVISIBILITY() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.INVISIBILITY);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_INSTANT_HEAL() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.INSTANT_HEAL);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_INSTANT_DAMAGE() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.INSTANT_DAMAGE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem POTION_FIRE_RESISTANCE() {
		VinkaItem item = new VinkaItem(Material.POTION, null, null, PotionType.FIRE_RESISTANCE);
		item.setRarity(Rarity.RARE());
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("potion");
		
		return item;
	}

	public static VinkaItem GOLDEN_APPLE() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_APPLE);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("food");
		
		return item;
	}

	public static VinkaItem CHORUS_PLANT() {
		VinkaItem item = new VinkaItem(Material.CHORUS_PLANT);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem CHORUS_FRUIT() {
		VinkaItem item = new VinkaItem(Material.CHORUS_FRUIT);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("food");
		
		return item;
	}

	public static VinkaItem PRISMARINE_CRYSTALS() {
		VinkaItem item = new VinkaItem(Material.PRISMARINE_CRYSTALS);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem PRISMARINE_SHARD() {
		VinkaItem item = new VinkaItem(Material.PRISMARINE_SHARD);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem BLAZE_POWDER() {
		VinkaItem item = new VinkaItem(Material.BLAZE_POWDER);
		item.setName("Glitter Dust");
		item.setLore("Powers Up the Brewer");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem RED_SAND() {
		VinkaItem item = new VinkaItem(Material.RED_SAND);
		item.setLore("It Spreads!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem GUNPOWDER() {
		VinkaItem item = new VinkaItem(Material.GUNPOWDER);
		item.setName("Dried Up Souls");
		item.setLore("Soul Dust");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem NETHER_STAR() {
		VinkaItem item = new VinkaItem(Material.NETHER_STAR);
		item.setLore("Exotic Ore");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem COMPARATOR() {
		VinkaItem item = new VinkaItem(Material.COMPARATOR);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("mechanical");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem REPEATER() {
		VinkaItem item = new VinkaItem(Material.REPEATER);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("mechanical");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem DRAGON_HEAD() {
		VinkaItem item = new VinkaItem(Material.DRAGON_HEAD);
		item.setLore("Your special.");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem BLACK_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BLACK_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem RED_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.RED_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GREEN_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.GREEN_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BROWN_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BROWN_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem PURPLE_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.PURPLE_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem CYAN_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.CYAN_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GRAY_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.GRAY_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem PINK_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.PINK_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIME_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIME_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem YELLOW_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.YELLOW_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BLUE_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.BLUE_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem MAGENTA_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem ORANGE_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.ORANGE_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem WHITE_TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.WHITE_TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem TERRACOTTA() {
		VinkaItem item = new VinkaItem(Material.TERRACOTTA);
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem CLAY() {
		VinkaItem item = new VinkaItem(Material.CLAY);
		item.setRarity(Rarity.COMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DAYLIGHT_DETECTOR() {
		VinkaItem item = new VinkaItem(Material.DAYLIGHT_DETECTOR);
		item.setLore("Spidey Senses");
		item.setRarity(Rarity.COMMON());
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("mechanical");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem FLOWER_POT() {
		VinkaItem item = new VinkaItem(Material.FLOWER_POT);
		item.setLore("Plant Holder");
		item.setRarity(Rarity.COMMON());
		item.setValue(2500);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem TRIPWIRE() {
		VinkaItem item = new VinkaItem(Material.TRIPWIRE);
		item.setRarity(Rarity.COMMON());
		item.setValue(2500);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem TRIPWIRE_HOOK() {
		VinkaItem item = new VinkaItem(Material.TRIPWIRE_HOOK);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem DARK_OAK_LOG() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_LOG() {
		VinkaItem item = new VinkaItem(Material.ACACIA_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_LOG() {
		VinkaItem item = new VinkaItem(Material.BIRCH_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_LOG() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_LOG() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_LOG() {
		VinkaItem item = new VinkaItem(Material.OAK_LOG);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem COCOA_BEANS() {
		VinkaItem item = new VinkaItem(Material.COCOA_BEANS);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem NETHER_WART() {
		VinkaItem item = new VinkaItem(Material.NETHER_WART);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem CAKE() {
		VinkaItem item = new VinkaItem(Material.CAKE);
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SUGAR_CANE() {
		VinkaItem item = new VinkaItem(Material.SUGAR_CANE);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem COBWEB() {
		VinkaItem item = new VinkaItem(Material.COBWEB);
		item.setLore("Slows Stuff Down!");
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CACTUS() {
		VinkaItem item = new VinkaItem(Material.CACTUS);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JACK_O_LANTERN() {
		VinkaItem item = new VinkaItem(Material.JACK_O_LANTERN);
		item.setLore("Light");
		item.setRarity(Rarity.RARE());
		item.setValue(3000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("light");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_WARD() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_WARD);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_WAIT() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_WAIT);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_STRAD() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_STRAD);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_STAL() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_STAL);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_MELLOHI() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_MELLOHI);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_MALL() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_MALL);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_FAR() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_FAR);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_CHIRP() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_CHIRP);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_CAT() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_CAT);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_BLOCKS() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_BLOCKS);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_13() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_13);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem MUSIC_DISC_11() {
		VinkaItem item = new VinkaItem(Material.MUSIC_DISC_11);
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("music");
		
		return item;
	}

	public static VinkaItem JUKEBOX() {
		VinkaItem item = new VinkaItem(Material.JUKEBOX);
		item.setLore("Party on!");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("music");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LARGE_FERN() {
		VinkaItem item = new VinkaItem(Material.LARGE_FERN);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem TALL_GRASS() {
		VinkaItem item = new VinkaItem(Material.TALL_GRASS);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PEONY() {
		VinkaItem item = new VinkaItem(Material.PEONY);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ROSE_BUSH() {
		VinkaItem item = new VinkaItem(Material.ROSE_BUSH);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LILAC() {
		VinkaItem item = new VinkaItem(Material.LILAC);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SUNFLOWER() {
		VinkaItem item = new VinkaItem(Material.SUNFLOWER);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LILY_PAD() {
		VinkaItem item = new VinkaItem(Material.LILY_PAD);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem VINE() {
		VinkaItem item = new VinkaItem(Material.VINE);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OXEYE_DAISY() {
		VinkaItem item = new VinkaItem(Material.OXEYE_DAISY);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_TULIP() {
		VinkaItem item = new VinkaItem(Material.PINK_TULIP);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_TULIP() {
		VinkaItem item = new VinkaItem(Material.WHITE_TULIP);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_TULIP() {
		VinkaItem item = new VinkaItem(Material.ORANGE_TULIP);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_TULIP() {
		VinkaItem item = new VinkaItem(Material.RED_TULIP);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem AZURE_BLUET() {
		VinkaItem item = new VinkaItem(Material.AZURE_BLUET);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ALLIUM() {
		VinkaItem item = new VinkaItem(Material.ALLIUM);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_ORCHID() {
		VinkaItem item = new VinkaItem(Material.BLUE_ORCHID);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem POPPY() {
		VinkaItem item = new VinkaItem(Material.POPPY);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DANDELION() {
		VinkaItem item = new VinkaItem(Material.DANDELION);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem FERN() {
		VinkaItem item = new VinkaItem(Material.FERN);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRASS() {
		VinkaItem item = new VinkaItem(Material.GRASS);
		item.setLore("Plant Material");
		item.setRarity(Rarity.COMMON());
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SMOOTH_SANDSTONE() {
		VinkaItem item = new VinkaItem(Material.SMOOTH_SANDSTONE);
		item.setRarity(Rarity.COMMON());
		item.setValue(500);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CHISELED_SANDSTONE() {
		VinkaItem item = new VinkaItem(Material.CHISELED_SANDSTONE);
		item.setRarity(Rarity.COMMON());
		item.setValue(500);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SANDSTONE() {
		VinkaItem item = new VinkaItem(Material.SANDSTONE);
		item.setRarity(Rarity.COMMON());
		item.setValue(500);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLACK_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.BLACK_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.RED_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.GREEN_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.BROWN_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.BLUE_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.PURPLE_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.CYAN_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.GRAY_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.PINK_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.LIME_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.YELLOW_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.ORANGE_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_STAINED_GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.WHITE_STAINED_GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GLASS_PANE() {
		VinkaItem item = new VinkaItem(Material.GLASS_PANE);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLACK_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.BLACK_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.RED_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.GREEN_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.BROWN_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.BLUE_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.PURPLE_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.CYAN_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.GRAY_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.PINK_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.LIME_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.YELLOW_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.ORANGE_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_STAINED_GLASS() {
		VinkaItem item = new VinkaItem(Material.WHITE_STAINED_GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GLASS() {
		VinkaItem item = new VinkaItem(Material.GLASS);
		item.setLore("Windows!");
		item.setRarity(Rarity.UNCOMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SAND() {
		VinkaItem item = new VinkaItem(Material.SAND);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem BLACK_CARPET() {
		VinkaItem item = new VinkaItem(Material.BLACK_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_CARPET() {
		VinkaItem item = new VinkaItem(Material.RED_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_CARPET() {
		VinkaItem item = new VinkaItem(Material.GREEN_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_CARPET() {
		VinkaItem item = new VinkaItem(Material.BROWN_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_CARPET() {
		VinkaItem item = new VinkaItem(Material.BLUE_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_CARPET() {
		VinkaItem item = new VinkaItem(Material.PURPLE_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_CARPET() {
		VinkaItem item = new VinkaItem(Material.CYAN_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_CARPET() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_CARPET() {
		VinkaItem item = new VinkaItem(Material.GRAY_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_CARPET() {
		VinkaItem item = new VinkaItem(Material.PINK_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_CARPET() {
		VinkaItem item = new VinkaItem(Material.LIME_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_CARPET() {
		VinkaItem item = new VinkaItem(Material.YELLOW_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_CARPET() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_CARPET() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_CARPET() {
		VinkaItem item = new VinkaItem(Material.ORANGE_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_CARPET() {
		VinkaItem item = new VinkaItem(Material.WHITE_CARPET);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem COAL_BLOCK() {
		VinkaItem item = new VinkaItem(Material.COAL_BLOCK);
		item.setName("Dense Coal Block");
		item.setRarity(Rarity.RARE());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPONGE() {
		VinkaItem item = new VinkaItem(Material.SPONGE);
		item.setRarity(Rarity.RARE());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DROPPER() {
		VinkaItem item = new VinkaItem(Material.DROPPER);
		item.setRarity(Rarity.RARE());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("mechanical");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_LEAVES() {
		VinkaItem item = new VinkaItem(Material.BIRCH_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_LEAVES() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_LEAVES() {
		VinkaItem item = new VinkaItem(Material.ACACIA_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_LEAVES() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_LEAVES() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_LEAVES() {
		VinkaItem item = new VinkaItem(Material.OAK_LEAVES);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem COBBLESTONE() {
		VinkaItem item = new VinkaItem(Material.COBBLESTONE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PODZOL() {
		VinkaItem item = new VinkaItem(Material.PODZOL);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LAPIS_BLOCK() {
		VinkaItem item = new VinkaItem(Material.LAPIS_BLOCK);
		item.setName("Super Dense Azurite Block");
		item.setLore("Compacted with Azurite!");
		item.setRarity(Rarity.LEGENDARY());
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem POLISHED_DIORITE() {
		VinkaItem item = new VinkaItem(Material.POLISHED_DIORITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem DIORITE() {
		VinkaItem item = new VinkaItem(Material.DIORITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem POLISHED_GRANITE() {
		VinkaItem item = new VinkaItem(Material.POLISHED_GRANITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GRANITE() {
		VinkaItem item = new VinkaItem(Material.GRANITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem POLISHED_ANDESITE() {
		VinkaItem item = new VinkaItem(Material.POLISHED_ANDESITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem ANDESITE() {
		VinkaItem item = new VinkaItem(Material.ANDESITE);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BRICKS() {
		VinkaItem item = new VinkaItem(Material.BRICKS);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem STONE_BRICKS() {
		VinkaItem item = new VinkaItem(Material.STONE_BRICKS);
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem SOUL_SAND() {
		VinkaItem item = new VinkaItem(Material.SOUL_SAND);
		item.setName("Soul Cluster");
		item.setLore("Holds a Cluster of Souls");
		item.setRarity(Rarity.EPIC());
		item.setValue(100000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHEAT() {
		VinkaItem item = new VinkaItem(Material.WHEAT);
		item.setLore("Breed Animals");
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem CARROT() {
		VinkaItem item = new VinkaItem(Material.CARROT);
		item.setLore("Yeilds String on Harvest");
		item.setRarity(Rarity.COMMON());
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem ENHANCED_HELMET() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_HELMET);
		item.setName("Enchanced Helmet");
		item.setLore("Advanced Variation of the Azurite Helmet");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem ENHANCED_CHESTPLATE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_CHESTPLATE);
		item.setName("Enchanced Chestplate");
		item.setLore("Advanced Variation of the Azurite Chestplate");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem ENHANCED_LEGGINGS() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_LEGGINGS);
		item.setName("Enchanced Leggings");
		item.setLore("Advanced Variation of the Azurite Leggings");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem ENHANCED_BOOTS() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_BOOTS);
		item.setName("Enchanced Boots");
		item.setLore("Advanced Variation of the Azurite Boots");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem ENHANCED_BOW() {
		VinkaItem item = new VinkaItem(Material.BOW);
		item.setName("Enchanced Bow");
		item.setLore("Advanced Variation of the Bow");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.ARROW_DAMAGE);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem ENHANCED_SWORD() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_SWORD);
		item.setName("Enchanced Sword");
		item.setLore("Advanced Variation of the Sword");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.DAMAGE_ALL);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem ENHANCED_AXE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_AXE);
		item.setName("Enchanced Axe");
		item.setLore("Advanced Variation of the Axe");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.DURABILITY);
		item.addEnchantment(Enchantment.DIG_SPEED);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem ENHANCED_HOE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_HOE);
		item.setName("Enchanced Azurite Hoe");
		item.setLore("Advanced Variation of the Azurite Hoe");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.DURABILITY);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem ENHANCED_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_PICKAXE);
		item.setName("Enchanced Azurite Pickaxe");
		item.setLore("Advanced Variation of the Azurite Pickaxe" + "\nCrouch while mining to mine a 3x3x3 area.");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.DURABILITY);
		item.addEnchantment(Enchantment.DIG_SPEED);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem ENHANCED_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_SHOVEL);
		item.setName("Enchanced Azurite Shovel");
		item.setLore("Advanced Variation of the Azurite Shovel");
		item.setValue(100000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.addEnchantment(Enchantment.DURABILITY);
		item.addEnchantment(Enchantment.DIG_SPEED);
		item.setCategory("weapon");
		
		return item;
	}

	public static VinkaItem BONE_MEAL() {
		VinkaItem item = new VinkaItem(Material.BONE_MEAL);
		item.setName("Cluster of Bones");
		item.setLore("Plant Steroids");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem ENDER_PEARL() {
		VinkaItem item = new VinkaItem(Material.ENDER_PEARL);
		item.setName("Orb");
		item.setLore("Mysterious Orb" + "\nIt's like a ingot.");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem FLINT_AND_STEEL() {
		VinkaItem item = new VinkaItem(Material.FLINT_AND_STEEL);
		item.setName("Ms Fire");
		item.setLore("Are you ready for the nether?");
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem DIAMOND_HORSE_ARMOR() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_HORSE_ARMOR);
		item.setName("Azurite Horse Armor");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem GOLDEN_HORSE_ARMOR() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_HORSE_ARMOR);
		item.setName("Limonite Horse Armor");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem IRON_HORSE_ARMOR() {
		VinkaItem item = new VinkaItem(Material.IRON_HORSE_ARMOR);
		item.setName("Cersurrite Horse Armor");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem SHEARS() {
		VinkaItem item = new VinkaItem(Material.SHEARS);
		item.setName("Ms. Cutty");
		item.setLore("Snip! Snip!");
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem LAPIS_LAZULI() {
		VinkaItem item = new VinkaItem(Material.LAPIS_LAZULI);
		item.setLore("Enchantment Table Essence");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem BEACON() {
		VinkaItem item = new VinkaItem(Material.BEACON);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OBSIDIAN() {
		VinkaItem item = new VinkaItem(Material.OBSIDIAN);
		item.setLore("Very tough!" + "\nReady for the nether?");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CAULDRON() {
		VinkaItem item = new VinkaItem(Material.CAULDRON);
		item.setLore("Brew Stuff");
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ELYTRA() {
		VinkaItem item = new VinkaItem(Material.ELYTRA);
		item.setLore("Right Click the Air"
				+ "\nTo Fly Sky High!");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem STICKY_PISTON() {
		VinkaItem item = new VinkaItem(Material.STICKY_PISTON);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem PISTON() {
		VinkaItem item = new VinkaItem(Material.PISTON);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem REDSTONE() {
		VinkaItem item = new VinkaItem(Material.REDSTONE);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem ANVIL() {
		VinkaItem item = new VinkaItem(Material.ANVIL);
		item.setName("Coin Maker");
		item.setLore("Makes Coins from Items"
				+ "\nRight Click with any Item");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DISPENSER() {
		VinkaItem item = new VinkaItem(Material.DISPENSER);
		item.setLore("Pew pew pew!");
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DONKEY_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.DONKEY_SPAWN_EGG);
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem HORSE_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.HORSE_SPAWN_EGG);
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem LLAMA_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.LLAMA_SPAWN_EGG);
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem MULE_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.MULE_SPAWN_EGG);
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem CHICKEN_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.CHICKEN_SPAWN_EGG);
		item.setLore("Drops a Soul Every 5 - 10 Minutes.");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem SHEEP_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.SHEEP_SPAWN_EGG);
		item.setLore("Gives Iron Ore Once Sheared.");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem WOLF_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.WOLF_SPAWN_EGG);
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem VILLAGER_SPAWN_EGG() {
		VinkaItem item = new VinkaItem(Material.VILLAGER_SPAWN_EGG);
		item.setLore("Sells All Sorts of Useful Items");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem LIME_DYE() {
		VinkaItem item = new VinkaItem(Material.LIME_DYE);
		item.setName("Unrefined Tennantite");
		item.setLore("A Very Dull Ore");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem EMERALD() {
		VinkaItem item = new VinkaItem(Material.EMERALD);
		item.setName("Refined Tennantite");
		item.setLore("It Glimmers in the Sunlight");
		item.setValue(100000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("ore");
		
		return item;
	}

	public static VinkaItem LEAD() {
		VinkaItem item = new VinkaItem(Material.LEAD);
		item.setValue(5000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem SADDLE() {
		VinkaItem item = new VinkaItem(Material.SADDLE);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem SIGN() {
		VinkaItem item = new VinkaItem(Material.OAK_SIGN);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_DOOR() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_DOOR() {
		VinkaItem item = new VinkaItem(Material.ACACIA_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_DOOR() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_DOOR() {
		VinkaItem item = new VinkaItem(Material.BIRCH_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_DOOR() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_DOOR() {
		VinkaItem item = new VinkaItem(Material.OAK_DOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_SLAB() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_SLAB() {
		VinkaItem item = new VinkaItem(Material.ACACIA_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_SLAB() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_SLAB() {
		VinkaItem item = new VinkaItem(Material.BIRCH_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_SLAB() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_SLAB() {
		VinkaItem item = new VinkaItem(Material.OAK_SLAB);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_PLANKS() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_PLANKS() {
		VinkaItem item = new VinkaItem(Material.ACACIA_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_PLANKS() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_PLANKS() {
		VinkaItem item = new VinkaItem(Material.BIRCH_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_PLANKS() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_PLANKS() {
		VinkaItem item = new VinkaItem(Material.OAK_PLANKS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CHEST() {
		VinkaItem item = new VinkaItem(Material.CHEST);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.OAK_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}
	
	public static VinkaItem BIRCH_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.BIRCH_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}
	
	public static VinkaItem SPRUCE_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}
	
	public static VinkaItem ACACIA_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.ACACIA_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}
	
	public static VinkaItem DARK_OAK_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}
	
	public static VinkaItem JUNGLE_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_TRAPDOOR);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BLACK_BED() {
		VinkaItem item = new VinkaItem(Material.BLACK_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_BED() {
		VinkaItem item = new VinkaItem(Material.RED_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_BED() {
		VinkaItem item = new VinkaItem(Material.GREEN_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_BED() {
		VinkaItem item = new VinkaItem(Material.BROWN_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_BED() {
		VinkaItem item = new VinkaItem(Material.BLUE_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_BED() {
		VinkaItem item = new VinkaItem(Material.PURPLE_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_BED() {
		VinkaItem item = new VinkaItem(Material.CYAN_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_BED() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_BED() {
		VinkaItem item = new VinkaItem(Material.GRAY_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_BED() {
		VinkaItem item = new VinkaItem(Material.PINK_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_BED() {
		VinkaItem item = new VinkaItem(Material.LIME_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_BED() {
		VinkaItem item = new VinkaItem(Material.YELLOW_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_BED() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_BED() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_BED() {
		VinkaItem item = new VinkaItem(Material.ORANGE_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_BED() {
		VinkaItem item = new VinkaItem(Material.WHITE_BED);
		item.setValue(5000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_FENCE() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_FENCE() {
		VinkaItem item = new VinkaItem(Material.ACACIA_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_FENCE() {
		VinkaItem item = new VinkaItem(Material.BIRCH_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_FENCE() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_FENCE() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_FENCE() {
		VinkaItem item = new VinkaItem(Material.OAK_FENCE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.ACACIA_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem DARK_OAK_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.BIRCH_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_FENCE_GATE() {
		VinkaItem item = new VinkaItem(Material.OAK_FENCE_GATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_BANNER() {
		VinkaItem item = new VinkaItem(Material.WHITE_BANNER);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LADDER() {
		VinkaItem item = new VinkaItem(Material.LADDER);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem REDSTONE_TORCH() {
		VinkaItem item = new VinkaItem(Material.REDSTONE_TORCH);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_PRESSURE_PLATE() {
		VinkaItem item = new VinkaItem(Material.OAK_PRESSURE_PLATE);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem STICK() {
		VinkaItem item = new VinkaItem(Material.STICK);
		item.setName("Twig");
		item.setLore("A Sturdy Twig");
		item.setValue(5000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem ITEM_FRAME() {
		VinkaItem item = new VinkaItem(Material.ITEM_FRAME);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem DARK_OAK_STAIRS() {
		VinkaItem item = new VinkaItem(Material.DARK_OAK_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem JUNGLE_STAIRS() {
		VinkaItem item = new VinkaItem(Material.JUNGLE_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ACACIA_STAIRS() {
		VinkaItem item = new VinkaItem(Material.ACACIA_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BIRCH_STAIRS() {
		VinkaItem item = new VinkaItem(Material.BIRCH_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SPRUCE_STAIRS() {
		VinkaItem item = new VinkaItem(Material.SPRUCE_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_STAIRS() {
		VinkaItem item = new VinkaItem(Material.OAK_STAIRS);
		item.setValue(5000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_BUTTON() {
		VinkaItem item = new VinkaItem(Material.OAK_BUTTON);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem BOWL() {
		VinkaItem item = new VinkaItem(Material.BOWL);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem STRING() {
		VinkaItem item = new VinkaItem(Material.STRING);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("material");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLACK_WOOL() {
		VinkaItem item = new VinkaItem(Material.BLACK_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RED_WOOL() {
		VinkaItem item = new VinkaItem(Material.RED_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GREEN_WOOL() {
		VinkaItem item = new VinkaItem(Material.GREEN_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BROWN_WOOL() {
		VinkaItem item = new VinkaItem(Material.BROWN_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BLUE_WOOL() {
		VinkaItem item = new VinkaItem(Material.BLUE_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PURPLE_WOOL() {
		VinkaItem item = new VinkaItem(Material.PURPLE_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem CYAN_WOOL() {
		VinkaItem item = new VinkaItem(Material.CYAN_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_WOOL() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem GRAY_WOOL() {
		VinkaItem item = new VinkaItem(Material.GRAY_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem PINK_WOOL() {
		VinkaItem item = new VinkaItem(Material.PINK_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIME_WOOL() {
		VinkaItem item = new VinkaItem(Material.LIME_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem YELLOW_WOOL() {
		VinkaItem item = new VinkaItem(Material.YELLOW_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_WOOL() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem MAGENTA_WOOL() {
		VinkaItem item = new VinkaItem(Material.MAGENTA_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_WOOL() {
		VinkaItem item = new VinkaItem(Material.ORANGE_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem WHITE_WOOL() {
		VinkaItem item = new VinkaItem(Material.WHITE_WOOL);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RABBIT_FOOT() {
		VinkaItem item = new VinkaItem(Material.RABBIT_FOOT);
		item.setName("Stripped Wood");
		item.setValue(100);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("material");
		
		return item;
	}

	public static VinkaItem FISHING_ROD() {
		VinkaItem item = new VinkaItem(Material.FISHING_ROD);
		item.setValue(1000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem WOODEN_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.WOODEN_PICKAXE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem WOODEN_AXE() {
		VinkaItem item = new VinkaItem(Material.WOODEN_AXE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem WOODEN_HOE() {
		VinkaItem item = new VinkaItem(Material.WOODEN_HOE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem WOODEN_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.WOODEN_SHOVEL);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem WOODEN_SWORD() {
		VinkaItem item = new VinkaItem(Material.WOODEN_SWORD);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem BOW() {
		VinkaItem item = new VinkaItem(Material.BOW);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem STONE_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.STONE_PICKAXE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem STONE_AXE() {
		VinkaItem item = new VinkaItem(Material.STONE_AXE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem STONE_HOE() {
		VinkaItem item = new VinkaItem(Material.STONE_HOE);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem STONE_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.STONE_SHOVEL);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem STONE_SWORD() {
		VinkaItem item = new VinkaItem(Material.STONE_SWORD);
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem IRON_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.IRON_PICKAXE);
		item.setName("Cerssurite Pickaxe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem IRON_AXE() {
		VinkaItem item = new VinkaItem(Material.IRON_AXE);
		item.setName("Cerssurite Axe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem IRON_HOE() {
		VinkaItem item = new VinkaItem(Material.IRON_HOE);
		item.setName("Cerssurite Hoe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem IRON_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.IRON_SHOVEL);
		item.setName("Cerssurite Shovel");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem IRON_SWORD() {
		VinkaItem item = new VinkaItem(Material.IRON_SWORD);
		item.setName("Cerssurite Sword");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem GOLDEN_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_PICKAXE);
		item.setName("Limonite Pickaxe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem GOLDEN_AXE() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_AXE);
		item.setName("Limonite Axe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem GOLDEN_HOE() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_HOE);
		item.setName("Limonite Hoe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem GOLDEN_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_SHOVEL);
		item.setName("Limonite Shovel");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem GOLDEN_SWORD() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_SWORD);
		item.setName("Limonite Sword");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.EPIC());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIAMOND_PICKAXE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_PICKAXE);
		item.setName("Azurite Pickaxe");
		item.setLore("Crouch While Mining to Mine a 3x3x3 Area.");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIAMOND_AXE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_AXE);
		item.setName("Azurite Axe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIAMOND_HOE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_HOE);
		item.setName("Azurite Hoe");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIAMOND_SHOVEL() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_SHOVEL);
		item.setName("Azurite Shovel");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIAMOND_SWORD() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_SWORD);
		item.setName("Azurite Sword");
		item.setValue(1000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem ARROW() {
		VinkaItem item = new VinkaItem(Material.ARROW);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("tool");
		
		return item;
	}

	public static VinkaItem DIRT() {
		VinkaItem item = new VinkaItem(Material.DIRT);
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem STONE_SLAB() {
		VinkaItem item = new VinkaItem(Material.STONE_SLAB);
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem STONE() {
		VinkaItem item = new VinkaItem(Material.STONE);
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem FURNACE() {
		VinkaItem item = new VinkaItem(Material.FURNACE);
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem HOPPER() {
		VinkaItem item = new VinkaItem(Material.HOPPER);
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem IRON_INGOT() {
		VinkaItem item = new VinkaItem(Material.IRON_INGOT);
		item.setName("Refined Cerussite");
		item.setValue(1000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem GOLD_INGOT() {
		VinkaItem item = new VinkaItem(Material.GOLD_INGOT);
		item.setName("Refined Limonite");
		item.setValue(1000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem DIAMOND() {
		VinkaItem item = new VinkaItem(Material.DIAMOND);
		item.setName("Refined Azurite");
		item.setValue(1000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem IRON_BLOCK() {
		VinkaItem item = new VinkaItem(Material.IRON_BLOCK);
		item.setName("Condensed Cerussite");
		item.setValue(1000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem CRAFTING_TABLE() {
		VinkaItem item = new VinkaItem(Material.CRAFTING_TABLE);
		item.setLore("Explore Many New Recipes");
		item.setValue(1000);
		item.setWeight(Weight.VERY_HEAVY());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem COAL() {
		VinkaItem item = new VinkaItem(Material.COAL);
		item.setLore("Used to Make Iron Ore");
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem LIGHT_GRAY_DYE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_GRAY_DYE);
		item.setName("Unrefined Cerussite");
		item.setLore("Burn it in a Furnace");
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem DANDELION_YELLOW() {
		VinkaItem item = new VinkaItem(Material.DANDELION);
		item.setName("Unrefined Limonite");
		item.setLore("Burn it in a Furnace");
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.EPIC());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem LIGHT_BLUE_DYE() {
		VinkaItem item = new VinkaItem(Material.LIGHT_BLUE_DYE);
		item.setName("Unrefined Azurite");
		item.setLore("Burn it in a Furnace");
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem GRAY_DYE() {
		VinkaItem item = new VinkaItem(Material.GRAY_DYE);
		item.setName("Stone Pebble");
		item.setLore("Better than a Wood Pebble?");
		item.setValue(1000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem DRIED_KELP() {
		VinkaItem item = new VinkaItem(Material.DRIED_KELP);
		item.setName("Dirt Scraps");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem BEETROOT_SEEDS() {
		VinkaItem item = new VinkaItem(Material.BEETROOT_SEEDS);
		item.setLore("Grows Fast but Not Very Rich" + "\nSpreads Across the World Naturally");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem BEETROOT() {
		VinkaItem item = new VinkaItem(Material.BEETROOT);
		item.setLore("A Juicy Fruit");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem POTATO() {
		VinkaItem item = new VinkaItem(Material.POTATO);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem SUGAR() {
		VinkaItem item = new VinkaItem(Material.SUGAR);
		item.setName("Souls");
		item.setLore("A Ghastly White Essence" + "\nStares into Your Hearts" + "\n" + "\nRight Click to Absorb the"
				+ "\nSouls.");
		item.addEnchantment(Enchantment.LUCK);
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem MELON_SEEDS() {
		VinkaItem item = new VinkaItem(Material.MELON_SEEDS);
		item.setName("Cookie Plant Seeds");
		item.setLore("Grows Slightly Slower" + "\nBut Has a More Rewarding" + "\nTaste.");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem COOKIE() {
		VinkaItem item = new VinkaItem(Material.COOKIE);
		item.setName("Cookie Plant Fibre");
		item.setLore("Yumm");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem WHEAT_SEEDS() {
		VinkaItem item = new VinkaItem(Material.WHEAT_SEEDS);
		item.setName("Super Plant");
		item.setLore("Grows Super Slow But" + "\nVery Rewarding. Spreads" + "\nAcross the World Naturally.");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem BAKED_POTATO() {
		VinkaItem item = new VinkaItem(Material.BAKED_POTATO);
		item.setName("Super Fruit");
		item.setValue(1000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		
		return item;
	}

	public static VinkaItem LEATHER_BOOTS() {
		VinkaItem item = new VinkaItem(Material.LEATHER_BOOTS);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem LEATHER_LEGGINGS() {
		VinkaItem item = new VinkaItem(Material.LEATHER_LEGGINGS);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem LEATHER_CHESTPLATE() {
		VinkaItem item = new VinkaItem(Material.LEATHER_CHESTPLATE);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem LEATHER_HELMET() {
		VinkaItem item = new VinkaItem(Material.LEATHER_HELMET);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem IRON_BOOTS() {
		VinkaItem item = new VinkaItem(Material.IRON_BOOTS);
		item.setName("Cerssurite Boots");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem IRON_LEGGINGS() {
		VinkaItem item = new VinkaItem(Material.IRON_LEGGINGS);
		item.setName("Cerssurite Leggings");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem IRON_CHESTPLATE() {
		VinkaItem item = new VinkaItem(Material.IRON_CHESTPLATE);
		item.setName("Cerssurite Chestplate");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem IRON_HELMET() {
		VinkaItem item = new VinkaItem(Material.IRON_HELMET);
		item.setName("Cerssurite Helmet");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem GOLDEN_BOOTS() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_BOOTS);
		item.setName("Limonite Boots");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem GOLDEN_LEGGINGS() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_LEGGINGS);
		item.setName("Limonite Leggings");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem GOLDEN_CHESTPLATE() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_CHESTPLATE);
		item.setName("Limonite Chestplate");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem GOLDEN_HELMET() {
		VinkaItem item = new VinkaItem(Material.GOLDEN_HELMET);
		item.setName("Limonite Helmet");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem DIAMOND_BOOTS() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_BOOTS);
		item.setName("Azurite Boots");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem DIAMOND_LEGGINGS() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_LEGGINGS);
		item.setName("Azurite Leggings");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem DIAMOND_CHESTPLATE() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_CHESTPLATE);
		item.setName("Azurite Chestplate");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem DIAMOND_HELMET() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_HELMET);
		item.setName("Azurite Helmet");
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem TNT() {
		VinkaItem item = new VinkaItem(Material.TNT);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("msc");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem RAIL() {
		VinkaItem item = new VinkaItem(Material.RAIL);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem POWERED_RAIL() {
		VinkaItem item = new VinkaItem(Material.POWERED_RAIL);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem DETECTOR_RAIL() {
		VinkaItem item = new VinkaItem(Material.DETECTOR_RAIL);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem ACTIVATOR_RAIL() {
		VinkaItem item = new VinkaItem(Material.ACTIVATOR_RAIL);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem MINECART() {
		VinkaItem item = new VinkaItem(Material.MINECART);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem LEVER() {
		VinkaItem item = new VinkaItem(Material.LEVER);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem IRON_TRAPDOOR() {
		VinkaItem item = new VinkaItem(Material.IRON_TRAPDOOR);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem IRON_DOOR() {
		VinkaItem item = new VinkaItem(Material.IRON_DOOR);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem STONE_BUTTON() {
		VinkaItem item = new VinkaItem(Material.STONE_BUTTON);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		
		return item;
	}

	public static VinkaItem STONE_PRESSURE_PLATE() {
		VinkaItem item = new VinkaItem(Material.STONE_PRESSURE_PLATE);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SHIELD() {
		VinkaItem item = new VinkaItem(Material.SHIELD);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem CARVED_PUMPKIN() {
		VinkaItem item = new VinkaItem(Material.CARVED_PUMPKIN);
		item.setName("Mask");
		item.setLore("Wearing this Will Hide You from Monsters");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem ORANGE_DYE() {
		VinkaItem item = new VinkaItem(Material.ORANGE_DYE);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem CYAN_DYE() {
		VinkaItem item = new VinkaItem(Material.CYAN_DYE);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem ROSE_RED() {
		VinkaItem item = new VinkaItem(Material.ROSE_BUSH);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("armor");
		
		return item;
	}

	public static VinkaItem SALMON() {
		VinkaItem item = new VinkaItem(Material.SALMON);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("food");
		
		return item;
	}

	public static VinkaItem COOKED_SALMON() {
		VinkaItem item = new VinkaItem(Material.COOKED_SALMON);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("food");
		
		return item;
	}

	public static VinkaItem ENCHANTING_TABLE() {
		VinkaItem item = new VinkaItem(Material.ENCHANTING_TABLE);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("building");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BOOK() {
		VinkaItem item = new VinkaItem(Material.BOOK);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("msc");
		
		return item;
	}
	
	public static VinkaItem BOOKSHELF() {
		VinkaItem item = new VinkaItem(Material.BOOKSHELF);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.RARE());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem BREWING_STAND() {
		VinkaItem item = new VinkaItem(Material.BREWING_STAND);
		item.setValue(10000);
		item.setWeight(Weight.MEDIUM());
		item.setRarity(Rarity.EPIC());
		item.setCategory("msc");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem BUCKET() {
		VinkaItem item = new VinkaItem(Material.BUCKET);
		item.setValue(10000);
		item.setWeight(Weight.LIGHT());
		item.setRarity(Rarity.UNCOMMON());
		item.setCategory("msc");
		
		return item;
	}

	public static VinkaItem DIAMOND_BLOCK() {
		VinkaItem item = new VinkaItem(Material.DIAMOND_BLOCK);
		item.setValue(10000);
		item.setWeight(Weight.HEAVY());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem OAK_SAPLING() {
		VinkaItem item = new VinkaItem(Material.OAK_SAPLING);
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.COMMON());
		item.setCategory("plant");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem TORCH() {
		VinkaItem item = new VinkaItem(Material.TORCH);
		item.setName("Bright Torch");
		item.setLore("It Shines Brightly");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("light");
		item.setGravity(false);
		
		return item;
	}

	public static VinkaItem GLOWSTONE() {
		VinkaItem item = new VinkaItem(Material.GLOWSTONE);
		item.setName("Bright Block");
		item.setLore("It Shines Brightly");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("light");
		item.setGravity(true);
		
		return item;
	}

	public static VinkaItem SEA_LANTERN() {
		VinkaItem item = new VinkaItem(Material.SEA_LANTERN);
		item.setName("Aqua Bright Block");
		item.setLore("It Shines Brightly");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("light");
		item.setGravity(true);
		
		return item;
	}
	
	public static VinkaItem GOLD_NUGGET() {
		VinkaItem item = new VinkaItem(Material.GOLD_NUGGET);
		item.setName("Coin");
		item.setLore("Currency");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.RARE());
		item.setCategory("msc");
		
		return item;
	}
	
	public static VinkaItem BOOK_RECIPES() {
		VinkaItem item = new VinkaItem(Material.WRITTEN_BOOK);
		item.setName("Recipes");
		item.setLore("Right Click to Open");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}
	
	public static VinkaItem BOOK_SHOP() {
		VinkaItem item = new VinkaItem(Material.WRITTEN_BOOK);
		item.setName("Shop");
		item.setLore("Right Click to Open");
		item.setValue(10000);
		item.setWeight(Weight.VERY_LIGHT());
		item.setRarity(Rarity.LEGENDARY());
		item.setCategory("msc");
		
		return item;
	}
}
