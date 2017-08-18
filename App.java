import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
    static Scanner input;
    static TodoList list;

    public static void main(String[] args) {
        list = new TodoList();
        input = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("0")){
            showMenu();
            choice = input.nextLine();

            if(choice.equals("1")){
                addEvent();

            } else if(choice.equals("2")){
                list.removeItem();

            } else if(choice.equals("3")){
                list.listAll();

            } else if(choice.equals("4")){
                markEvent();
            }
        }
        input.close();
    }

    private static void showMenu(){
        String menu = "1.Add new item\n2.Remove done items\n3.Show items\n4.Mark item\n0.Exit";
        System.out.println(menu);
    }

    private static void addEvent(){
        System.out.println("Enter event name : ");
        String name = input.nextLine();
        list.addNewItem(name);
    }

    private static void markEvent(){
        System.out.println("Enter event name : ");
        String name = input.nextLine();
        list.markItem(name);
    }
}
