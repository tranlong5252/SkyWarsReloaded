package net.gcnt.skywarsreloaded.utils.properties;

public enum MessageProperties {

    CHAT_HEADER("chat.header"),
    CHAT_LOBBY_SPAWN_SET("chat.lobby-spawn-set"),

    ERROR_CANNOT_SET_LOBBYSPAWN_IN_GAMEWORLD("errors.cannot-set-lobbyspawn-in-gameworld"),
    ERROR_WORLD_NOT_RECOGNIZED("errors.world-not-recognized"),
    ERROR_MUST_HOLD_ITEM("errors.must-hold-item"),
    ERROR_LOBBY_SPAWN_NOT_SET("errors.lobby-spawn-not-set"),
    ERROR_NO_TEMPLATE_WORLD_FOUND("errors.no-template-world-found"),

    KITS_ENTER_NAME("kits.enter-name"),
    KITS_ENTER_DESCRIPTION("kits.enter-description"),
    KITS_ENTER_DISPLAYNAME("kits.enter-displayname"),
    KITS_ENTER_LORE_ACTION("kits.enter-lore-action"),
    KITS_ENTER_LORE_LINE("kits.enter-lore-line"),
    KITS_ENTER_SLOT("kits.enter-slot"),
    KITS_ENTER_SLOT_NUMBER("kits.enter-slot-number"),
    KITS_ENTER_SLOT_GREATER("kits.enter-slot-greater"),
    KITS_ENTER_LORE_INDEX_NUMBER("kits.enter-lore-index-number"),
    KITS_ENTER_LORE_INDEX_GREATER("kits.enter-lore-index-greater"),
    KITS_ENTER_LORE_INDEX_INVALID("kits.enter-lore-index-invalid"),
    KITS_ENTER_KIT_REQUIREMENT("kits.enter-kit-requirement"),
    KITS_ENTER_KIT_REQUIREMENT_VALUE("kits.enter-kit-requirement-value"),
    KITS_ENTER_KIT_REQUIREMENT_VALUE_BOOLEAN("kits.enter-kit-requirement-value-boolean"),
    KITS_ENTER_KIT_STAT_REQUIREMENT("kits.enter-kit-stat-requirement"),
    KITS_ENTER_KIT_REQUIREMENT_VALUE_NUMBER("kits.enter-kit-requirement-value-number"),
    KITS_ENTER_KIT_REQUIREMENT_VALUE_GREATER("kits.enter-kit-requirement-value-greater"),
    KITS_ALREADY_EXISTS("kits.already-exists"),
    KITS_CREATED("kits.created"),
    KITS_DOESNT_EXIST("kits.doesnt-exist"),
    KITS_PREVIEWED("kits.previewed"),
    KITS_SET_CONTENTS("kits.set-contents"),
    KITS_SET_DESCRIPTION("kits.set-description"),
    KITS_SET_DISPLAYNAME("kits.set-displayname"),
    KITS_SET_ICON("kits.set-icon"),
    KITS_SET_SLOT("kits.set-slot"),
    KITS_SET_UNAVAILABLE_ICON("kits.set-unavailable-icon"),
    KITS_SET_REQUIREMENT("kits.set-requirement"),
    KITS_ADDED_LORE_LINE("kits.added-lore-line"),
    KITS_REMOVED_LORE_LINE("kits.removed-lore-line"),
    KITS_CLEARED_LORE("kits.cleared-lore"),
    KITS_PREVIEW_LORE_HEADER("kits.preview-lore-header"),
    KITS_PREVIEW_LORE_NO_LINES("kits.preview-lore-no-lines"),
    KITS_PREVIEW_LORE_LINE("kits.preview-lore-line"),

