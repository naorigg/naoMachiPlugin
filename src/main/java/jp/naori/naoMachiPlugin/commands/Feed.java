package jp.naori.naoMachiPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    public Feed(){

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Player only command!");
            return false;
        }
        Player p = (Player) commandSender;

        if(p.hasPermission("feed.use")){
            int maxFoodLevel = 20;
            if(p.getFoodLevel() < maxFoodLevel){
                p.setFoodLevel(maxFoodLevel);
                p.sendMessage(ChatColor.GREEN + "You're been fully fed!");
            } else {
                p.sendMessage(ChatColor.RED + "You're already full!");
            }

        }else {
            p.sendMessage(ChatColor.RED + "You're not permission!");
        }
        return false;
    }
}
