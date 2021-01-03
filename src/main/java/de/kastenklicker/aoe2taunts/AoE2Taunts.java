package de.kastenklicker.aoe2taunts;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author KastenKlicker
 *
 * Main file of the AoE2Taunts File
 */

public class AoE2Taunts extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();
        logger.info("+ + + + + + + + + + + + + + + +");
        logger.info("+                             +");
        logger.info("+ AoE2Taunts by KastenKlicker +");
        logger.info("+                             +");
        logger.info("+ + + + + + + + + + + + + + + +");

        //Commands from the Commands Class
        Commands commands = new Commands();
        Objects.requireNonNull(this.getCommand("taunts")).setExecutor(commands);

        Objects.requireNonNull(this.getCommand("tauntsdef")).setExecutor(commands);

        final Taunts TauntsClass = new Taunts();
        final String[] tauntsArray = TauntsClass.getTauntsArray();

        for (int i = 1; i < tauntsArray.length; i++) {
            Objects.requireNonNull(this.getCommand(Integer.toString(i))).setExecutor(commands);
        }

    }

}
