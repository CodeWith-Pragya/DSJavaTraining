package oops;

//it is data binding using methods
public class EncapsulationJava {
    public static void main(String[] args) {
        //to print the trainer profile
        Trainers trainers = new Trainers();
        //1. data add using object and reference
        trainers.name = ("Pragya Singh");
        trainers.email = ("pragya@Gmail.com");
        trainers.technology = ("JAVA");

        System.out.println(trainers.name + trainers.technology + trainers.email);

        //2.  data add using object and reference
        trainers.printProfile("Pragya Singh", "pragya@gmail.com", "JAVA");

        //3. data add using encapsulation
        //add the data using getter and setter
        trainers.setName("Pragya");
        trainers.setEmail("pragya@gmail.com");
        trainers.setTechnology("JAVA");

        System.out.println(trainers.getName() + trainers.getTechnology() + trainers.getEmail());

    }

}

class Trainers {
    public String setTechnology;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String email;
    String technology;


    void printProfile(String pragyaSingh, String mail, String java) {
        System.out.println(pragyaSingh + mail + java);
    }
}



