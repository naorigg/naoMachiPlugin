package jp.naori.naoMachiPlugin.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Hello extends JavaPlugin {

    public Hello(){

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        /* "Hello" Command
         *  Used as a "Test" Command
         */

        if(label.equalsIgnoreCase("Hello")) {
            if(sender instanceof Player) {
                // Player
                Player player = (Player) sender;
                if(player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Hi ! Welcome to naoMachi!");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e &5F&6u&7n&8!"));
                }else{
                    player.sendMessage(ChatColor.RED + "You don't have permission !");
                }

                return true;
            }else {
                sender.sendMessage("Hey Console");
                return true;
            }
        }
        return false;

    }

}
