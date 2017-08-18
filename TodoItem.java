/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{
    private String title;
    private boolean isDone;

    public TodoItem(String name){
        title = name;
        isDone = false;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public String getTitle(){
        return title;
        }

    public void showItem(){
        if(isDone){
            System.out.println("[x]  " + title );
        } else{
            System.out.println("[ ]  " + title );
        }
    }
}
