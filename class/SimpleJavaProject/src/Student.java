public class Student {
    private int id;
    private String name;
    private String address;
    private String program;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProgram() {
        return program;
    }

    public String toString() {
        return "Student info: " + id + " " + name + " " + address + " " + program;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100702210);
        student.setName("Michael");
        student.setAddress("res");
        student.setProgram("CS");

        System.out.println(student.toString());

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(student);
        System.out.println(json);
    }

}