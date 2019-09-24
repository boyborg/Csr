import java.util.Scanner;

public class CrsScan{
    public static void main(String[] args) throws NullPointerException{
        int p=0;
        String nama,input;
        char jk;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("1. Input Data");
            System.out.println("2. Keluar");
            p=scan.nextInt();
            switch (p){
                case 1:{
                do{
                    System.out.print("Nama : ");
                    nama=scan.next();
                    System.out.print("Jenis Kelamin L/P :");
                    jk=scan.next().charAt(0);
                    System.out.print("input lagi Y/N : ");
                    input=scan.next();
                }while(input.equalsIgnoreCase("Y"));
                System.exit(1);

                }
                case 2 :
                System.out.println("Thank you");
                break;
                default:
                break;
            }p=scan.nextInt();
        
            }while(p<=2 && p>0);
            


        
    }
    
}