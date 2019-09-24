import java.util.ArrayList;

public class CsrArray{
    public static void main(String[] args) {
                
        String [] name= new String[5];
        name [0] = "jack";
        name [1] = "mas";
        name [2] = "kres";
        name [3] = "rush";
        name [4] = "hind";
        System.out.println("pilih nama "+name[3]);
        for(int i =0; i< name.length; i++){
            System.out.println("Nama dari index-"+i+" adalah "+name[i]);
        }
        

        String [] chara= {"chaos","cao cao","heir"};

        System.out.println(chara[2]);
        for(int i=0; i<chara.length;i++){
            System.out.println("Nama dari index-"+i+" adalah "+name[i]);
        }

        int [] num={45,60,70,9,7,5};
        int jumlah=0;
        for(int i =0; i<num.length; i++){
            if(num[i]%2==1){
                jumlah++;
                System.out.println("nilai ganjil:" +num[i]+" index ke- "+i);
                
                
            }
           
        }
        System.out.println("Angka ganjil : "+jumlah);

        
    }
}