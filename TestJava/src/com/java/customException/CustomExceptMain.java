package com.java.customException;


public class CustomExceptMain {
    public void validate(int age) throws InvalidAgeExcept{
        if(age<18){
            throw new InvalidAgeExcept("less than 18");
        }
        else{
            System.out.print("good to vote\n");
        }
    }
    public static void main(String[] args){
        CustomExceptMain c=new CustomExceptMain();
        try{
            c.validate(15);
        } catch (InvalidAgeExcept e) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + e);
        }
        System.out.println("DONE!!");
    }
}
