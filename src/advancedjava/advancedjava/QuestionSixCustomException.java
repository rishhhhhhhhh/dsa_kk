package advancedjava;
class VoterIdAgeRestriction extends Exception {
    public VoterIdAgeRestriction(String message) {
        super(message);
    }
}

class QuestionSixCustomException {

    public static void checkVoterAge(int age) {
        if (age < 18) {
            try {
                throw new VoterIdAgeRestriction("Only above 18 can vote");
            } catch (VoterIdAgeRestriction e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        int age = 10;
        checkVoterAge(age);
    }
}