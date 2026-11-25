package Challlenge79;

 class Employee {
   private String Name;
   private int age;
   private double Salary;

   public  Employee (String Name ,int age ,double Salary) {
    this.Name=Name;
    this.age=age;
    this.Salary=Salary;

   }

   String getEmployeeDetails(){
       return "EmployeeDetails: Nmae:" + Name
               + ",age:" + age
               + ",Salary:" + Salary;
   }
   public String getName(){
       return Name;
   }
   public void setName(String name){
       this.Name=Name;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
   public double getSalary(){
       return Salary;
   }

     public void setSalary(double Salary) {
         this.Salary=Salary;
     }
 }
