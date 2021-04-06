/** 
    * Simple program that generates your Horoscope Sign and a Random Horoscope (Java Begineer) 
    * @author Sachin Chhetri <sachinchhetri202@gmail.com>
    * Use of Array, Random and if/else if clause.  
    */

import java.util.Scanner;
import java.util.Random;

public class HoroscopeGenerator{

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int birthMonth;
        int birthDay;
        // use of do while because it runs first and decide to run it again or not 
        do {
            // array for random horoscope
            String[] horoscopes = {"If you think you're spending too much time slacking, then study it out and do the right thing. Bear in mind that nobody can hold you down but yourself.", "Are you wondering about talking to your significant other? This week is ultimately a turning point in your life and you'll know what to do. You feel emotionally centered and ready for almost anything.", "Your next Career: Taxidermist. Buy a box of fake eyeballs. You'll thanks us later.","After months of backbreaking effort, you'll finally finish your first novel. Now, imagine how difficult it would be to actually write one.", "Just when you finally have all the answers, someone has changed all the questions.","Are you wondering about taking a big step in a new direction? The coming week might be the day you became YOU and you'll have to make a decision."};
            String result = horoscopes[new Random().nextInt(horoscopes.length)];

            System.out.println("Horoscope Generator");
            System.out.print("Enter your Birth Month (1-12): ");
            birthMonth = keyboard.nextInt();

            System.out.print("Enter your Birth day: ");
            birthDay = keyboard.nextInt();

            // Flush the Buffer 
            keyboard.nextLine();

            if (birthMonth == 1){
                if (birthDay < 20){
                    System.out.println("You are Capricorn. " + result);
                }
                else {
                    System.out.println("You are Aquarius. " + result);
                }
            }
            else if (birthMonth == 2){
                if (birthDay < 19){
                    System.out.println("You are Aquarius. " + result);
                }
                else {
                    System.out.println("You are Pisces. " + result);
                }
            }
            else if (birthMonth == 3){
                if (birthDay < 21){
                    System.out.println("You are Pisces. " + result);
                }
                else {
                    System.out.println("You are Aries. " + result);
                }
            }
            else if (birthMonth == 4){
                if (birthDay < 20){
                    System.out.println("You are Aries. " + result);
                }
                else {
                    System.out.println("You are Taurus. " + result);
                }
            }
            else if (birthMonth == 5){
                if (birthDay < 21){
                    System.out.println("You are Taurus. " + result);
                }
                else {
                    System.out.println("You are Gemini. " + result);
                }
            }
            else if (birthMonth == 6){
                if (birthDay < 21){
                    System.out.println("You are Gemini. " + result);
                }
                else {
                    System.out.println("You are Cancer. " + result);
                }
            }
            else if (birthMonth == 7){
                if (birthDay < 23){
                    System.out.println("You are Cancer. " + result);
                }
                else {
                    System.out.println("You are Leo. " + result);
                }
            }
            else if (birthMonth == 8){
                if (birthDay < 23){
                    System.out.println("You are Leo. " + result);
                }
                else {
                    System.out.println("You are Virgo. " + result);
                }
            }
            else if (birthMonth == 9){
                if (birthDay < 23){
                    System.out.println("You are Virgo. " + result);
                }
                else {
                    System.out.println("You are Libra. " + result);
                }
            }
            else if (birthMonth == 10){
                if (birthDay < 23){
                    System.out.println("You are Libra. " + result);
                }
                else {
                    System.out.println("You are Scorpio. " + result);
                }
            }
            else if (birthMonth == 11){
                if (birthDay < 22){
                    System.out.println("You are Scorpio. " + result);
                }
                else {
                    System.out.println("You are Sagittarius. " + result);
                }
            }
            else if (birthMonth == 12){
                if (birthDay < 22){
                    System.out.println("You are Sagittarius. " + result);
                }
                else {
                    System.out.println("You are Capricorn. " + result);
                }
            }
        
            System.out.print("Would you like to do this again? y/n: ");
            char check = keyboard.next().charAt(0);
            // if n then break 
            if (check == 'n' || check == 'N'){
                break;
            }
            
            
        } while (true);

    }
}
