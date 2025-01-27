package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args){
    getInput();
  }
  public static void getInput(){
    Scanner scanner = new Scanner(System.in);
    int userNum;
    while(true){
      System.out.println("Please enter a value.");
      if(scanner.hasNextInt()){
        userNum=scanner.nextInt();
        if(userNum >= 25 && userNum <= 150){
          System.out.println("The value chosen by the user is " +userNum);
          break;
        }else{
          System.out.println("The value you chose is invalid");
          System.out.println("Please enter a value");
        }
      }else{
        System.out.println("This is an invalid inout, please enter a value");
        scanner.next();
      }
      }
      scanner.close();
      }
      
    
  }

  

