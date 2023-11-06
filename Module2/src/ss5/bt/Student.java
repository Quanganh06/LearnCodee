package ss5.bt;

public class Student {
    private String name = "Duy";
    private String classes = "A0323i1";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String teRi) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static class TestStudent {
        public static void main(String[] args) {
            Student testStudent = new Student();
            testStudent.setName("Hung");
            testStudent.setClasses("A0523i1");
            System.out.println("Ten cua ban la :" + testStudent.getName());
            System.out.println("Lop cua ban la : " + testStudent.getClasses());
        }
    }
}

