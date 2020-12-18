import java.util.ArrayList;

class Collections{
    public static void main(String args[]){

        System.out.println("Hello");
        ArrayList<String> names=new ArrayList<>();
        names.add("Davish");
        names.add("Gautam");
        names.add("sli");
        names.add("ss");

        for(String name:names)
        {
            System.out.print(name);
        }
    }
}