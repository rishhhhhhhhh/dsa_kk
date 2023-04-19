package advancedjava;
class Name {
    private String firstName;
    private String lastName;

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getName() {
        System.out.println("Name: " + this.firstName + (this.lastName != null ? (" " + this.lastName) : ""));
    }
}

class QuestionFourMethodOverloading {
    public static void main(String[] args) {
        Name person1 = new Name();
        person1.setName("Risha");
        person1.getName();
        Name person2 = new Name();
        person2.setName("Risha", "Rahaman");
        person2.getName();
    }
}