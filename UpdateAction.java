package sonveer.narwaria.sudoku.model;

/**
 * Enumeration used to inform observers what to update.
 *
 * @author Vision
 */
public enum UpdateAction {
    NEW_GAME,
    CHECK,
    SELECTED_NUMBER,
    CANDIDATES,
    HELP
}