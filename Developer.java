
/**
 * Write a description of class Developer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Developer
{   //instance attributes
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHour;
   //Constructor which ask the user to input three values in the respective variables before the creation of the object.
   public Developer(String platform,String interviewerName, int workingHour){
        developerName = "";
        this.platform = platform;
        //differentiating  local and the instance attributes and initializing the values stored in the local variables to the private variables
        this.interviewerName = interviewerName;
        this.workingHour = workingHour;
    }
   // gives access of the values stored in the instance platform  to the subclasses.
   public String getPlatform(){
     return platform;
    }
   // gives access of the values stored in the instance interviewerName to the subclasses.
   public String getInterviewerName(){
        return interviewerName;
    }
   // gives access of the values stored in the instance workingHour to the subclasses.
   public int getWorkingHour(){
        return workingHour;
    }
   // gives access of the values stored in the instance developerName to the subclasses.
   public String getDeveloperName(){
        return developerName;
    }
    //allows the user to set the values in the developerName after the creation of the object.
   public void setDeveloperName(String developerName){
       //initializing the userinput developerName in the instance developerName.
       this.developerName = developerName;
    }
    public void display(){
        System.out.println("The Platform of the required developer is:- "+platform);
        System.out.println("The Working hours of the required developer is:- "+workingHour);
        System.out.println("The interviewer name of the required developer is:- "+interviewerName);
       
   }
}
        
        
    
