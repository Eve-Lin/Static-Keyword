public class StudentsCount {

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.name = "Merry";
        student1.age = 17;

        Students student2 = new Students();
        student1.name = "Chris";
        student1.age = 19;

        System.out.println(Students.counter); //we don't need an instance to call the static variable
        System.out.println(student1.counter); //we can also use the instance to call the static variable
    }
}
