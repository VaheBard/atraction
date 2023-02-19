import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Person>  queue = new LinkedList<>(generateClients());
        int counter = 1;
       while (!queue.isEmpty()){

           Person p = queue.peek();

           System.out.println(p.name + " " + p.surname + " прокатился ");

           p.setAmountOfTickets(p.amountOfTickets - 1);
           System.out.println(p.amountOfTickets);
           queue.poll();


           if (p.amountOfTickets > 0){

               queue.add(p);
           }

           }


    }
       public static List<Person> generateClients() {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Vanya", "Dudukov", 3));
        persons.add(new Person("Petya", "Krasnov", 2));
        persons.add(new Person("Sofia", "Streltsova", 4));
        persons.add(new Person("Sanya", "Budnik", 1));
        persons.add(new Person("Anya", "Kosygina", 7));


        return persons;
    }
}
