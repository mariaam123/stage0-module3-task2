package school.mjc.stage0.module3.task2;

class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        System.out.println("Calling a friend...");
    }

    void callByNumber(int number) {
        System.out.println("Calling " + number + "...");
    }

    public static void main(String[] args) {
        AdvancedNamingConvention myObject = new AdvancedNamingConvention();

        myObject.callToFriend();
        myObject.callByNumber(123456789);
    }
}

