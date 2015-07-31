package me.quartzdev.DeathCrystals;

import org.bukkit.plugin.java.JavaPlugin;

import me.quartzdev.DeathCrystals.Crystals.CrystalFileManager;

public class Main extends JavaPlugin {
	
	private CrystalFileManager crystalFileManager;
	
	public void onEnable() {
		this.crystalFileManager = new CrystalFileManager();
		this.crystalFileManager.load();
		
		PlayerDeathListener playerDeathListener = new PlayerDeathListener();
		this.getServer().getPluginManager().registerEvents(playerDeathListener, this);
	}
	
	public void onDisable() {
		this.crystalFileManager.save();
	}

}
