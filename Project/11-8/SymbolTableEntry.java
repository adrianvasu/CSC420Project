public class SymbolTableEntry {

    private String name;
    private String id;
    private int funCount;
    private int keyCounter;

    public SymbolTableEntry() {

    }

    public SymbolTableEntry(String name, String id, int funCount, int keyCounter) {
        this.name = name;
        this.id = id;
        this.funCount = funCount;
        this.keyCounter = keyCounter;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public int getFunCount() { return funCount; }
    public int getKeyCounter() { return keyCounter; }

    public void setId(String id) {
        this.id = id;
    }

}
