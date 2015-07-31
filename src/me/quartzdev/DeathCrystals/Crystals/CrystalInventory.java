package me.quartzdev.DeathCrystals.Crystals;

import java.util.UUID;

import org.bukkit.inventory.Inventory;

public class CrystalInventory {
	
	private Inventory inventory;
	private long expiration;
	private UUID owner;
	
	protected Inventory getInventory() {
		return inventory;
	}
	
	protected long getExpiration() {
		return expiration;
	}
	
	protected UUID getOwner() {
		return owner;
	}
	
	protected void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	protected void setExpiration(long expiration) {
		this.expiration = expiration;
	}
	
	protected void setOwner(UUID owner) {
		this.owner = owner;
	}
	
}
