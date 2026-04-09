package Model;

/**
 * Excepció personalitzada per a validació d'ID de Pokémon
 */
public class IdInvalidException extends Exception {
    public IdInvalidException(String message) {
        super(message);
    }
}
