package net.gcnt.skywarsreloaded.game;

import net.gcnt.skywarsreloaded.game.chest.SWChestType;
import net.gcnt.skywarsreloaded.game.types.GameStatus;
import net.gcnt.skywarsreloaded.utils.Item;
import net.gcnt.skywarsreloaded.utils.Message;
import net.gcnt.skywarsreloaded.utils.SWCoord;
import net.gcnt.skywarsreloaded.wrapper.world.SWWorld;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface GameWorld {

    String getId();

    GameTemplate getTemplate();

    List<GameTeam> getTeams();

    SWWorld getWorld();

    String getWorldName();

    boolean canJoinGame();

    boolean isSpawnAvailable();

    boolean isEditing();

    void setEditing(boolean edit);

    void startScheduler();

    GameScheduler getScheduler();

    Map<UUID, SWChestType> getSelectedChestTypes();

    void announce(Message message);

    void announce(String message);

    void announceTitle(Message message);

    void announceTitle(Message message, int fadeIn, int stay, int fadeOut);

    void setChestTypeSelected(UUID player, SWChestType type);

    /**
     * This method is to be run async since it could perform long operations
     *
     * @param uuid                  UUID of the player to add
     * @param ignoreAvailableSpawns true if the player should be added anyway if there is no available spawn points
     * @return A {@link GamePlayer} object if the player was added, null otherwise
     */
    GamePlayer preparePlayerJoin(UUID uuid, boolean ignoreAvailableSpawns);

    /**
     * If this method doesn't return true, the calling method is expected to handle kicking the player(s) which
     * have not made it into a team.
     * @param players List of player to try adding to the game
     * @return true if all players were added to the game
     */
    boolean addPlayers(GamePlayer... players);

    void removePlayer(GamePlayer player);

    List<GamePlayer> getPlayersCopy();

    List<GamePlayer> getAlivePlayers();

    List<GamePlayer> getSpectators();

    GameStatus getStatus();

    void setStatus(GameStatus status);

    void readyForEditing();

    int getTimer();

    void setTimer(int timer);

    /**
     * Generate the loot of one chest based on the voted chest type.
     *
     * @return String array with all slots and their ItemStack values as strings.
     */
    Item[] generateChestLoot(SWChestType chestType);

    /**
     * Fill the chest with the given coord.
     *
     * @param coord Location of the chest
     */
    void fillChest(SWCoord coord, SWChestType chestType);

    /**
     * Removes all the cages that are currently placed.
     */
    void removeCages();

    /**
     * Fill all the registered chests in the world
     */
    void fillChests();

    void loadTeams();

}
