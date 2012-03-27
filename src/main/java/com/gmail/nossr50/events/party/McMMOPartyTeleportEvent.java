package com.gmail.nossr50.events.party;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerTeleportEvent;

public class McMMOPartyTeleportEvent extends PlayerTeleportEvent{

    private String party;
    private Player target;

    public McMMOPartyTeleportEvent(Player player, Player target, String party) {
        super(player, player.getLocation(), target.getLocation(), TeleportCause.COMMAND);
        this.party = party;
        this.target = target;
    }

    public String getParty() {
        return party;
    }

    public Player getTarget() {
        return target;
    }

    /** Rest of file is required boilerplate for custom events **/
    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
