public class CsrIf{

    public static void main(String[] args) {
        
    int a=65;
    if(a>80){
        System.out.println("nilai anda A");
    }
    else if(a>=70 && a<80 ){
        System.out.println("coba lagi");
    }
    else if(a>=60 && a<70){
        System.out.println("baliklah");
    }
    int b=89;

    switch(b){
        case 90:
        System.out.println("good");
        break;
        default:
        System.out.println("woy");
    }
    int c =0;

        if(c==0){
        System.out.println("tak hingga");
        }
        else if(c%2==1){
        System.out.println("bilangan ganjil");
        }
        else{
            System.out.println("bilangan genap");
        }
        


    }

    

    
}