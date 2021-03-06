package util;

import music.pitch.Note;
import music.pitch.NoteValue;
import music.pitch.Octave;
import music.rhythm.Duration;

/**
 * Holds notes used for testing.
 * @author reedt
 */
public class NoteBank {
    public static Note cs = new Note(NoteValue.C, NoteValue.Accidental.SHARP, Octave.FOUR);
    public static Note db = new Note(NoteValue.D, NoteValue.Accidental.FLAT, Octave.FOUR);
    public static Note e = new Note(NoteValue.E, NoteValue.Accidental.NATURAL, Octave.FOUR);
    public static Note fb = new Note(NoteValue.F, NoteValue.Accidental.FLAT, Octave.FOUR);
    public static Note ab = new Note(NoteValue.A, NoteValue.Accidental.FLAT, Octave.FOUR);
    public static Note gs = new Note(NoteValue.G, NoteValue.Accidental.SHARP, Octave.FOUR);
    public static Note cs4 = new Note(NoteValue.C, NoteValue.Accidental.SHARP, Octave.FOUR);
    public static Note cs5 = new Note(NoteValue.C, NoteValue.Accidental.SHARP, Octave.FIVE);
    public static Note b4 = new Note(NoteValue.B, NoteValue.Accidental.NATURAL, Octave.FOUR);
    public static Note cb5 = new Note(NoteValue.C, NoteValue.Accidental.FLAT, Octave.FIVE);
    public static Note bs4 = new Note(NoteValue.B, NoteValue.Accidental.SHARP, Octave.FOUR);
    public static Note c5 = new Note(NoteValue.C, NoteValue.Accidental.NATURAL, Octave.FIVE);
    public static Note b3 = new Note(NoteValue.B, NoteValue.Accidental.NATURAL, Octave.THREE);
    public static Note bs3 = new Note(NoteValue.B, NoteValue.Accidental.SHARP, Octave.THREE);
    public static Note c4 = new Note(NoteValue.C, NoteValue.Accidental.NATURAL, Octave.FOUR);
    public static Note g3 = new Note(NoteValue.G, NoteValue.Accidental.NATURAL, Octave.THREE);
    public static Note g5 = new Note(NoteValue.G, NoteValue.Accidental.NATURAL, Octave.FIVE);
    public static Note d3 = new Note(NoteValue.D, NoteValue.Accidental.NATURAL, Octave.THREE);
    public static Note a4 = new Note(NoteValue.A, NoteValue.Accidental.NATURAL, Octave.FOUR);
    public static Note ab5 = new Note(NoteValue.A, NoteValue.Accidental.FLAT, Octave.FIVE);

}
