public class PracticeCode {

        //creating different methods
        //instance variable
        private int payPerHour = 44;

        //Fixed or static variable
        public static final double APR_RATE = 4.4;

        public int method1(){
            return 999;
        }

        public int method2(){
            System.out.println("This is method second");
            return payPerHour+10;

        }
        public double method3(){
            int x = 0;
            return x + APR_RATE;
        }
        public void method4(int number, String text){
            System.out.println(number + ":" + text);
        }
        public void method5(){
            //local variable
            String S = "Hello Java World";
            System.out.println(S);
        }
        private double method6(){
            double sum;
            return sum = method1()+method3();
        }

    }
