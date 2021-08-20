
/**
 * Write a description of class SeniorDeveloper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeniorDeveloper extends Developer
{
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private int advanceSalary;
    private boolean appointed;
    private boolean terminated;
    public SeniorDeveloper(String platform, String interviewerName, int workingHour, int salary, int contractPeriod){
      super(platform, interviewerName, workingHour);
      this.salary = salary;
      this.contractPeriod = contractPeriod;
      joiningDate = "";
      staffRoomNumber = "";
      advanceSalary = 0;
      appointed = false;
      terminated = false;
    }
         // gives access of the values stored in the instance salary .
    public int getSalary(){
         return salary;
       }
        // gives access of the values stored in the instance joiningDate.
    public String getJoiningDate(){
         return joiningDate;
       }
        // gives access of the values stored in the instance staffRoomNumber
    public String getStaffRoomNumber(){
         return staffRoomNumber;
       }
        // gives access of the values stored in the instance contractPeriod
    public int getContractPeriod(){
         return contractPeriod;
       }
          // gives access of the values stored in the instance advanceSalary.
    public int getAdvanceSalary(){
       return advanceSalary;
       }
          // gives access of the values stored in the instance appointed.
    public boolean getAppointed(){
       return appointed;
       }
          // gives access of the values stored in the instance terminated.
    public boolean getTerminated(){
       return terminated;
       }
          // allows the user to set the salary after the creation of the object.
    public void setSalary(int newsalary){
       salary = newsalary;
       }
       //facilitates the user to insert the value in the contractPeriod after the creation of the object.
    public void setContractPeriod(int newcontractPeriod){
       contractPeriod = newcontractPeriod;
       }
       //a method with 4 parameters which can be initialized after the creation of the object.
    public void hireDeveloper(String developerName,String joiningDate, int advanceSalary, String staffRoomNumber){
       if(appointed==true)
       {
            System.out.println("The Developer is already appointed !!");
            System.out.println("Developer`s Name:- "+developerName+ "Room Number:- "+staffRoomNumber);
       }
       else
       {    //calling setDeveloperName from the parent class,which first gets the value in the developerName and finally in the instance develperName attribute of  subclass.
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.staffRoomNumber = staffRoomNumber;
            appointed = true;
            terminated = false;
       }
       }
       //unparameterized method which doesnot take any input,only carries the function inside it.
    public void contractTermination(){
        if(terminated==true)
        {
             System.out.println("The developer's contract has been already terminated!!");
        }
        else
        {   //calling the setDeveloperName of the parent class and assigning an empty string in the local variable which is later initialized into instance developerName.
             super.setDeveloperName("");
             joiningDate = "";
             advanceSalary = 0;
             appointed = false;
             terminated = true;
        }
        }
    public void print(){
           System.out.println("The required developer`s platform is:- "+getPlatform());
           System.out.println("The required developer`s interviewer name is "+getInterviewerName());
           System.out.println("The Salary of the developer is:- "+getSalary());
        }
    public void display(){
        //calling the display method of the parent class.
        super.display();
        if(appointed==true)
        {
            System.out.println("Termination status of the required developer is:- "+getTerminated());
            System.out.println("Joining date of the required developer is:- "+getJoiningDate());
            System.out.println("Advance Salary of the required developer is:- "+getAdvanceSalary());            
            System.out.println("The Developer Name is:- "+getDeveloperName());
        }
    }
}
    
                
      