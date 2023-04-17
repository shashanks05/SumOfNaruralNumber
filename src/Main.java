import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sr.nextInt();
        SNatural n = new SNatural();
        System.out.println(n.SNatural(a));
    }
}
class SNatural {
    public int SNatural(int num){
        if(num == 1){
            return num;
        }else{
            return num * SNatural(num-1);
        }
    }
}

