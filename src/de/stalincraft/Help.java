package de.stalincraft;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author KastenKlicker
 */
public class Help implements CommandExecutor{

    /**
     *
     * @param sender
     * @param command
     * @param label
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (label.equalsIgnoreCase("taunts")) {
            sender.sendMessage(ChatColor.GREEN + "The following taunts are available");
            sender.sendMessage(ChatColor.GREEN + "/1 Yes.");
            sender.sendMessage(ChatColor.GREEN + "/2 No.");
            sender.sendMessage(ChatColor.GREEN + "/3 Food please.");
            sender.sendMessage(ChatColor.GREEN + "/4 Wood please.");
            sender.sendMessage(ChatColor.GREEN + "/5 Gold please.");
            sender.sendMessage(ChatColor.GREEN + "/6 Stone please.");
            sender.sendMessage(ChatColor.GREEN + "/7 Ahhhh!");
            sender.sendMessage(ChatColor.GREEN + "/8 All hail, king of the losers!");
            sender.sendMessage(ChatColor.GREEN + "/9 Ooooh!");
            sender.sendMessage(ChatColor.GREEN + "/10 I'll beat you back to Age of Empires.");
            sender.sendMessage(ChatColor.GREEN + "/11 Hiahiahiahia!");
            sender.sendMessage(ChatColor.GREEN + "/12 Ah! being rushed.");
            sender.sendMessage(ChatColor.GREEN + "/13 Sure, blame it on your ISP.");
            sender.sendMessage(ChatColor.GREEN + "/14 Start the game already!");
            sender.sendMessage(ChatColor.GREEN + "/15 Don't point that thing on me!");
            sender.sendMessage(ChatColor.GREEN + "/16 Enemy sighted!");
            sender.sendMessage(ChatColor.GREEN + "/17 It is good to be the king.");
            sender.sendMessage(ChatColor.GREEN + "/18 Monk! I need a monk!");
            sender.sendMessage(ChatColor.GREEN + "/19 Long tine, no siege.");
            sender.sendMessage(ChatColor.GREEN + "/20 My granny could better scrap than that.");
            sender.sendMessage(ChatColor.GREEN + "/21 Nice town, I'll take it.");
            sender.sendMessage(ChatColor.GREEN + "/22 Quit touching me!");
            sender.sendMessage(ChatColor.GREEN + "/23 Raiding party!");
            sender.sendMessage(ChatColor.GREEN + "/24 Dadgum.");
            sender.sendMessage(ChatColor.GREEN + "/25 Eh, smite me.");
            sender.sendMessage(ChatColor.GREEN + "/26 The wonder, the wonder, the... no!");
            sender.sendMessage(ChatColor.GREEN + "/27 You played two hours to die like this?");
            sender.sendMessage(ChatColor.GREEN + "/28 Yeah, well, you should see the other guy.");
            sender.sendMessage(ChatColor.GREEN + "/29 Roggan.");
            sender.sendMessage(ChatColor.GREEN + "/30 Wololo.");
            sender.sendMessage(ChatColor.GREEN + "/31 Attack an enemy now.");
            sender.sendMessage(ChatColor.GREEN + "/32 Cease creating extra villagers.");
            sender.sendMessage(ChatColor.GREEN + "/33 Create extra villagers.");
            sender.sendMessage(ChatColor.GREEN + "/34 Build a navy.");
            sender.sendMessage(ChatColor.GREEN + "/35 Stop building a navy.");
            sender.sendMessage(ChatColor.GREEN + "/36 Wait for my signal to attack.");
            sender.sendMessage(ChatColor.GREEN + "/37 Build a wonder.");
            sender.sendMessage(ChatColor.GREEN + "/38 Give me your extra resources.");
            sender.sendMessage(ChatColor.GREEN + "/39 *dingdingding*");
            sender.sendMessage(ChatColor.GREEN + "/40 *dong*");
            sender.sendMessage(ChatColor.GREEN + "/41 *phuuuuu*");
            sender.sendMessage(ChatColor.GREEN + "/42 Says What age are you in?");
            
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
