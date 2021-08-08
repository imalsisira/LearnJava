package com.imal.test;

class Car {
    private String studentName;

    String carName;
    String carType;

    Car(String carName,String carType){
        this.carName = carName;
        this.carType = carType;
    }

    private String getCarName(){
        return this.carName;
    }

    private String getStudent(){
        return null;
    }

    class Engine{
        String engineType;
        void setEngine(){
            if (Car.this.carType.equals("4WD")){
                if (Car.this.getCarName().equals("Crysler")){
                    this.engineType = "Smaller";
                }else{
                    this.engineType = "Bigger";
                }
            }else {
                this.engineType ="Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
        String setStudentName(String name){
            return Car.this.studentName = name;
        }

        String getStudentName(){
            return Car.this.studentName;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","4WD");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println(engine.getEngineType());
        System.out.println("access directly car name  " + car1.carType);

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine engine1 = car2.new Engine();
        engine1.setEngine();
        System.out.println(engine1.getEngineType());

        engine.setStudentName("imal");
        System.out.println("-----------------------"+engine.getStudentName());
    }
}
