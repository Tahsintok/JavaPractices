import javax.print.DocFlavor.INPUT_STREAM;

public class Student {
    String name;
    String studentNumber;
    int classes;
    Course mat;
    Course physic;
    Course chemistry;
    double avarage;
    boolean isPass;

    Student (String name, int classes,String studentNumber,Course mat,Course physic,Course chemistry) {
        this.name=name;
        this.classes=classes;
        this.studentNumber=studentNumber;
        this.mat=mat;
        this.physic=physic;
        this.chemistry=chemistry;
        calcAvarage();
        this.isPass= false;
    }

    public void addBulkExamNote (int matNote1,int matNote2,int physicNote1,int physicNote2,int chemistryNote1,int chemistryNote2){
        if (matNote1 >= 0 && matNote1 <= 100){
            this.mat.examNote=matNote1;
        }if (matNote2 >= 0 && matNote2 <= 100){
            this.mat.PerformanceNote=matNote2;
        }if (physicNote1 >= 0 && physicNote1 <= 100){
            this.physic.examNote=physicNote1;
        }if (physicNote2 >= 0 && physicNote2 <= 100){
            this.physic.PerformanceNote=physicNote2;
        }if (chemistryNote1 >= 0 && chemistryNote1 <= 100){
            this.chemistry.examNote=chemistryNote1;
        }if (chemistryNote2 >= 0 && chemistryNote2 <= 100){
            this.chemistry.PerformanceNote=chemistryNote2;
        }
    }
    

    public void isPass() {
        if (this.mat.examNote ==0 || this.mat.PerformanceNote ==0 ||this.physic.examNote ==0 ||this.physic.PerformanceNote ==0 ||this.chemistry.examNote ==0 ||this.chemistry.PerformanceNote ==0 ) {
            System.out.println("--------------");
            System.out.println("Student : "+ this.name);
            System.out.println("All Notes of Student are not entered.");
        } else {
            this.isPass =isCheckPass();
            printNote();
            System.out.println("Average : "+ this.avarage);
            if(this.isPass){
                System.out.println("Course are passed");
            }else {
                System.out.println(" failed");
            }
        }
    }

    public void calcAvarage() {
        this.avarage=(this.mat.examNote*0.8+this.mat.PerformanceNote*0.2+this.physic.examNote*0.8+this.physic.PerformanceNote*0.2+this.chemistry.examNote*0.8+this.chemistry.PerformanceNote*0.2)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("--------------");
        System.out.println("Student : "+ this.name);
        System.out.println("Mat Notes : "+ this.mat.examNote + "\t" + this.mat.PerformanceNote);
        System.out.println("Physics Notes : "+ this.physic.examNote + "\t" + this.physic.PerformanceNote);
        System.out.println("Chemistry Notes : "+ this.chemistry.examNote + "\t" + this.chemistry.PerformanceNote);

    }
}