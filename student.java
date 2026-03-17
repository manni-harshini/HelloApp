public class student {
    public class Student{
        public static void main(String[] args) {
            int[] ar=new int[5];
            ar[0]=10;
            ar[1]=20;
            ar[2]=30;
            ar[3]=40;
            ar[4]=50;
            

            System.out.println(ar[0]);
            System.out.println(ar[1]);
            System.out.println(ar[2]);
            System.out.println(ar[3]);
            System.out.println(ar[4]);

            for(int i=0;i<ar.length;i++){
                System.out.println(ar[i]+"");
            }

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Size of Array:");
            int size=sc.nextInt();

            int[] array=new int[size];

            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]+"");
            }


            
        }
    }
    
}
