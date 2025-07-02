
public class LocalVar {
    void printname() {
        String s = "bhavya";// local var must be inititliazed within the block.It can be used in method or
                            // block or constructor.
        System.out.println("my name is:" + s);
    }

    public static void main(String[] args) {
        LocalVar obj = new LocalVar();
        obj.printname();
    }

}
