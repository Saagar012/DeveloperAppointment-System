public class JuniorDeveloper extends Developer
{
  private int salary;
  private String appointedDate;
  private String evaluationPeriod;
  private String terminationDate;
  private String specialization;
  private String appointedBy;
  private boolean joined;
  //this is the first method which is runned before the creation of the object,allows us to input the values in the respective variables.
  public JuniorDeveloper(String platform, String interviewerName, int workingHour, int salary, String appointedBy, String terminationDate ){
      //invokes the super constructor of the parent class.
      super(platform, interviewerName, workingHour);
      //asssigning the user input value in the salary instance attribute.
      this.salary = salary;
      this.appointedBy = appointedBy;
      this.terminationDate = terminationDate;
      appointedDate = "";
      evaluationPeriod = "";
      specialization = "";
      joined = false;
    }
           // gives access of the values stored in the instance salary .
  public int getSalary()
    {
        return salary;
    }
           // gives access of the values stored in the instance appointedDate. .
  public String getAppointedDate()
    {
        return appointedDate;
    }
           // gives access of the values stored in the instance terminationDate. .
  public String getTerminationDate()
    {
        return terminationDate;
    }
          // gives access of the values stored in the instance specialization .
  public String getSpecialization()
    {
        return specialization;
    }
          // gives access of the values stored in the instance evaluation .
  public String evaluationPeriod()
    {
        return evaluationPeriod;
    }
         // gives access of the values stored in the instance appointedBy. .
  public String getAppointedBy()
    {
        return appointedBy;
    }
        // gives access of the values stored in the instance joined .
  public boolean getJoined()
    {
        return joined;
    }
        //allows the user to set the new salary even after the creation of the object.
  public void setsalary(int newSalary){
       if(joined==false){
         salary = newSalary;
       }
       else{
         System.out.println("Not possible to change the salary !!");
       }
    }
  public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization){
       if(joined==false){
          //invokes the setDeveloperName of the parent class.
          super.setDeveloperName(developerName);
          joined = true;
       }
       else{
          System.out.println("The developer is  already appointed on "+appointedDate);
        }
        this.appointedDate = appointedDate;
        this.terminationDate = terminationDate;
        this.specialization = specialization;
    }
  public void display(){
       //calls the display method of parent class.
       super.display();
       if(joined==true){
          System.out.println("The Appointed Date of developer was:- "+getAppointedDate());
          System.out.println("The Developer Name is:- "+getDeveloperName());
          System.out.println("The Evaluation Period of the developer is:- "+evaluationPeriod);
          System.out.println("The developer will be terminated on:- "+getTerminationDate());
          System.out.println("The developer's Salary is:- "+getSalary());
          System.out.println("The developer's specialization is on:- "+specialization);
          System.out.println("The developer was appointed by:- "+getAppointedBy());
        }
    }
}
        
        
        
        
    
    
    
    
      
      
   