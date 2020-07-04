package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Telephone tamsPhone;
        tamsPhone = new DeskPhone(123456);
        tamsPhone.powerOn();
        tamsPhone.callPhone(123456);
        tamsPhone.answer();

        tamsPhone = new MobilePhone(234552);
        tamsPhone.powerOn();
        tamsPhone.callPhone(234552);
        tamsPhone.answer();
    }
}
