package az.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import az.commands.Difficulty;

public class Main extends JavaPlugin{
	
	public static String prefix = "§8[§3Betterdifficulty§8] ";
	public static String noPerm = prefix + "§cDu hast keine Rechte dazu!";
	
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix+ "§7enabled");
		this.getCommand("difficulty").setExecutor(new Difficulty());
	}
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(prefix+ "§7disabled");
	}
}
