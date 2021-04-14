package task_24;

interface Null {}

class NullPart extends Part implements Null {
    private NullPart() { super(); }
    public static final Part NULL = new NullPart();
    public static class Factory implements typeinfo.factory.Factory<NullPart> {
        public NullPart create() { return (NullPart)NULL; }
        @Override public String toString() { return "NULL"; }
    }
}
