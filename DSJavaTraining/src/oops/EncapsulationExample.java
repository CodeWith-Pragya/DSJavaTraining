 package oops;

    public class EncapsulationExample {
        public static void main(String[] args) {
            studentProfile student = new studentProfile();
            student.name = ("pragya singh");
            student.email = ("pragya@gmail.com");
            student.address = ("lucknow");
            student.mobilenumber = ("3939393993");

            System.out.println(student.name + student.mobilenumber + student.email + student.address);

            //2.data add using object and reference
            //  student.printprofile("pragya singh", "pragya@gmail.com", "lucknow", "3939393993");

            //3. data add using encapsulation
            //add the data using getter and setter
            student.setName("pragya singh");
            student.setEmail("pragya@gmail.com");
            student.setMobilenumber("3939393993");
            student.setAddress("lucknow");

            System.out.println(student.getName() + student.getEmail() + student.getAddress() + student.getMobilenumber());
        }
    }
 class studentProfile {

     public String studentInfo;

     String name;
     String email;
     String mobilenumber;
     String address;

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
     public String getMobilenumber() {
         return mobilenumber;
     }
     public void setMobilenumber(String mobilenumber) {
         this.mobilenumber = mobilenumber;
     }
     public String getAddress() {
         return address;
     }
     public void setAddress(String address) {
         this.address = address;
     }
}
