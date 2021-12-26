package Sesi11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rini Melani R
 */
public class JavaException {

    public static void main(String[] args) {
        try{
            // pernyataan yang berpotensi mengakibatkan Exception
           String[] siswa = new String[2];
           siswa[0] = "Rini";
           siswa[1] = "Intan";
           siswa[2] = "Rosma";
           System.out.println(siswa[4]);
        }catch(ArrayIndexOutOfBoundsException ex){
            // pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }
        Scanner input = new Scanner(System.in);
        boolean lanjut=true;
       
        do {            
            try {
                System.out.println("Masukan bilangan :");
                int bil = input.nextInt();      
                System.out.println("Bilangan yang dimasukan adalah :"+bil);
                lanjut=false;
            } catch (InputMismatchException ex) {
                System.err.println("Coba kembali ! (Input valid : bilangan diperlukan.)");
                input.nextLine();
            }
            
        } while (lanjut);
    }
    
}
