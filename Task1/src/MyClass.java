public class MyClass {
    public void methodA() {
        System.out.print("J");
        methodB();
    }

    public void methodB() {
        System.out.print("a");
        methodC();
    }

    public void methodC() {
        System.out.print("v");
        methodD();
    }

    public void methodD() {
        System.out.print("a");
        methodE();
    }

    public void methodE() {
        System.out.print(" ");
        System.out.print("e");
        methodF();
    }

    public void methodF() {
        System.out.print("r");
        methodG();
    }

    public void methodG() {
        System.out.print(" ");
        System.out.print("s");
        methodH();
    }

    public void methodH() {
        System.out.print("j");
        methodI();
    }

    public void methodI() {
        System.out.print("o");
        methodJ();
    }

    public void methodJ() {
        System.out.print("v");
        methodK();
    }

    public void methodK() {
        System.out.print("t");
    }

}