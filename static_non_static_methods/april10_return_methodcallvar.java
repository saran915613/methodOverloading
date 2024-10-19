public class april10_return_methodcallvar {


        int multiples(int m){

            //long m1= m*10; (can't have greater memory data type)
            short m1 = (short) (m*10);
            System.out.println("Multiples of m = "+m);
            return m1;
        }

        boolean checkevenodd(int numseq){

            boolean b = false;
            while(numseq >= 0 && numseq%2==0){

                b= true;
                System.out.println(b);
                return b;
            }
           return b;
        }
    }


