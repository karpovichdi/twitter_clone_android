package comdfsgfrgtdg.example.karpo.task.model;

public class User {

    private String email;
    private String name;
    private String lastName;
    private String gender;
    private int age;

    public User(String email, String name, String lastName, String gender, int age) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
