package me.quartzdev.DeathCrystals;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		PlayerDeathListener playerDeathListener = new PlayerDeathListener();
		this.getServer().getPluginManager().registerEvents(playerDeathListener, this);
	}
	
	public void onDisable() {
		
	}

}
