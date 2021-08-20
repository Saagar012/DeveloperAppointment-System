

//Importing the needed classes from the respective packages.
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.border.Border;
import java.util.ArrayList;
public class RigoTechnology extends JFrame{ //inheriting the class JFrame

    // Declaration of objects of Jbutton class
    private JButton b1, b2, b3, b4, b5, b6, b7;
    //Declaration of objects of JTextfield class
    private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7,
            textField8, textField9, textField10, textField11, textField12, textField13, textField14, textField15,
            textField16,textField17;
    // private JFrame f;

    private ArrayList<Developer> list;//Declaring the Arraylist of type Developer


    /* Everything for this interface is done inside the constructor
       i.e.adding the buttons,textfields,panels,inserting their positions,size and their events.

     */
    public RigoTechnology() {
        super("Appointment System ");

        GridBagConstraints abc = new GridBagConstraints(); //Creating object of GridBagConstraints class.

        GridBagLayout grid = new GridBagLayout(); //Creating instance of GridBagLayout class.

        list = new ArrayList<Developer>();//Creating the instance for Arraylist class.

        abc.insets = new Insets(5, 5, 5, 5); //it is done to keep a  distance betn the container and the window.
        abc.weightx= 2; // increases the layout width
        abc.weighty = 2; //increases the layout height,without these whole the layout lies in the middle of the frame.


        JPanel panel=new JPanel();
        panel.setLayout(grid); //using the layout for panel

        //creating GUI Components
        abc.fill = GridBagConstraints.BOTH; // Making the component fill its display area entirely.
        abc.gridx = 0; //horizontal position to keep the label.
        abc.gridy = 0; // vertical position to keep the label.
        JLabel label1 = new JLabel("Platform :");

        panel.add(label1, abc);

        abc.gridx = 1;
        abc.gridy = 0;
        abc.gridwidth = GridBagConstraints.REMAINDER; //  The textfield  increases upto the maximum width.
        textField1 = new JTextField();
        panel.add(textField1, abc); //adding textField1 to panel.


        abc.gridx = 0;
        abc.gridy = 1;
        JLabel label2 = new JLabel("Interviewer's Name :");
        panel.add(label2, abc);

        abc.gridx = 1;
        abc.gridy = 1;
        abc.gridwidth = GridBagConstraints.REMAINDER;
        textField2 = new JTextField();
        panel.add(textField2, abc);

        abc.gridx = 0;
        abc.gridy = 2;
        abc.gridwidth = 1; //the number of columns the component occupies
        JLabel label3 = new JLabel("Working Hours :");
        panel.add(label3, abc);

        abc.gridx = 1;
        abc.gridy = 2;
        abc.gridwidth = GridBagConstraints.REMAINDER;
        textField3 = new JTextField();
        panel.add(textField3, abc);


        abc.gridx = 0;
        abc.gridy = 4;
        abc.gridwidth=1;
        JLabel label5 = new JLabel("Salary(in Rs) :");
        panel.add(label5, abc);

        abc.gridx = 1;
        abc.gridy = 4;
        textField5 = new JTextField();
        panel.add(textField5, abc);

        abc.gridx = 2;
        abc.gridy = 4;
        abc.gridwidth=1;
        JLabel label6 = new JLabel("Evaluation Period(in days) :");
        panel.add(label6, abc);

        abc.gridx = 3;
        abc.gridy = 4;
        textField6 = new JTextField();
        panel.add(textField6, abc);

        abc.gridx = 0;
        abc.gridy = 5;
        abc.gridwidth=1;
        JLabel label7 = new JLabel("Contract Period(in month):");
        panel.add(label7, abc);

        abc.gridx = 1;
        abc.gridy = 5;
        abc.gridwidth=1;
        textField7 = new JTextField();
        panel.add(textField7, abc);

        abc.gridx = 2;
        abc.gridy = 5;
        abc.gridwidth=1;//the number of columns that the component occupies.
        JLabel label4 = new JLabel("Appointed By :");
        panel.add(label4, abc);

        abc.gridx = 3;
        abc.gridy = 5;
        abc.gridwidth = GridBagConstraints.REMAINDER;//  The textfield  increases upto the maximum width.
        textField4 = new JTextField();
        panel.add(textField4, abc);

        abc.gridx = 0;
        abc.gridy = 6;
        JLabel label = new JLabel("----------------------------------------------------------------"+
                "----------------------------------------------------------------"+
                "----------------------------------------------------------------"+
                "----------------------------------------------------------------"+
                "----------------------------------------------------------------"+
                "------------------------------------------");

        panel.add(label, abc);


        abc.gridx = 0;
        abc.gridy = 7;
        JLabel label8 = new JLabel("Developer Name :");
        panel.add(label8, abc);

        abc.gridx = 1;
        abc.gridy = 7;
        abc.gridwidth=1;
        textField8 = new JTextField();
        panel.add(textField8, abc);


        abc.gridx = 2;
        abc.gridy = 7;
        JLabel label16 = new JLabel("Developer Name :");
        panel.add(label16, abc);

        abc.gridx = 3;
        abc.gridy = 7;
        textField16 = new JTextField();
        panel.add(textField16, abc);

        abc.gridx = 0;
        abc.gridy = 8;
        JLabel label9 = new JLabel("Developer No :");
        panel.add(label9, abc);

        abc.gridx = 1;
        abc.gridy = 8;
        abc.gridwidth = 1;
        textField9 = new JTextField();
        panel.add(textField9, abc);


        abc.gridx = 2;
        abc.gridy = 8;
        JLabel label17 = new JLabel("Developer No :");
        panel.add(label17, abc);

        abc.gridx = 3;
        abc.gridy = 8;
        textField17 = new JTextField();
        panel.add(textField17, abc);


        abc.gridx = 2;
        abc.gridy = 9;
        JLabel label10 = new JLabel("Termination date :");
        panel.add(label10, abc);

        abc.gridx = 3;
        abc.gridy = 9;
        textField10 = new JTextField();
        panel.add(textField10, abc);

        abc.gridx = 0;
        abc.gridy = 9;
        JLabel label_11 = new JLabel("Joining Date :");
        panel.add(label_11, abc);

        abc.gridx = 1;
        abc.gridy = 9;
        abc.gridwidth=1;
        textField11 = new JTextField();
        panel.add(textField11, abc);

        abc.gridx = 2;
        abc.gridy = 10;
        JLabel label_12 = new JLabel("Specialization :");
        panel.add(label_12, abc);

        abc.gridx = 3;
        abc.gridy = 10;
        textField12 = new JTextField();
        panel.add(textField12, abc);

        abc.gridx = 0;
        abc.gridy = 10;
        JLabel label_13 = new JLabel(" Staff Room No.");
        panel.add(label_13, abc);

        abc.gridx = 1;
        abc.gridy = 10;
        textField13 = new JTextField();
        panel.add(textField13, abc);

        abc.gridx = 2;
        abc.gridy = 11;
        JLabel label_14 = new JLabel("Appointed Date:");
        panel.add(label_14, abc);

        abc.gridx = 3;
        abc.gridy = 11;
        textField14 = new JTextField();
        panel.add(textField14, abc);

        abc.gridx = 0;
        abc.gridy = 11;
        JLabel label_15 = new JLabel("Advance Salary(in Rs) :");
        panel.add(label_15, abc);

        abc.gridx = 1;
        abc.gridy = 11;
        abc.gridwidth=1;
        textField15 = new JTextField();
        panel.add(textField15, abc);

        b1 = new JButton("Add platform for Junior Developer");
        abc.gridx = 1;
        abc.gridy = 3;
        abc.gridwidth = 1;
        panel.add(b1, abc);

        b2 = new JButton("Add Platform for Senior Developer");
        abc.gridx = 3;
        abc.gridy = 3;
        panel.add(b2, abc);

        b3 = new JButton("Appoint Senior Developer");
        abc.gridx = 1;
        abc.gridy = 13;
        abc.gridwidth = 1; //the number of columns the component occupies
        panel.add(b3, abc);

        b4 = new JButton("Developer Termination Status");
        abc.gridx = 1;
        abc.gridy = 14;
        panel.add(b4, abc);

        b5 = new JButton("Appoint Junior Developer");
        abc.gridx = 3;
        abc.gridy = 13;
        panel.add(b5, abc);

        b6 = new JButton("Display All");
        abc.gridx = 2;
        abc.gridy = 14;
        panel.add(b6, abc);

        b7 = new JButton("Clear");
        abc.gridx = 3;
        abc.gridy = 14;
        panel.add(b7, abc);


        //creating objects of font and initializing its style
        Font f = new Font("Arial", Font.HANGING_BASELINE + Font.PLAIN + Font.BOLD, 16);
        Font f1 = new Font("Arial", Font.ITALIC, 16);

        //setting fonts of GUI components
        label1.setFont(f);
        label2.setFont(f);
        label3.setFont(f);
        label4.setFont(f);
        label5.setFont(f);
        label6.setFont(f);
        label7.setFont(f);
        label8.setFont(f);
        label9.setFont(f);
        label10.setFont(f);
        label_11.setFont(f);
        label_12.setFont(f);
        label_13.setFont(f);
        label_14.setFont(f);
        label_15.setFont(f);
        label16.setFont(f);
        label17.setFont(f);



        //setting font of textFields
        textField1.setFont(f1);textField2.setFont(f1);
        textField3.setFont(f1);textField4.setFont(f1);
        textField5.setFont(f1);textField6.setFont(f1);
        textField7.setFont(f1);textField8.setFont(f1);
        textField9.setFont(f1);textField10.setFont(f1);
        textField11.setFont(f1);textField12.setFont(f1);
        textField13.setFont(f1);textField14.setFont(f1);
        textField15.setFont(f1);textField16.setFont(f1);
        textField17.setFont(f1);

        b1.setFont(f);b2.setFont(f);
        b3.setFont(f);b4.setFont(f);
        b5.setFont(f);b6.setFont(f);
        b7.setFont(f);

        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Input Panel"));//providing the title for the border.
        setLayout(grid); //set frame layout
        add(panel, abc); //add panel to frame
        setSize(1000, 600); //setting frame size
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //making the program stop when the frame is closed.
        setFont(new Font("Arial", Font.BOLD, 14));
        setVisible(true); //display frame
        setResizable(true);//frame size can be maximized and minimixed
        pack();//The pack method sizes the frame so that all its contents are at or above their preferred sizes.
        setExtendedState(JFrame.MAXIMIZED_BOTH);//Used to make the frame maximized to full screen.



        JButtonHandler handler = new JButtonHandler();//creating the object of JButtonHandler class.
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
    }

