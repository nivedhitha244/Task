import java.util.*;
public class SubwaySurfers{
    private static void Game(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nOperation to be performed:");
        char operation=sc.next().charAt(0);
        switch (operation){
            case '<':
                System.out.print("MOVE LEFT");
                Game();
                break;
            case '>':
                System.out.print("MOVE RIGHT");
                Game();
                break;
            case '^':
                System.out.print("JUMP");
                Game();
                break;
            case 'v':
                System.out.print("SLIDE");
                Game();
                break;
            case '.':
                System.out.print("GAME HAS BEEN STOPPED");
                break;
            default:
                System.out.print("RUNNING");
                Game();
                break;
        }
    }
    public static void main(String[] args){
        System.out.println("\nAvailabe Moves:\n\n1.To move Left - '<' \n2.To move Right - '>' \n3.To Jump - '^' \n4.To Slide - 'v' \n5.To stop - '.'");
        Game();
    } 
}