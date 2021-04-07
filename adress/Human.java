package adress;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;

public class Human {

    private String lastname;
    private Adress adress;
    private Calendar age;

    public Human(String lastname, Adress adress, Calendar age){
        this.lastname = lastname;
        this.adress = adress;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public Calendar  getAge() {
        return age;
    }

    public void setAge(Calendar  age) {
        this.age = age;
    }

    @Override
    public String toString(){
        LocalDate today = LocalDate.now();
        Period p = Period.between(LocalDate.ofInstant(this.age.toInstant(), ZoneId.systemDefault()), today);
        return this.lastname+", "+this.adress.toString()+", "+p.getYears() +" years old";
    }

}
