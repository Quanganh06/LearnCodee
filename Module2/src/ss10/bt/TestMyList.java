package ss10.bt;

public class TestMyList {
        public static class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name){
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static void main(String[] args) {
            Student a = new Student(1,"Thanh");
            Student b = new Student(2,"Huong");
            Student c = new Student(3,"Dung");

            ArrayList<Student> studentMyArrayList = new ArrayList<>();
            ArrayList<Student> newMyArrayList = new ArrayList<>();
            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c,1);
            studentMyArrayList.Size();

            for (int i = 0; i < studentMyArrayList.Size(); i++) {
                Student student = (Student) studentMyArrayList.elements[i];
                System.out.println("Danh sach ma sinh vien: "+student.getId());
                System.out.println("Danh sach ten sinh vien: "+student.getName());
            }

            System.out.println("Ten sinh vien duoc lay tu danh sach: "+studentMyArrayList.get(1).getName());
            System.out.println("Ma sinh vien duoc lay tu danh sach: "+studentMyArrayList.get(2).getId());
            System.out.println("Tim kiem sinh vien : "+studentMyArrayList.indexOf(b));
            System.out.println("Kiem tra co sinh vien: "+studentMyArrayList.conntains(b));
            newMyArrayList = studentMyArrayList.clone();
            for (int i = 0; i < newMyArrayList.Size(); i++) {
                System.out.println(newMyArrayList.get(1).getName());
            }

            Student student = studentMyArrayList.remove(1);
            System.out.println(student.getName());

        }

    }

