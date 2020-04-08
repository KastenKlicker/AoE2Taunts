//Before editing please read the README.md and LICENSE on my Github Repository. https://github.com/KastenKlicker/AoE2Taunts
package de.stalincraft;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author KastenKlicker
 */
public class Main extends JavaPlugin {
     @Override
    public void onEnable() {
    // UpdateChecker
        Logger logger = this.getLogger();
 
        new UpdateChecker(this, 76955).getVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                logger.info("There is not a new update available.");
            } else {
                logger.info("There is a new update available.");
            }
        });
        //Commands from Taunts Class
        this.getCommand("1").setExecutor(new Taunts());
        this.getCommand("2").setExecutor(new Taunts());
        this.getCommand("3").setExecutor(new Taunts());
        this.getCommand("4").setExecutor(new Taunts());
        this.getCommand("5").setExecutor(new Taunts());
        this.getCommand("6").setExecutor(new Taunts());
        this.getCommand("7").setExecutor(new Taunts());
        this.getCommand("8").setExecutor(new Taunts());
        this.getCommand("9").setExecutor(new Taunts());
        this.getCommand("10").setExecutor(new Taunts());
        this.getCommand("11").setExecutor(new Taunts());
        this.getCommand("12").setExecutor(new Taunts());
        this.getCommand("13").setExecutor(new Taunts());
        this.getCommand("14").setExecutor(new Taunts());
        this.getCommand("15").setExecutor(new Taunts());
        this.getCommand("16").setExecutor(new Taunts());
        this.getCommand("17").setExecutor(new Taunts());
        this.getCommand("18").setExecutor(new Taunts());
        this.getCommand("19").setExecutor(new Taunts());
        this.getCommand("20").setExecutor(new Taunts());
        this.getCommand("21").setExecutor(new Taunts());
        this.getCommand("22").setExecutor(new Taunts());
        this.getCommand("23").setExecutor(new Taunts());
        this.getCommand("24").setExecutor(new Taunts());
        this.getCommand("25").setExecutor(new Taunts());
        this.getCommand("26").setExecutor(new Taunts());
        this.getCommand("27").setExecutor(new Taunts());
        this.getCommand("28").setExecutor(new Taunts());
        this.getCommand("29").setExecutor(new Taunts());
        this.getCommand("30").setExecutor(new Taunts());
        this.getCommand("31").setExecutor(new Taunts());
        this.getCommand("32").setExecutor(new Taunts());
        this.getCommand("33").setExecutor(new Taunts());
        this.getCommand("34").setExecutor(new Taunts());
        this.getCommand("35").setExecutor(new Taunts());
        this.getCommand("36").setExecutor(new Taunts());
        this.getCommand("37").setExecutor(new Taunts());
        this.getCommand("38").setExecutor(new Taunts());
        this.getCommand("39").setExecutor(new Taunts());
        this.getCommand("40").setExecutor(new Taunts());
        this.getCommand("41").setExecutor(new Taunts());
        this.getCommand("42").setExecutor(new Taunts());
        
        //Command from Help Class
        this.getCommand("taunts").setExecutor(new Help());
    }

    /**
     *
     */
    @Override
    public void onDisable() {
    
    }
}
