package com.vinkaitems;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import com.valkcore.modules.TextModule;

public class VinkaItem {
	private ItemStack item;
	private ItemMeta im;
	private String category;
	private double weight = 0;
	private double quality = 100;
	private double rarity = 0.01;
	private int value = 0;
	private boolean gravity = false;

	public VinkaItem(Material material) {
		initialize(material, null, null, null);
	}

	public VinkaItem(Material material, String name) {
		initialize(material, name, null, null);
	}

	public VinkaItem(Material material, String name, String lore) {
		initialize(material, name, lore, null);
	}
	
	public VinkaItem(Material material, String name, String lore, PotionType type) {
		initialize(material, name, lore, type);
	}

	public void setLore(String lore) {
		List<String> list = new ArrayList<String>();

		for (String element : lore.split("\n")) {
			if (element != null)
				list.add(ChatColor.GRAY + TextModule.color(element));
		}
		list.add("");

		im.setLore(list);
		item.setItemMeta(im); // Update item meta.
	}
	
	public void setCategory(String category) {
		this.category = category.toUpperCase();
	}
	
	public void setRarity(double rarity) {
		this.rarity = rarity;
		
		String color = "&8";
		
		if (rarity == Rarity.COMMON()) {
			color = "&8";
		}
		
		if (rarity == Rarity.UNCOMMON()) {
			color = "&7";
		}
		
		if (rarity == Rarity.RARE()) {
			color = "&f";
		}
		
		if (rarity == Rarity.EPIC()) {
			color = "&5";
		}
		
		if (rarity == Rarity.LEGENDARY()) {
			color = "&d";
		}
		
		im.setDisplayName(TextModule.color(color + im.getDisplayName()));
		item.setItemMeta(im); // Update item meta.
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setQuality(double quality) {
		this.quality = quality;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
		
		if (im.getLore() == null) {
			List<String> list = new ArrayList<String>();
			list.add("");
			list.add(TextModule.color("&7Weight: &f" + weight));
			im.setLore(list);
		} else {
			List<String> lore = im.getLore();
			lore.add(TextModule.color("&7Weight: &f" + weight));
			im.setLore(lore);
		}
		
		item.setItemMeta(im);
	}
	
	public void setGravity(boolean gravity) {
		this.gravity = gravity;
		
		if (im.getLore() == null) {
			List<String> list = new ArrayList<String>();
			list.add("");
			list.add(TextModule.color("&7Gravity: &f" + gravity));
			im.setLore(list);
		} else {
			List<String> lore = im.getLore();
			lore.add(TextModule.color("&7Gravity: &f" + gravity));
			im.setLore(lore);
		}
		
		item.setItemMeta(im);
	}
	
	public void setName(String name) {
		im.setDisplayName(TextModule.color(name));
		item.setItemMeta(im); // Update item meta.
	}
	
	public void addEnchantment(Enchantment enchant) {
		im.addEnchant(enchant, 1, true);
		item.setItemMeta(im); // Update item meta.
	}

	private void initialize(Material material, String name, String lore, PotionType type) {
		item = new ItemStack(material);
		im = item.getItemMeta();
	
		if (name != null) {
			// Set to desired name.
			setName(name);
		} else {
			// Set to item name.
			// Convert GOLDEN_PICKAXE to Golden Pickaxe
			String formattedName = "";
			String[] words = material.name().toLowerCase().split("_");
			for (int i = 0; i < words.length; i++) {
				formattedName += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + (i == words.length - 1 ? "" : " ");
			}
			im.setDisplayName(TextModule.color(formattedName));
		}
	
		// Remove item info.
		im.addItemFlags(ItemFlag.values());
		
		if (lore != null && lore != "")
			setLore(lore);
	
		// Update item meta.
		item.setItemMeta(im);
		
		if (type != null) {
			
			PotionMeta pm = (PotionMeta) im;
			pm.setBasePotionData(new PotionData(type));
			pm.removeItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			item.setItemMeta(pm);
		}
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getValue() {
		return value;
	}
	
	public double getRarity() {
		return rarity;
	}
	
	public double getQuality() {
		return quality;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean getGravity() {
		return gravity;
	}

	public ItemStack getItem() {
		return item;
	}
}
