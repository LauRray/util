package main;


import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int id;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    //通过id排序
    public static class SortById implements Comparator <Student> {

        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    //通过age排序
    public static class SortByAge implements Comparator <Student> {
   
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(11110, 13);
        Student s2 = new Student(11112, 12);
        Student[] ss = {s1, s2};
        Arrays.sort(ss, new SortById());
        for (Student s : ss) {
            System.out.print(s);
        }
        System.out.println();
        Arrays.sort(ss, new SortByAge());
        for (Student s : ss) {
            System.out.print(s);
        }
    }


}
