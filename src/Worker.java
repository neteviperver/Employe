public class Worker {
    String name;
    double salary;
    int workHours;
    int hireYear;
     Worker(String name,double salary,int workHours,int hireYear){
         this.name=name;
         this.salary=salary;
         this.workHours=workHours;
         this.hireYear=hireYear;
     }
      public  double  tax(){
         double taxe=0;
         if (salary>=1000){
             taxe+=salary*1.03;
     }
         else {
             taxe=0;
         }
         return taxe;

     }
      public double bonus() {
          double bonusP = 0;
          if (workHours > 40) {

              bonusP = (workHours - 40) * 30;

          } else {
              bonusP = 0;
          }
return bonusP;
      }
     public double  riseSalary(){


        double increasedSalary=0;
        if ((hireYear>0&&(2023-hireYear)<10)){
            increasedSalary+=(salary*1.05);
        }
        if ((hireYear>0&&((2023-hireYear)>=10)&&((2023-hireYear)<20))){
            increasedSalary+=(salary*1.1);
        }
        if ((hireYear>0&&(2023-hireYear)>=20)){
            increasedSalary+=(salary*1.15);
        }
        else {

        } return increasedSalary;
     }
     public void printInfo(){
         System.out.println("Name:"+this.name);
         System.out.println("Salary:"+this.salary);
         System.out.println("Work haurs:"+this.workHours);
         System.out.println("The year of starting work :"+this.hireYear);
         System.out.println("Tax: "+this.tax());
         System.out.println("Bonus :"+ this.bonus());
         System.out.println("Salary increase:"+this.riseSalary());
         System.out.println("Salary with taxes and bonus :"+(this.riseSalary()+this.bonus()));
         System.out.println("Total salary:"+(bonus()+riseSalary()));

     }
}
