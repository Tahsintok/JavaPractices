public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int PerformanceNote;

    public Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.examNote=0;
        this.PerformanceNote=0;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher= t;
            System.out.println("Successed");
        }else {
            System.out.println(t.name + "Teacher Branch does not match with Course.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " is teached by : "+ courseTeacher.name);
        } else {
            System.out.println("Teacher is not avaible yet for "+ this.name);
        }
    }
}
