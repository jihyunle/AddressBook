public class Car {

    // variable
    private String model;

    // constructor
    public Car(){

    }

    // one-argument constructor
    public Car(String model){
        setModel(model);
    }


    // setter - SETS the value of variable
    // public - access modifier
    // void - doesn't return any data type
    // setModel - function name
    // model - argument or parameter
    public void setModel(String model){

        this.model = model;

    }

    // getter - GETS the value of variable
    // public - access modifier
    // String - returns String data type
    public String getModel(){

        return model;

    }
}
