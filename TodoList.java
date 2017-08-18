import java.util.ArrayList;
/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{
    ArrayList<TodoItem> itemList;

    public TodoList(){
        itemList = new ArrayList<>();
    }

    public void addNewItem(String name){
        itemList.add(new TodoItem(name));
    }

    public void removeItem(){
        for(int i=0; i < itemList.size(); i ++){
            if(itemList.get(i).getIsDone() == true){
                itemList.remove(i);
            }
        }
    }

    public void listAll(){
        for(TodoItem item : itemList){
            item.showItem();
        }
    }

    public void markItem(String name){
        for(TodoItem item : itemList){
            if(item.getTitle().equals(name)){
                item.setIsDone(true);
            }
        }
    }
}
