import java.util.Scanner;
public class utsDaspro24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double hargaBrg, total= 0, hrgMinuman, totalMinuman= 0.0, hrgMakanan, totalMakanan= 0.0, subTotalMinuman= 0.0, disc= 0.0, ppn= 0.0, tnpDisc= 0.0, subTotal;
        String jenisBarang, nmBarang, plastik;
        boolean selesai= false, valid= false, makanan= false, minuman= false, plastikk= false;
        int jmlMinuman= 0, jmlMakanan= 0;
        
        System.out.println("\n===== Program Kasir =====");
        while(!selesai){
            while(!valid){
            System.out.print("\nMasukkan jenis barang (Makanan/Minuman): ");
            jenisBarang= sc.next();
            if(jenisBarang.equalsIgnoreCase("makanan")){
                makanan= true;
                jmlMakanan++;
                break;
            } else if(jenisBarang.equalsIgnoreCase("minuman")){
                minuman= true;
                jmlMinuman++;
                break;
            } else{
                System.out.println("Jenis barang yang anda masukkan tidak valid.");
            }
            makanan= false; minuman= false;
        }
            System.out.print("Masukkan nama barang: ");
            nmBarang= sc.next();
            if(makanan){
            System.out.print("Masukkan harga barang: ");
            totalMakanan+= sc.nextInt();
            } else if(minuman){
            System.out.print("Masukkan harga barang: ");
            totalMinuman+= sc.nextInt();
            }
            System.out.print("Apakah masih ada belanjaan lainnya? (y/n): ");
            String next= sc.next();
            if(next.equalsIgnoreCase("n")){
                selesai= true;
            } else if(next.equalsIgnoreCase("y")){
                continue;
            } else{
                System.out.println("Masukan anda tidak valid.");
            }
        }
        tnpDisc= totalMakanan + totalMinuman;
        if(jmlMinuman >= 3){
            totalMinuman = totalMinuman - (totalMinuman * 0.05);
            disc= 0.05;
        } 
        total= totalMakanan + totalMinuman;
        while(!plastikk){
        System.out.print("Apakah anda ingin beli kantong plastik? (y/n): ");
        plastik= sc.next();
        if(plastik.equalsIgnoreCase("y")){
            total= total + 200;
            plastikk= true;
        } else if(plastik.equalsIgnoreCase("n")){
            plastikk= true;
        } else{
            System.out.println("Masukan anda tidak valid.");
        }
    }
        if(total >= 1000000){
            subTotal= total + (total * 0.07);
            ppn=0.07;
        }
        subTotal= total;
        System.out.println("\n===== Terima Kasih =====");
        System.out.println("Jumlah Makanan yang anda beli       : "+jmlMakanan+ " buah");
        System.out.println("Jumlah minuman yang anda beli       : "+jmlMinuman+ " buah");
        System.out.println("Total harga belanjaan anda          : Rp. "+subTotal);
        System.out.println("Anda telah hemat                    : Rp. " +tnpDisc*disc);
        System.out.println("PPN                                 : Rp. "+subTotal*ppn);
    }
}