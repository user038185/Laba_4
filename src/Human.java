public class Human {
    private long id;
    private String name;
    private String gender;
    private Subdivision subdivision;
    private int salary;
    private String birthday;

    Human(long _id, String _name, Subdivision _subdivision, String _gender, int _salary, String _birthday) {
        id = _id;
        name = _name;
        subdivision = _subdivision;
        gender = _gender;
        salary = _salary;
        birthday = _birthday;
    }

    @Override
    public String toString(){
        return "id = " + id +"\n" +
                "name = " + name +"\n" +
                subdivision.toString() +
                "gender = " + gender + "\n" +
                "salary = " + salary + "\n" +
                "birthday = " + birthday;
    }
}
