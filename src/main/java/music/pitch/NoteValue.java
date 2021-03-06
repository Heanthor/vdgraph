package music.pitch;

/**
 * Represents white key pitches.
 * @author reedt
 */
public enum NoteValue {
    // Pitches in diatonic scale
    A,
    B,
    C,
    D,
    E,
    F,
    G;

    /**
     * Modifications on a pitch, to either leave as is, raise, or lower a half step.
     */
    public enum Accidental {
        NATURAL, SHARP, FLAT
    }
}