    public class JButtonHandler implements ActionListener { //Here,JButtonHandler class implements Actionlistener.

        /**
         * Here , actionPerformed method is created to perform the action
         * when the button is clicked.
         */
        public void actionPerformed(ActionEvent event) {

            String platform, interviewerName, appointedBy, joiningDate,developerName,
                    staffRoomNumber,specialization,appointedDate, terminationDate;
            int workingHour, salary, contractPeriod,
                    developerNo, advanceSalary;



            SeniorDeveloper obj1;//declaring the object for Senior deveoper.
            JuniorDeveloper obj2;//declaring the object for Junior deveoper.


            /**
             * Here, in event.getSource(),event means a event and get source means where the event
             * is gonna happened.
             */

            if (event.getSource() == b1) {//it means if event happens in button 1.
                try {
                    platform = textField1.getText();
                    interviewerName = textField2.getText();
                    workingHour = Integer.parseInt(textField3.getText());
                    salary=0;
                    appointedBy=null;
                    terminationDate=null;
                    //changing the user input value into  integer.
                    //Creating the object of Senior developer class and passing  the user input values as a parameter.
                    obj2= new JuniorDeveloper(platform, interviewerName, workingHour,salary,appointedBy,terminationDate);

                    list.add(obj2);
                    JOptionPane.showMessageDialog(null, "Platform added for Junior Developer");
                    System.out.println(list.toString());
                    textField1.setText(null);
                    textField2.setText(null);
                    textField3.setText(null);
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(null, "Error: Invalid Input!!",
                            "Error", JOptionPane.ERROR_MESSAGE);


                } }//end catch
            else if (event.getSource() == b2)
                try {
                    platform = textField1.getText();
                    interviewerName = textField2.getText();
                    workingHour = Integer.parseInt(textField3.getText());
                    salary=0;
                    contractPeriod=0;
                    obj1 = new SeniorDeveloper(platform, interviewerName, workingHour,salary,contractPeriod);
                    list.add(obj1);
                    JOptionPane.showMessageDialog(null, "Platform added for Senior Developer");
                    System.out.println(list.toString());//returns the string representation of the object.
                    textField1.setText(null);
                    textField2.setText(null);
                    textField3.setText(null);

                } catch (NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "Error: Invalid Input!!",
                            "Error", JOptionPane.ERROR_MESSAGE);


                }
            else if (event.getSource() == b3) {
                try {
                    developerName = textField8.getText();
                    developerNo = Integer.parseInt(textField9.getText());
                    joiningDate = textField11.getText();
                    advanceSalary = Integer.parseInt(textField15.getText());
                    staffRoomNumber = textField13.getText();



                    if (developerNo >= 0 && developerNo < list.size() && list.get(developerNo) instanceof SeniorDeveloper) {
                        obj1 = (SeniorDeveloper) list.get(developerNo);//Here,the senior developer from the developer list is stored in an obj1.
                        obj1.hireDeveloper(developerName,joiningDate,advanceSalary,staffRoomNumber);
                        JOptionPane.showMessageDialog(null, "Senior Developer is sucessfully appointed.");
                        textField8.setText(null);
                        textField9.setText(null);
                        textField11.setText(null);
                        textField15.setText(null);
                        textField13.setText(null);
                    }

                    else {
                        JOptionPane.showMessageDialog(null, "Please enter the appropriate developer number", "Error", JOptionPane.WARNING_MESSAGE );
                        textField9.setText(String.valueOf(-1));

                    }
                } catch (NumberFormatException exc) {
                    exc.getMessage();
                    JOptionPane.showMessageDialog(null, "Please enter the valid number.", "Error", JOptionPane.WARNING_MESSAGE);

                }

            }
            else if(event.getSource()==b4){
                try {
                    developerNo = Integer.parseInt(textField9.getText());
                    if (developerNo >=0 && developerNo < list.size() && list.get(developerNo) instanceof SeniorDeveloper) {
                        obj1 = ( SeniorDeveloper )list.get(developerNo);//Here,the senior developer from the developer list is stored in an obj1.
                        obj1.contractTermination();
                        JOptionPane.showMessageDialog(null,"Successfully called the method Contract termination");
                        System.out.println(list);
                        textField8.setText(null);
                        textField9.setText(null);
                        textField11.setText(null);
                        textField15.setText(null);
                        textField13.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "The developer doesn't exist with your given developerNo -" +
                                        "Please try again with a valid number.",
                                "Error", JOptionPane.WARNING_MESSAGE);
                        textField9.setText(String.valueOf(-1));
                    }
                } // end try
                catch ( NumberFormatException a ){
                    JOptionPane.showMessageDialog( null, ".Please enter the appropriate developer number !", "Error", JOptionPane.WARNING_MESSAGE );
                } // end catch

            }
            else if ( event.getSource() == b5 ){

                try {
                    terminationDate=textField10.getText();
                    specialization = textField12.getText();
                    developerNo = Integer.parseInt(textField17.getText());
                    developerName = textField16.getText();
                    appointedDate = textField14.getText();


                    if (developerNo >=0 && developerNo < list.size() && list.get(developerNo) instanceof JuniorDeveloper) {
                        obj2 = (JuniorDeveloper) list.get(developerNo);//Here,the junior developer from the developer list is stored in an obj2.
                        obj2.appointDeveloper(developerName,appointedDate,terminationDate,specialization);
                        JOptionPane.showMessageDialog(null, "Junior developer is sucessfully appointed.");
                        textField10.setText(null);
                        textField12.setText(null);
                        textField17.setText(null);
                        textField16.setText(null);
                        textField14.setText(null);

                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter the appropriate developer Number.", "Error", JOptionPane.ERROR_MESSAGE);
                        textField9.setText(String.valueOf(-1));
                    }

                } // end try
                catch ( NumberFormatException exception ){
                    exception.getMessage();
                    JOptionPane.showMessageDialog( null, "Please enter the valid Number", "Error", JOptionPane.WARNING_MESSAGE );

                } // end catch

            }
            else if ( event.getSource() == b6 ){
                //Declaring the object of JTextArea
                JTextArea a1, a2;
                JFrame newFrame = new JFrame();//Creating a new frame.

                newFrame.setLayout(new GridLayout());//setting the layout for the new frame.
                JPanel p1 = new JPanel(); //creating JPanel p1
                JPanel p2 = new JPanel(); //creating JPanel p2
                Border outline1;
                outline1 = BorderFactory.createLineBorder(Color.black, 2);
                p2.setBorder(outline1);
                p1.setBorder(outline1);

                for (Developer a : list) {
                    if (a instanceof SeniorDeveloper) {
                        obj1 = (SeniorDeveloper) a; //Initializing a reference-type variable
                        a1 = new JTextArea(
                                "Platform : " + obj1.getPlatform()
                                        + "\n Interviewer Name : " + obj1.getInterviewerName()
                                        + "\n Working Hour : " + obj1.getWorkingHour()
                                        + "\n Developer Name : " + obj1.getDeveloperName()
                                        + "\n Termination Status : " + obj1.getTerminated()
                                        + "\n Joining Date : " + obj1.getJoiningDate()
                                        + "\n Advance Salary : " + obj1.getAdvanceSalary()
                                        + "\n Salary : " + textField5.getText()
                                        +"\n Evaluation Period :   " +textField6.getText()
                                        + "\n Appointed By : " + textField4.getText()
                                        + "\n Staff Room No.: " + obj1.getStaffRoomNumber()
                                        + "\nContract Period : " + textField7.getText()

                        );
                        a1.setEditable(false);
                        a1.setFont(new Font("Arial", Font.BOLD, 17));
                        a1.setBorder(outline1);
                        p1.add(a1);
                        p1.setSize(400, 200);


                    }

                    if (a instanceof JuniorDeveloper) {
                        obj2 = ( JuniorDeveloper ) a; //Initializing a reference-type variable
                        a2 = new JTextArea("Platform : " + obj2.getPlatform()
                                + "\n Interviewer Name : " + obj2.getInterviewerName()
                                + "\n Working Hour : " + obj2.getWorkingHour()
                                + "\n Developer Name : " + obj2.getDeveloperName()
                                + "\n Termination Date : " + obj2.getTerminationDate()
                                + "\n Appointed Date : " + obj2.getAppointedDate()
                                + "\n Appointed By : " + textField4.getText()
                                + "\n Salary : " + textField5.getText()
                                + "\nContract Period : " + textField7.getText()
                                +"\n Evaluation Period :   " +textField6.getText()
                                + "\n Specialization :" + obj2.getSpecialization(), 10, 8
                        );

                        a2.setEditable(false);
                        a2.setFont(new Font("Arial", Font.BOLD, 17));
                        a2.setBorder(outline1);
                        p2.add(a2);
                        p2.setSize(400, 200);

                    }
                }

                //Adding the 2 new panels when the display button is clicked.
                newFrame.add( p1 , BorderLayout.EAST ); //Placing p1 in the East of BorderLayout
                newFrame.add( p2 , BorderLayout.WEST ); //Placing p2 in the West of BorderLayout
                newFrame.setSize(800, 400); //setting frame size
                newFrame.setVisible(true); //make sure the JFrame is visible
                newFrame.setResizable(true);
                newFrame.pack();//sizes the frame so that all its contents are at or above their preferred sizes.


            }
            else if ( event.getSource() == b7 ){
                int YesOrNo = JOptionPane.showConfirmDialog(null, "Do you want to clear the fields?");
                if( YesOrNo == 0 ){
                    textField1.setText( null ); textField2.setText( null ); textField3.setText( null );//To make the textfield empty after clicking yes.
                    textField4.setText( null ); textField5.setText( null ); textField6.setText( null );
                    textField7.setText( null ); textField8.setText( null ); textField9.setText( null );
                    textField10.setText( null ); textField11.setText( null );
                    textField12.setText( null ); textField13.setText( null );
                    textField14.setText( null ); textField15.setText( null );

                }
            }
        }
    }

    public static void main(String [] args){
        new RigoTechnology();
    } //end main method



}







