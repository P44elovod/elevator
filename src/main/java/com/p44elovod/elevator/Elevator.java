package com.p44elovod.elevator;

public class Elevator {


        String State;
        Integer elevatorsFloorPosition;

        Doors doors = new Doors();

    public String call(Integer callFloor){

        return  elevatorMoove()+" за пассажирами на " + callFloor + "этаж" ;

    }

    public String floorChoice (Integer choosedFloor){

        return doors.closeDoors()+" "+elevatorMoove()+ "с пассажирами на" + choosedFloor+" этаж";

    }


    private String elevatorMoove(){
        return "Лифт двигается";
    }
}

 class Doors{
    String doorState;

    public String openDoors(){
        doorState = "Двери открываются";

        return doorState;
    }

    public String closeDoors() {

        doorState = "Двери закрываются";
        return doorState;
    }

}



