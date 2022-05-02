package com.pack6;


public class CustomExcept {
    public void validate(int age) throws InvalidAgeExcept{
        if(age<18){
            throw new InvalidAgeExcept("less than 18");
        }
        else{
            System.out.print("good to vote\n");
        }
    }
    public static void main(String args[]){
        CustomExcept c=new CustomExcept();
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
