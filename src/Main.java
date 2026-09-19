//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Test {

    @Override
    public int number(int a) {
        a = a * a;
        return a;
    }

    public static void main(String[] args) {

/*
   //********** Method Overriding ************
//always rights the objects type not the reference type
        Test test=new Test();
        int number = test.number(10);
        System.out.println("number " + number);

        Test main=new Main();
        int number1 = main.number(10);
        System.out.println("number " + number1);
*/


       /* //Encapsulation
        Test encapTest = new Test();
        encapTest.setValue(100);

        int encapvalue = encapTest.getValue();
        System.out.println("encapsulation value " + encapvalue);*/

    }
}