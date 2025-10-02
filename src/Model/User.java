/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class User {

    private String first_name;
    private String last_name;
    private String gender;
    private int age;
    private String email;
    private String phone_number;
    private String continent;
    private String hobbies;
    private String imagePath; // NEW FIELD

    public User() { }

    public User(String first_name, String last_name, String gender, int age, String email, String phone_number, String continent, String hobbies, String imagePath) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone_number = phone_number;
        this.continent = continent;
        this.hobbies = hobbies;
        this.imagePath = imagePath;
    }

    public String getFirst_name() { return first_name; }
    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone_number() { return phone_number; }
    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }

    public String getContinent() { return continent; }
    public void setContinent(String continent) { this.continent = continent; }

    public String getHobbies() { return hobbies; }
    public void setHobbies(String hobbies) { this.hobbies = hobbies; }

    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    @Override
    public String toString() {
        return "User_INFO: \n"
                + "  first_name = " + first_name + "\n"
                + "  last_name = " + last_name + "\n"
                + "  gender = " + gender + "\n"
                + "  age = " + age + "\n"
                + "  email = " + email + "\n"
                + "  phone_number = " + phone_number + "\n"
                + "  continent = " + continent + "\n"
                + "  hobbies = " + hobbies + "\n";
                
    }
}
