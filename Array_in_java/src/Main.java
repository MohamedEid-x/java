import java.util.Scanner;
public class Main {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int[] shape = new  int [10];
        fillarray(shape);
        printarray(shape);
        System.out.println( "Enter the id you need to search");
        int searchedid= input.nextInt();
       int indexitem=  searcharray(shape,searchedid);
       if (indexitem>=0)
       {
           System.out.println("item is found");
       }else{
           System.out.println("item is not found");
       }

    }

        public static void fillarray(int[] id){
    for(int i =0;i<id.length;i++){
        System.out.println("Enter the item NO"+(i+1));
        id[i]=input.nextInt();
    }

        }
        public static void printarray(int[]id ){
        for (int i = 0;i<id.length;i++){
            System.out.println("item no. "+(i+1)+" = "+id[i]);
        }
        }
        public static int searcharray(int[] id , int target)
        { for(int i = 0;i<id.length;i++){
            if (id[i]==target)
                return i;

        }
            return-1;
        }
}