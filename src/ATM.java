public abstract class ATM {

    public abstract void withdraw(int draw);


    public void nonAbstractMethod() {
        System.out.println("can be used to create a object of abstract by this method");
    }
}
