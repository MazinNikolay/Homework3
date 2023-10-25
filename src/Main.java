public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        byte totalPaper=(byte)(paper/(ann+lida+katy));
        System.out.println();
        System.out.println("На каждого ученика рассчитано "+totalPaper+" листов бумаги");
    }
    public static void task4(){
        byte bottleTwoMin=16;
        short bottleTwentyMin=(short)(bottleTwoMin*10);
        short bottleDay=(short)(bottleTwentyMin*72);
        int bottleThreeDay=bottleDay*3;
        int bottleMonth=bottleThreeDay*10;
        System.out.println();
        System.out.println("За 2 минуты машина произвела "+bottleTwoMin+" штук бутылок");
        System.out.println("За 20 минут машина произвела "+bottleTwentyMin+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottleDay+" штук бутылок");
        System.out.println("За трое суток машина произвела "+bottleThreeDay+" штук бутылок");
        System.out.println("За месяц машина произвела "+bottleMonth+" штук бутылок");
    }
    public static void task5(){
        byte totalColor=120;
        byte whiteColorForClass=2;
        byte brownColorForClass=4;
        byte totalClasses=(byte)(totalColor/(whiteColorForClass+brownColorForClass));
        byte totalWhite=(byte)(totalClasses*whiteColorForClass);
        byte totalBrown=(byte)(totalClasses*brownColorForClass);
        System.out.println();
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhite+" банок белой краски и "+totalBrown+" банок коричневой краски");
    }
    public static void task6(){
        byte bananasGr=80;
        byte bananasCount=5;
        byte milkGr=105;
        byte milkCount=2;
        byte iceCreamGr=100;
        byte iceCreamCount=2;
        byte eggGr=70;
        byte eggCount=4;
        short cocktail=(short)((bananasGr*bananasCount)+(milkGr*milkCount)+(iceCreamGr*iceCreamCount)+(eggGr*eggCount));
        float cocktailKg=cocktail/1000f;
        System.out.println("Масса завтрака в граммах равна "+cocktail);
        System.out.println("Масса завтрака в килограммах равна "+cocktailKg);
    }
}