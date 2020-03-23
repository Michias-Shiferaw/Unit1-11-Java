//Scan all primitive data types
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
* This program holds student information in an array, and as each new
* student's info is entered, a new entry is created in the array.
* Modified to store all student info in an array
* @author Michias Shiferaw
* @Version 2.0
* @since 2020-03-19.
*/

enum Gradelevel { 
        
        twelve("12"),
        eleven("11"),
        ten("10"),
        nine("9"),
        eight("8"),
        seven("7"),
        six("6"),
        five("5"),
        four("4"),
        three("3"),
        two("2"),
        one("1"),
        sk("Senior Kindergarten"),
        jk("Junior Kindergarten");
                
  private final String stringGrade;
                
  Gradelevel(String grade) {
    this.stringGrade = grade;
  }
         
  public String setGrade() {
    return this.stringGrade;
  }
}

class Stud {
        
  private String fname;
  private String lname;
  private char initial;
  private String dob;
  private Gradelevel grade;
  private boolean identify;
                
  public Stud(String fname, String lname, char initial, String dob, Gradelevel grade, boolean identify) {
    this.fname = fname;
    this.lname = lname;
    this.initial = initial;
    this.dob = dob;
    this.grade = grade;
    this.identify = identify;
  }

  public String getfname() {
    return fname; 
  }
        
  public String getlname() {
    return lname; 
  }
                
  public char getinitial() {
    return initial; 
  }
        
  public String getdob() {
    return dob;
  }
                
  public Gradelevel getgrade() {
    return grade; 
  }
                
  public boolean getidentify() {
    return identify; 
  }
                
  public void setfirstName(String fname) {
    this.fname = fname; 
  }
        
  public void setlastName(String lname) {
    this.lname = lname; 
  }
        
  public void setinitial(char initial) {
    this.initial = initial;
  }
  
  public void setdob(String dob) {
    this.dob = dob; 
  }    
  
  public void setgrade(Gradelevel grade) {
    this.grade = grade; 
  }
                
  public void setidentify(boolean identify) {
    this.identify = identify; 
  }
                
}

public class StudInfo {
  
  /**
  * This program holds student information in an array, and as each new
  * student's info is entered, a new entry is created in the array.
  * Modified to store all student info in an array
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-19.
  */      
  public static void main(String[] args) throws IOException {
    //Create a new unlimited array with  
    ArrayList<Stud> classList = new ArrayList<Stud>();
    
    Scanner userinput = new Scanner(System.in);
    Scanner reader = new Scanner(System.in);
    InputStreamReader r = new InputStreamReader(System.in); 
    BufferedReader br = new BufferedReader(r);
    
    //Declare variables
    int counter = 0;          
    String fname = null;
    String lname = null;
    char initial = 0;
    String dob = null;
    Gradelevel grade;
    String gradeList;
    boolean identify = false; 
    boolean finished = false;
                
    while (finished == false) {
      
      counter = counter + 1; 
      
      //Retrieve first name
      System.out.println("Please type the student " + (counter) + "'s name");
      fname = userinput.nextLine();
      //Retrieve lastname         
      System.out.println("Please type student" + (counter) + "'s surname");
      lname = userinput.nextLine();
      //Retrieve intial
      System.out.println("Please type student " + (counter) + "'s middlename initial");
      initial = reader.next().charAt(0);
      //Retrieve date of birth    
      System.out.println("Enter a date of birth (DD/MM/YYYY) of student " + (counter) + ".");
      dob = userinput.nextLine();
      //Retrieve grade level      
      System.out.println("Please type " + fname + "'s grade level. (i.e = ten, sk)");
      gradeList = br.readLine();
      grade = Gradelevel.valueOf(gradeList.toLowerCase());
      
      System.out.println("Is the student # identified? Y/N");

      if (br.readLine().equals("Y")) {
        identify = true;
      }

      Stud curStudent = new Stud(fname, lname, initial, dob, grade, identify);
      System.out.println("First name: " + curStudent.getfname() + ", SurName: " 
          + lname + ", Initial:  "  + curStudent.getinitial()); 
                                
      System.out.println(", Date of Birth: " + curStudent.getdob() + ", grade level: " 
          + curStudent.getgrade() + ",  " + curStudent.getidentify());
      System.out.println("");
      //Add the new student to the array
      classList.add(curStudent); 
      
      System.out.println("Would you like to add a another new student? Y/N");
      String another = null;
      another = reader.next();

      if ((another.equals("N")) || (another.equals("n"))) {
        finished = true;
      }
    }
    
    System.out.println(" Current Students inlisted; ");
    for (Stud element : classList) {
      System.out.println("");
      System.out.println("First name: " + element.getfname() + ", SurName: " 
          + element.getlname() + ", Initial:  "  + element.getinitial());
      System.out.println(", Date of Birth: " + element.getdob() 
          + ", grade level: " + element.getgrade() + ",  " + element.getidentify());
      System.out.println("");
    }
    System.out.println("Bye bye!");
  }
}