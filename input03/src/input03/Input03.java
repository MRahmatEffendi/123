package input03;

import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan angka : ");nilai=input.nextInt();
        
        if (nilai %2 == 0){
            System.out.println("adalah bilangan genap");
        }
        else {
            System.out.println("adalah bilangan ganjil");
        }
    }
    
}
