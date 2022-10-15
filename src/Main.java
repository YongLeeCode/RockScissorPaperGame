import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //random
        Random random = new Random();

        //input in java
        Scanner sc = new Scanner(System.in);

        //declare the variables
        int win = 0;
        int life = 3;

        //user choice
        String your_choice;

        //
        String comp_idea;
        int rand_num;

        //print the basic start
        System.out.println("---------------------------------");
        System.out.println("This game is Rock Scissor Paper");
        System.out.println("---------------------------------");
        System.out.println("You have 3 life points.");
        System.out.println("If your life become 0, the game is done.");
        System.out.println("---------------------------------");

        System.out.println("Do you want to start the game?");
        System.out.println("1. start");
        System.out.println("2. end the game");
        int i = sc.nextInt();
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        //situation: user select end the game.
        if (i == 2){
            System.out.println("Please Play the game next time.");
        }
        while(i != 2){
            if(i == 1){
                //while loop for choices
                while(life != 0) {
                    System.out.println("---------------------------------");
                    System.out.println("---------------------------------");
                    System.out.println("---------------------------------");
                    System.out.println("what is your choice?");
                    System.out.println("1: Rock");
                    System.out.println("2: Scissor");
                    System.out.println("3: Paper");
                    int num = sc.nextInt();
                    your_choice = trans_your_choice(num);
                    rand_num = random.nextInt(3);
                    comp_idea = comp_choice(rand_num);
                    //win situation 1
                    if (your_choice == "Rock" && comp_idea == "Scissor"){
                        System.out.println("---------------------------------");
                        System.out.println("You: " + your_choice + " || Computer: " + comp_idea);
                        win++;
                        System.out.println("You Win! ||" + "Win: " + win + " || life point: " + life);
                    }
                    //win situation 2
                    else if (your_choice == "Paper" && comp_idea == "Rock"){
                        System.out.println("---------------------------------");
                        System.out.println("You: " + your_choice + " || Computer: " + comp_idea);
                        win++;
                        System.out.println("You Win! ||" + "Win: " + win + " || life point: " + life);
                    }
                    //win situation 3
                    else if (your_choice == "Scissor" && comp_idea == "Paper"){
                        System.out.println("---------------------------------");
                        System.out.println("You: " + your_choice + " || Computer: " + comp_idea);
                        win++;
                        System.out.println("You Win! ||" + "Win: " + win + " || life point: " + life);
                    }
                    //draw situation
                    else if (your_choice==comp_idea) {
                        System.out.println("---------------------------------");
                        System.out.println("You: " + your_choice + " || Computer: " + comp_idea);
                        System.out.println("Draw!!! Try again.");
                        System.out.println("Win: " + win + " || life point: " + life);
                    }
                    else {
                        System.out.println("---------------------------------");
                        System.out.println("You: " + your_choice + " || Computer: " + comp_idea);
                        System.out.println("You Lose...");
                        life--;
                        System.out.println("Win: " + win + " || life point: " + life);
                    }

                }
            }
            else{
                System.out.println("---------------------------------");
                System.out.println("Please enter 1 or 2");
                System.out.println("---------------------------------");
            }
            System.out.println("---------------------------------");
            System.out.println("Do you want to play the game one more time?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            i = sc.nextInt();
            if(i == 1){
                life = 3;
                win = 0;
            }
            else if (i == 2) {
                System.out.println("GG");
            }
        }


        // 0 = rock
        // 1 = scissor
        // 2 = paper
    }

    static String trans_your_choice(int i){
        String choice = null;
        switch(i){
            case 1:
                choice = "Rock";
            case 2:
                choice = "Scissor";
            case 3:
                choice = "Paper";
        }
        return choice;
    }

    static String comp_choice (int index){
        String comp = null;
        switch(index){
            case 0:
                comp = "Rock";
                break;
            case 1:
                comp = "Scissor";
                break;
            case 2:
                comp = "Paper";
                break;
        }
        return comp;
    }
}

