package az.commands;



import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import az.main.Main;


public class Difficulty implements CommandExecutor{


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String labels, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("difficulty")) {		
				if(p.isOp()) {
					if(args.length == 1) {
						if(args[0].equalsIgnoreCase("0")) {
							Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.PEACEFUL);
							p.sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Friedlich gesetzt!");
						}else if(args[0].equalsIgnoreCase("1")) {
							Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.EASY);
							p.sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Einfach gesetzt!");
						}else if(args[0].equalsIgnoreCase("2")) {
							Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.NORMAL);
							p.sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Normal gesetzt!");
						}else if(args[0].equalsIgnoreCase("3")) {
							Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.HARD);
							p.sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Hard gesetzt!");
						}else {
							p.sendMessage(Main.prefix + "§cBitte benutze /difficulty 0/1/2/3!");
						}			
					}else {
						p.sendMessage(Main.prefix + "§cBitte benutze /difficulty 0/1/2/3!");
					}
				
				}else {
					p.sendMessage(Main.noPerm);
				}
				}
			
		}else {
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("0")) {
					Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.PEACEFUL);
					Bukkit.getConsoleSender().sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Friedlich gesetzt!");
				}else if(args[0].equalsIgnoreCase("1")) {
					Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.EASY);
					Bukkit.getConsoleSender().sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Einfach gesetzt!");
				}else if(args[0].equalsIgnoreCase("2")) {
					Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.NORMAL);
					Bukkit.getConsoleSender().sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Normal gesetzt!");
				}else if(args[0].equalsIgnoreCase("3")) {
					Bukkit.getWorlds().get(0).setDifficulty(org.bukkit.Difficulty.HARD);
					Bukkit.getConsoleSender().sendMessage(Main.prefix+ "§7Du hast die Schwierigkeit erfolgreich auf Hard gesetzt!");
				}else {
					Bukkit.getConsoleSender().sendMessage(Main.prefix + "§cBitte benutze /difficulty 0/1/2/3!");
				}
		}else {
			Bukkit.getConsoleSender().sendMessage(Main.prefix + "§cBitte benutze /difficulty 0/1/2/3!");
		}
		}
		
		return false;
	}

}
