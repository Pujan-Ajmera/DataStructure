import java.util.*;
public class Lab_17_89 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dictionary d = new Dictionary();
        String choice="";
        String key="";
        String value="";
        while(!choice.equals("-1")){
            System.out.println("Enter 1 to insert : ");
            System.out.println("Enter 2 to delete : ");
            System.out.println("Enter 3 to update : ");
            System.out.println("Enter 4 to display : ");
            System.out.println("Enter -1 to exit");
            choice = sc.next();
            sc.nextLine();
            switch(choice){
                case "1":
                System.out.println("Enter key : ");
                key=sc.next();
                System.out.println("Enter value : ");
                value=sc.next();
                d.insert(key,value);
                break;
                case "2":
                System.out.println("Enter key you want to delete : ");
                key = sc.next();
                d.delete(key);
                break;
                case "3":
                System.out.println("Enter key : ");
                key = sc.next();
                System.out.println("Enter value : ");
                value = sc.next();
                d.update(key,value);
                break;
                case "4":
                d.display();
                break;
                case "-1":
                System.out.println("Exiting the loop ...");
                return;
            }
        }
    }    
}
class Dictionary{
    ArrayList<String> keys = new ArrayList<>();
    ArrayList<String> values = new ArrayList<>();
    void insert(String key,String value){
        if(!keys.contains(key)){
            keys.add(key);
            values.add(keys.indexOf(key),value);
        }else{
            System.out.println("Error:Key is already present");
        }
        System.out.println("Successfully Inserted");
    }
    void delete(String key){
        values.remove(keys.indexOf(key));
        keys.remove(key);
        System.out.println("Successfully Deleted");
    }
    void update(String key,String value){
        if(keys.contains(key)){

        values.set(keys.indexOf(key),value);
        }
        else{
            System.out.println("Error:There is no such key : ");
        }
    }
    void display(){
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+":"+values.get(i));
        }
    }

}
