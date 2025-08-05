package dsa.Recurssion;

public class reverceString {
//    public static void reverse(String s, int n){
//
//        System.out.print(s.charAt(n));
//        if(n>=0){
//            reverse(s,n-1);
//        }
//    }

//    public static void reverse(String s, int n){
//
//        if(n<=s.length()-1){
//            reverse(s,n+1);
//            System.out.print(s.charAt(n));
//        }
//    }

//    public static String reverse(String s, int n){
//
//        if(n<s.length()-1){
//            return reverse(s,n+1) + s.charAt(n)+"";
//        }
//        return s.charAt(n)+"";
//    }


    public static String reverse(String str){
        if(str.length()>1){
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length() - 1));
        }
        return str;
    }

    public static int factorial(int num){
        if(num<0){
            System.out.println("Value is invalid");
            return -1;
        }
        if(num == 1 || num == 0){
            return 1;
        }
        if(num>1){
            return num*factorial(num-1);
        }
        return num;
    }

    public  static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static Integer sumOfDigit(Integer num){
        if(num>9){
            return num%10 + sumOfDigit(num/10);
        }
        return num;
    }

    public static boolean palindrom(String str){
        if(str.length()<2){
            return true;
        }
        boolean b = str.charAt(0) == str.charAt(str.length()-1);

        return b && palindrom(str.substring(1,str.length()-1));
    }


    public static void main(String[] args) {
        String str = "Hello";
        int len =  str.length();


//        reverse(str,len-1);
//        System.out.println();

//        reverse(str,0);
//        System.out.println();

        System.out.println(reverse(str));



        ////////////Solve by using For Loop//////////////////////////
        for(int i=len-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("    reverse");

        int x = 12;
        System.out.println("The factorial of "+ x +" is : "+factorial(x));

        System.out.println(fibonacci(5));

//
//        char c = str.charAt(str.length()-1);
//        System.out.println(c);
//
//        str = str.substring(0,str.length()-1);
//
//        c = str.charAt(str.length()-1);
//        System.out.println(c);
//        c = str.charAt(str.length()-1);
//        System.out.println(c);
//        c = str.charAt(str.length()-1);
//        System.out.println(c);



        System.out.println(sumOfDigit(1234));

        str = "KANAK";

        System.out.println(palindrom(str));
    }
}
