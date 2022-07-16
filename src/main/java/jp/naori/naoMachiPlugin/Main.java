package jp.naori.naoMachiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        System.out.println("Started");
        // startup
        // reloads
        // plugins reload
    }

    @Override
    public void onDisable() {
        // shutdown
        // reloads
        // plugins reload
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("Hello")) {
            if(sender instanceof Player) {
                // Player
                Player player = (Player) sender;
                if(player.hasPermission("hello.use")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Hi ! Welcome to naoMachi!");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&4e &5F&6u&7n&8!"));
                }
                player.sendMessage(ChatColor.RED + "You do not have permission !");
                return true;
            }else {
                sender.sendMessage("Hey Console");
            }
        }

        return false;

    }

}
