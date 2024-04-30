class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author:
   * @return 
   * @return 
  */
  
  public void run() {
   
  //declare variables 
  String strFirstName;
  String strLastName;
  String strStudentNum;
  String password;
  String strUsername;
  boolean blnPassword;

  System.out.println("*****Student Account Registration*****"); 
  strFirstName = readLine("Enter your first name:");
  strLastName = readLine("Enter your last name:");
  strStudentNum = readLine("Enter your student number:");
  password = readLine("Enter a new password:");
  strUsername = createUserName(strFirstName, strLastName, strStudentNum);
  blnPassword = validatePassword(password);

  System.out.println("");
  System.out.println("Your username is:" + strUsername);
  System.out.println("Valid password" + blnPassword); 

  /** 
   * the method "create username" returns a generated username 
   * only if you give a first name, last name, and a student number
   * @param strFirstName user's first name
   * @param strLastName user's last name 
   * @param strStudentNum user's student number 
   * @return user's generated username 
   * 
  */

  //limits 
  if (strFirstName == "" || strLastName == "" || strStudentNum == "");
    throw new IllegalArgumentException ("Incorrect parameter(s)");


  //declare variables 
  String result = "";
  String s = ""; 
  String a = "";

  char c = strFirstName.charAt (0);
  if (Character.isLowerCase (c)); 
    c = Character.toUpperCase (c);
    





  }
}

