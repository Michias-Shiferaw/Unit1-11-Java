

class Stud {
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

  private String fname;
  private String lname;
  private char initial;
  private String dob;
  private Gradelevel grade;
  private boolean identify;
                
  public Stud(String fname, String lname, char initial, Gradelevel grade, boolean identify) {
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
        
  public void setgrade(Gradelevel grade) {
    this.grade = grade; 
  }
                
  public void setidentify(boolean identify) {
    this.identify = identify; 
  }
                
}