package music.play.key;

import music.pitch.Note;

/**
 * @author reedt
 */
public enum MinorSharpKeys implements Key {
    A(new Note("A4")),
    E(new Note("E4")),
    B(new Note("B4")),
    Fs(new Note("F#4")),
    Cs(new Note("C#4")),
    Gs(new Note("G#4")),
    Ds(new Note("D#4")),
    As(new Note("A#4"));

    private Note noteRepr;

    MinorSharpKeys(Note noteRepr) {
        this.noteRepr = noteRepr;
    }

    public Note getNoteRepr() {
        return noteRepr;
    }

    @Override
    public String toString() {
        return this.name() + " minor";
    }
}
