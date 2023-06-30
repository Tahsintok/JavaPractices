public class Main {
    public static void main(String[] args) {
        
        Course mat = new Course("MATH", "MAT101", "MAT");
        Course physic = new Course("PHYSIC", "PHY101", "PHY");
        Course chemistry = new Course("CHEMISTRY", "CHE101", "CHE");

        Teacher t1 = new Teacher("Ali", "55555", "MAT");
        Teacher t2 = new Teacher("Fatma", "44444", "PHY");
        Teacher t3 = new Teacher("Veli", "33333", "CHE");
    
    mat.addTeacher(t1);
    physic.addTeacher(t2);
    chemistry.addTeacher(t3);
    
        Student s1 = new Student("Student1", 4, "77777", mat, physic, chemistry);
        s1.addBulkExamNote(50, 40, 100, 95, 85, 90);
        s1.isPass();
        
        Student s2 = new Student("Student2", 4, "88888", mat, physic, chemistry);
        s2.addBulkExamNote(50, 80, 20, 100, 84, 63);
        s2.isPass();
        
        Student s3 = new Student("Student3", 4, "99999", mat, physic, chemistry);
        s3.addBulkExamNote(10, 20, 100, 0, 40, 20);
        s3.isPass();
        

    }

}
