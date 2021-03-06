package music.pitch;

import org.junit.Test;
import util.NoteBank;

import static org.junit.Assert.*;

/**
 * Created by reedtrevelyan on 3/22/16.
 */
public class NoteTest {
    @Test
    public void testStringConstructor() {
        Note str1 = new Note("C#4:Q");
        assertEquals(str1, NoteBank.cs4);

        Note str2 = new Note("G3:Qd");
        // different duration
        assertNotEquals(str2, NoteBank.g3);
        assertTrue(str2.equalsPitchOnly(NoteBank.g3));

        Note str3 = new Note("Ab4:Hd");
        assertNotEquals(str3, NoteBank.ab);
        assertTrue(str3.equalsPitchOnly(NoteBank.ab));
    }

    @Test
    public void testEnharmonic() {
        // C# and Db
        assertEquals(NoteBank.cs, NoteBank.db);

        // E and Fb
        assertEquals(NoteBank.e, NoteBank.fb);

        // Ab and G# are enharmonic, also wraps around the number representation
        assertEquals(NoteBank.ab, NoteBank.gs);

        // Comparison works even if no duration is given
        assertTrue(NoteBank.e.equalsPitchOnly(
                new Note(NoteValue.F, NoteValue.Accidental.FLAT, NoteBank.e.octave, null)));

        // G#4 is not equal to Ab5 since octave wraps around C, not A
        assertNotEquals(NoteBank.gs, NoteBank.ab5);
    }

    @Test
    public void testOctaveEquals() {
        // Octaves should not be equal
        assertNotEquals(NoteBank.cs4, NoteBank.cs5);

        // B4 and Cb5 should be enharmonic, since C denotes the new octave
        assertEquals(NoteBank.b4, NoteBank.cb5);

        // B#4 and C5
        assertEquals(NoteBank.bs4, NoteBank.c5);

        // B3 and Cb5 are not equal
        assertNotEquals(NoteBank.b3, NoteBank.cb5);

        // B#3 and C4 are enharmonic
        assertEquals(NoteBank.bs3, NoteBank.c4);

        // G3 and G5, general case
        assertNotEquals(NoteBank.g3, NoteBank.g5);
    }

    @Test
    public void testNoteRelation() {
        // G3 is lower than G5
        assertTrue(NoteBank.g3.compareTo(NoteBank.g5) < 0);

        // D3 is lower than G3
        assertTrue(NoteBank.d3.compareTo(NoteBank.g3) < 0);

        // A4 is higher than G3
        assertTrue(NoteBank.a4.compareTo(NoteBank.g3) > 0);

        // C4 is lower than B4
        assertTrue(NoteBank.c4.compareTo(NoteBank.b4) < 0);

    }
}