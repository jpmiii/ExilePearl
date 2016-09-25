package com.devotedmc.ExilePearl;

import java.util.UUID;

/**
 * An interface for providing the real names of players
 * @author Gordon
 */
public interface PlayerNameProvider {
	
	/**
	 * Gets a player name from a UUID
	 * @param uuid The given player UUID
	 * @return The matching player name
	 */
	String getName(UUID uid);
	
	/**
	 * Gets a player UUID from a name
	 * @param name The given player name
	 * @return The matching player UUID
	 */
	UUID getUniqueId(String name);

}
