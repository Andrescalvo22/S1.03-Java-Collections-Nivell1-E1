import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months= new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

       Month agost= new Month("August");
       months.add(7,agost);

       Set<Month>monthSet= new HashSet<>();
       monthSet.add(new Month("January"));

       System.out.println("ArrayList in order:");
       for(Month m: months){
       System.out.println(m.getName());

        }
       System.out.println("");
       System.out.println("ArrayList without duplicates:");
       for(Month m: months){
           System.out.println(m.getName());
       }
       System.out.println("");
       System.out.println("ArrayList path with a for loop");
       for(Month m: months){
           System.out.println(m.getName());
       }
       System.out.println("");
       System.out.println("ArrayList path with a Iterator");
       Iterator<Month> it= months.iterator();
       while(it.hasNext()){
           System.out.println(it.next().getName());
       }

    }

}