package de.stalincraft;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Consumer;

/**
 *
 * @author KastenKlicker
 * This class was made by the Spigot Community. For more information look at: https://www.spigotmc.org/wiki/creating-an-update-checker-that-checks-for-updates/?__cf_chl_jschl_tk__=20374d2824c496f2f187361b1ffddabef21deb0c-1586329533-0-AcVDIObtOk8RYcJFY2Puo6egYQ5NE_kdEYtEyiZcs1PQdRyeMK63vTxLs9zRo6gFCKxJl39TDfZJfHsBzhfKV5n_u5vaV3QagJdnF2PEh_0IrXJkpyirSZBuayzIfSkrRj0BVyRd0wLXpqXgYhs-7hHQ4V3DGaifpW27Jivfu-PQ2IhmirNXdPBlz_mrh_NkHKKzqsTedIRIi77uOlrKZ1zSDCqJJtEr3O6bac3s0nQ9Dq45wPsxgzEpJawPnYMjd09j1pwe1aansKkSMVM-f8zufFlgvCxiOEyoOJJcnYVO3uY0oUV3YZVIHLDy5gMNnbd0uF8bZu5oI4F6Uvar0CYGGxPrT8Xzc9F5bo_lnT3l
 */
public class UpdateChecker {
    
    private Plugin plugin;
    private int resourceId;
    
    public UpdateChecker(Plugin plugin, int resourceId) {
        this.plugin = plugin;
        this.resourceId = resourceId;
    }
    
    public void getVersion(final Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try (InputStream inputStream = new URL("https://api.spigotmc.org/legacy/update.php?resource=" + this.resourceId).openStream(); Scanner scanner = new Scanner(inputStream)) {
                if (scanner.hasNext()) {
                    consumer.accept(scanner.next());
                }
            } catch (IOException exception) {
                this.plugin.getLogger().info("Cannot look for updates: " + exception.getMessage());
            }
        });
    }
}
