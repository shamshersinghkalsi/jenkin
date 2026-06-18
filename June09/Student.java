package June09;

public class Student<S,C>{
    S students;
    C course;
    public Student(S students,C course) {
        this.students = students;
        this.course = course;

    }

    @Override
    public String toString() {
        return "Student" + students + course
                ;
    }
//        String name;
//    int rollno;
//
//
//    public Student(String name, int rollno) {
//       this.name = name;
//        this.rollno = rollno;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollno=" + rollno +
//                '}';
//    }

        }





