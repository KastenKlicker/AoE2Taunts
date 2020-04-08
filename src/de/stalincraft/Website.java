package de.stalincraft;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author KastenKlicker
 */
public class Website extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("website")){
            TextComponent message = new TextComponent( "Go to the Plugins website!" );
            message.setColor( net.md_5.bungee.api.ChatColor.GOLD );
            message.setBold( true );
            message.setClickEvent( new ClickEvent( ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/age-of-empires-2-taunts.76955/" ) );
            message.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder( "Click here!" ).create() ) );
            
            sender.spigot().sendMessage(message);
        }
        return true;
    }
}    
    

