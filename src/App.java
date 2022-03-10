// Changed name of class to app.
public class App{

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 // Week 3 Intro to Java Sample Coding Assignment Document
    
    // Question 3a & b using primitive types to declare variables to hold Item Price & Amount of Money In My Wallet
    double originalWalletAmount = 425.25;
    double sunGlassPrice = 210.25;
    double returnBackPackPrice = 65.50;
    
    //Question 4a setting variables to hold the sum of what is spent during a shopping trip 4a
    double newWalletAmount1 = originalWalletAmount - sunGlassPrice;
    double newWalletAmount2 = newWalletAmount1 + returnBackPackPrice;
    
    //Question 5 using the System.out.printf to keep the code clean and sent to the console.
    System.out.printf("Before I went to the mall I had $ %.2f in my wallet.\n", originalWalletAmount);
    System.out.printf("I purchased a new pair of sun glasses and it left me with $ %.2f.\n", newWalletAmount1);
    System.out.printf("I then returned a backpack I received as a gift and I now have $ %.2f.", newWalletAmount2);
    System.out.println("\n");
    
    // Question 3c & d   using primitive types to declare variables to number of friends and age for my wife & I.
    int numberOfFriends = 200;
    int myAge = 37;
    int wifesNumberOfFriends = 500;
    int wifesAge = 37; 
    
    // Question 4b setting variables to hold the average of how many friends we have made through our lifeitme.
    double avgFriendsPerYr = (double) numberOfFriends/myAge;
    double avgFriendsPerYr2 = (double) wifesNumberOfFriends/ wifesAge;
    
    //Question 5 using the System.out.printf to keep the code clean and sent to the console.
    System.out.printf("I have made %.2f friends per year since my birth.\n", avgFriendsPerYr);
    System.out.printf("My wife has made %.2f friends per year since her birth.\n", avgFriendsPerYr2);
    System.out.println("");
    
    //Question 3 e,f, & g using primitive types to hold our full names.
    String myFirstName = "Harold";
    char   myMiddleInitial = 'M';
    String myLastName = "Lujan";
    String myWifesFirstName = "Victoria";
    char   myWifesMiddleInitial = 'A';
    String myWifesLastName = "Lujan";
    
    //assigning full name variable
    String fullName = myFirstName + " " + myMiddleInitial + " " + myLastName;
    String wifesFullName = myWifesFirstName + " " + myWifesMiddleInitial + " " + myWifesLastName;
    
    //Question 5 using the System.out.printf to keep the code clean and sent to the console.
    System.out.printf("Hello my name is %s.\n", fullName);
    System.out.printf("Hello my wife's name is %s.", wifesFullName);
  }
  
  // end of main method
  
}
