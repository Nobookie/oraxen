package io.th0rgal.oraxen.nms.v1_21_R5;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import io.papermc.paper.event.player.AsyncChatDecorateEvent;
import io.th0rgal.oraxen.nms.GlyphHandlers;

public class GlyphListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onDecorate(AsyncChatDecorateEvent event) {
        event.result(GlyphHandlers.transform(event.result(), event.player(), true));
    }
}
