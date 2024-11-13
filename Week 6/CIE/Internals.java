package CIE;

public class Internals extends Student {
    public int[] internalMarks;

    public Internals(String usn, String name, int semester, int[] internalMarks) {
        super(usn, name, semester);
        this.internalMarks = internalMarks;
    }
}