    MAPS_ENTER_NAME("maps.enter-name"),
    MAPS_ENTER_CREATOR("maps.enter-creator"),
    MAPS_ENTER_TEAM_SIZE("maps.enter-team-size"),
    MAPS_ENTER_TEAM_SIZE_NUMBER("maps.enter-team-size-number"),
    MAPS_ENTER_TEAM_SIZE_GREATER("maps.enter-team-size-greater"),
    MAPS_ENTER_SPAWN_TYPE("maps.enter-spawn-type"),
    MAPS_ENTER_TEAM_NUMBER("maps.enter-team-number"),
    MAPS_ENTER_TEAM_NUMBER_NUMBER("maps.enter-team-number-number"),
    MAPS_ENTER_WORLD_SIZE("maps.enter-world-size"),
    MAPS_ENTER_WORLD_SIZE_NUMBER("maps.enter-world-size-number"),
    MAPS_ENTER_WORLD_SIZE_GREATER("maps.enter-world-size-greater"),
    MAPS_DOESNT_EXIST("maps.doesnt-exist"),
    MAPS_ALREADY_EXIST("maps.already-exists"),
    MAPS_GENERATING_WORLD("maps.generating-world"),
    MAPS_GENERATING_WORLD_FAIL("maps.generating-world-fail"),
    MAPS_GENERATED_WORLD("maps.generated-world"),
    MAPS_TEMPLATE_CREATED("maps.template-created"),
    MAPS_ALREADY_DISABLED("maps.already-disabled"),
    MAPS_DISABLED("maps.disabled"),
    MAPS_ALREADY_ENABLED("maps.already-enabled"),
    MAPS_ENABLED("maps.enabled"),
    MAPS_EDIT_EXISTING_WORLD("maps.edit-existing-world"),
    MAPS_CANNOT_EDIT_GAME_RUNNING("maps.cannot-edit-game-running"),
    MAPS_CANNOT_ENABLE_INCOMPLETE_SETUP("maps.cannot-enable-incomplete-setup"),
    MAPS_LIST_HEADER("maps.maps-list-header"),
    MAPS_LIST_LINE("maps.maps-list-line"),
    MAPS_LIST_EMPTY("maps.maps-list-empty"),
    MAPS_WORLD_SAVED("maps.saved"),
    MAPS_WORLD_SAVED_FAIL("maps.saved-fail"),
    MAPS_SAVED("maps.saved"),
    MAPS_SET_CREATOR("maps.set-creator"),
    MAPS_SET_TEAM_SIZE("maps.set-team-size"),
    MAPS_NO_TEAM_GAME("maps.no-team-game"),
    MAPS_SET_SPAWN_LOBBY("maps.set-spawn-lobby"),
    MAPS_SET_SPAWN_SPECTATE("maps.set-spawn-spectate"),
    MAPS_SET_SPAWN_PLAYER_SINGLES("maps.set-spawn-player-singles"),
    MAPS_SET_SPAWN_PLAYER_TEAM("maps.set-spawn-player-team"),
    MAPS_SET_SPAWN_PLAYER_TEAM_FINAL("maps.set-spawn-player-team-final"),
    MAPS_SET_SPAWN_PLAYER_TEAM_UPDATED("maps.set-spawn-player-team-updated"),
    MAPS_SET_SPAWN_PLAYER_TEAM_MAX("maps.set-spawn-player-team-max"),
    MAPS_SPAWN_ALREADY_EXISTS("maps.spawn-already-exists"),
    MAPS_SPAWN_INDEX_LOW("maps.spawn-index-low"),
    MAPS_SPAWN_INDEX_HIGH("maps.spawn-index.high"),
    MAPS_SET_WORLD_SIZE("maps.set-world-size"),
    MAPS_ALL_SET_UP("maps.all-set-up"),

    TITLES_MAPS_GENERATING_WORLD("titles.maps.generating-world"),
    TITLES_MAPS_GENERATED_WORLD("titles.maps.generated-world"),
    TITLES_MAPS_NO_TEAM_GAME("titles.maps.no-team-game"),
    TITLES_MAPS_SET_SPAWN_LOBBY("titles.maps.set-spawn-lobby"),
    TITLES_MAPS_SET_SPAWN_SPECTATE("titles.maps.set-spawn-spectate"),
    TITLES_MAPS_SET_SPAWN_PLAYER("titles.maps.set-spawn-player"),
    TITLES_MAPS_SET_SPAWN_PLAYER_FAIL("titles.maps.set-spawn-player-fail"),
    ;

    private final String value;

    MessageProperties(String valueIn) {
        this.value = valueIn;
    }

    public String toString() {
        return value;
    }
}
