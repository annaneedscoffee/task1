package adress;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Main {

   static void findhumanbylastname(Human[] humans, String lastname){

        for(int i = 0; i< humans.length;i++){
            if (humans[i].getLastname() == lastname){
                System.out.println("People found by last name: "+humans[i]);
            }
        }

    }

    static void findhumansbyadress(Human[] humans, String adress){

        for(Human i : humans){
            if (i.getAdress().toString().equals(adress)){
                System.out.println("People found by adress: " +i);
            }
        }

    }

    static void bornbetweendates(Human[] humans, GregorianCalendar dateone, GregorianCalendar datetwo){

        for(Human i : humans){
            if ((dateone.before(i.getAge())&&datetwo.after(i.getAge()))|(dateone.after(i.getAge())&&datetwo.before(i.getAge()))){
                System.out.println("People born between given dates: "+i);
            }
        }

    }

    static void oldestandyoungest(Human[] humans){

        int youngest = 0;
        int oldest = 0;
        for (int x = 0; x< humans.length;x++){
            youngest = humans[x].getAge().after(humans[youngest].getAge())? x : youngest;
            oldest = humans[x].getAge().before(humans[oldest].getAge())? x : oldest;
        }
        System.out.println("Youngest: "+humans[youngest]);
        System.out.println("Oldest: "+humans[oldest]);


    }

    static void samestreet(Human[] humans){

        for (int x = 0; x<humans.length;x++){
            ArrayList<Human> result = new ArrayList<Human>();
            for (int y = x; y<humans.length; y++){

                if(humans[x].getAdress().getStreet().equals(humans[y].getAdress().getStreet())){
                    result.add(humans[y]);
                    }
                }
            if (result.size()>1){
                for (Human i : result){
                    System.out.println("People living on the same street: "+i);
                }
            }
        }

    }


    public static void main(String[] args) {
        Human[] humans = new Human[4];
        humans[0] = new Human("Jackson",new Adress("Example St.",25),new GregorianCalendar(1998,8,14));
        humans[1] = new Human("Smith",new Adress("Example St.",37), new GregorianCalendar(1978,1,21));
        humans[2] = new Human("Anderson", new Adress("Sample St.", 22), new GregorianCalendar(2001,5,7));
        humans[3] = new Human("Grant", new Adress("Blank St.",71), new GregorianCalendar(1980,4,9));

        findhumanbylastname(humans,"Jackson");
        findhumansbyadress(humans, "Example St., 25");
        bornbetweendates(humans, new GregorianCalendar(1990,0,1),new GregorianCalendar(2000,0,1));
        oldestandyoungest(humans);
        samestreet(humans);

    }
}
