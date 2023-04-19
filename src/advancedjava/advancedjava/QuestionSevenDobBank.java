package advancedjava;
class DobAgeRestriction extends Exception {
    public DobAgeRestriction(String message) {
        super(message);
    }
}

class QuestionSevenDobBank {

    public static void checkDOB(int age) {
        if (age < 18) {
            try {
                throw new DobAgeRestriction("Only above 18 can have a bank account.");
            } catch (DobAgeRestriction e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You are eligible to hava a bank account.");
        }
    }

    public static void main(String[] args) {
        int age = 10;
        checkDOB(age);
    }
}