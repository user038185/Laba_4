public class Subdivision {
    private long id;
    private char name;

    Subdivision(Character _name) {
        name = _name;
        id = name - 'A' + 1;
    }

    @Override
    public String toString() {
        return "subdivision_id = " + id + "\n" +
                "subdivision_name = " + name + "\n";
    }
}
