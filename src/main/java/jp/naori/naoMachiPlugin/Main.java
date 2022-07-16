package jp.naori.naoMachiPlugin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        System.out.println("Plugin Started !!");
        // Startup
        // Reloads
        // Plugins reload
    }
    @Override
    public void onDisable() {
        // Shutdown
        // Reloads
        // Plugins reload
    }
/* Commands Section */
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
                    player.sendMessage(ChatColor.RED + "You do not have permission !");
                }

                return true;
            }else {
                sender.sendMessage("Hey Console");
                return true;
            }
        }
        return false;


        /* "Jump" Command */

        if(label.equalsIgnoreCase("Jump")){
            if(!(sender instanceof Player)){
                sender.sendMessage("A player goes flynig");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0){
                // /launch
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Juuuuuuuuuuuuuuuump !");
                player.setVelocity(player.getLocation().getDirection()).multiply(Integer.parseInt(args[0])).setY(2);
            }
        }
        return false;

    }

}
