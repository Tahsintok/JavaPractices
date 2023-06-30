public class Employee {
    String name;
    double salary;
    int weeklyWorkingHours;
    int hireYear;


    public Employee(String name,int salary, int weeklyWorkingHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.weeklyWorkingHours= weeklyWorkingHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if (this.salary <= 1000){
            return 0.0;            
        }else if (this.salary > 1000){
            return (this.salary*0.03);
        }
        return 0.0;
    }

    public int bonus(){
        int bonus = 30;
        if (weeklyWorkingHours > 40){
            return (weeklyWorkingHours-40)*bonus;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        int yearWorked=2021-this.hireYear;
        if (yearWorked <10){
            return this.salary*0.05;
        }else if (yearWorked >= 10 && yearWorked <20){
            return this.salary*0.1;
        }else if (yearWorked >20){
            return this.salary*0.15;    
        }
        return 0.0;
    }

    public void toStr(){
    System.out.println("Name : " + this.name);
    System.out.println("Salary : " + this.salary);
    System.out.println("weeklyworkinghours : " + this.weeklyWorkingHours);
    System.out.println("Hire Year : " + this.hireYear);
    System.out.println("Tax : " + tax());
    System.out.println("Bonus : " + bonus());
    System.out.println("Total Salary with Tax and Bonus : "+ (this.salary+bonus()- tax()));
    System.out.println("Raise Salary Amaount : " + raiseSalary());
    System.out.println("Total Salary : " + (this.salary+raiseSalary()));    
    }

}
