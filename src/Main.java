public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        int i=700;
        byte b=125;
        short s=258;
        long l=555L;
        float f=20.22f;
        double d=40.88;

        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной s с типом short равно "+s);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной d с типом double равно "+d);
    }
    public static void task2(){
        float f=27.12f;
        long l=987678965549L;
        double d=2.786;
        short s=569;
        short shortSecond=-159;
        int i=27897;
        byte b=67;
    }
    public static void task3(){
        byte lida=23;
        byte ann=27;
        byte katy=30;
        short paper=480;
        int totalPaper=paper/(ann+lida+katy);
        System.out.println("На каждого ученика рассчитано "+totalPaper+" листов бумаги");
    }
}