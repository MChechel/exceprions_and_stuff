package com.company.Collections.ListExercise;

import java.util.ArrayList;
import java.util.List;
import static com.company.Collections.ListExercise.Coton.carGiveAway;

public class ClassesTestFOrCoton {
    public static void main(String[] args) {
        //TASK! 10:35 - 40min+10 -- 11:25
        Coton myFirstCar = new Coton("Red","200",true,"COOL",2022,true);
        Coton mySecondCar = new Coton("Blue","220",false,"Futuristic",2020,false);
        Coton myThirdCar = new Coton("Black","180",false,"Old-shcool",1980,true);
        Coton myForthCar = new Coton("White","150",true,"Cyber_punk",2000,false);
        Coton myFifthCar = new Coton("Yellow","235",false,"COOL",2021,true);

        List<Coton> allOurCars = new ArrayList<>();
        allOurCars.add(myFirstCar);
        allOurCars.add(mySecondCar);
        allOurCars.add(myThirdCar);
        allOurCars.add(myForthCar);
        allOurCars.add(myFifthCar);

        Person Mike =  new Person("Mike",25,new ArrayList<Coton>(),true);
        Person James =  new Person("James",30,new ArrayList<Coton>(),true);
        Person Bond =  new Person("Bond",30,new ArrayList<Coton>(),true);
        Person Bond1 =  new Person("Bond1",30,new ArrayList<Coton>(),true);
        Person Bond2 =  new Person("Bond2",30,new ArrayList<Coton>(),true);
        Person Bond007 =  new Person("Bond007",30,new ArrayList<Coton>(),false);
        // mike have coton cars
        Mike.setCotonsOwned(myFirstCar);
        Mike.setCotonsOwned(myThirdCar);
        // james get one randomly
        James.getsNewCoton(allOurCars);
        System.out.println(James.getCotonsOwned());
        System.out.println(James);



        System.out.println(Bond2);
        //coton give away cars to the list of PEOPLE
        List<Person> somePeople = new ArrayList<>();
        somePeople.add(Bond);
        somePeople.add(Bond1);
        somePeople.add(Bond2);
        somePeople.add(Bond007);

        carGiveAway(somePeople,allOurCars);
        System.out.println(Bond2);
    }
}
