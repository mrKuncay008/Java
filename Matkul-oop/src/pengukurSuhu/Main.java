package pengukurSuhu;
import java.util.Scanner;
/**
 *
 * @author kunca
 */
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaPasien;
        double suhuInput, suhuOutput;

        System.out.print("Nama Pasien: ");
        namaPasien = input.nextLine();

        System.out.println("Jenis Pengukuran suhu");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.println("4. Kelvin");
        System.out.print("Pilih Pengukuran suhu: ");
        int jenisPengukuran = input.nextInt();

        System.out.print("Suhu badan: ");
        suhuInput = input.nextDouble();

        switch (jenisPengukuran) {
            case 1:
                System.out.println("Hasil konversi:");
                System.out.println("Fahrenheit: " + celsiusKeFahrenheit(suhuInput));
                System.out.println("Reamur: " + celsiusKeReamur(suhuInput));
                System.out.println("Kelvin: " + celsiusKeKelvin(suhuInput));
                break;
            case 2:
                System.out.println("Hasil konversi:");
                System.out.println("Celcius: " + fahrenheitKeCelsius(suhuInput));
                System.out.println("Reamur: " + fahrenheitKeReamur(suhuInput));
                System.out.println("Kelvin: " + fahrenheitKeKelvin(suhuInput));
                break;
            case 3:
                System.out.println("Hasil konversi:");
                System.out.println("Celcius: " + reamurKeCelsius(suhuInput));
                System.out.println("Fahrenheit: " + reamurKeFahrenheit(suhuInput));
                System.out.println("Kelvin: " + reamurKeKelvin(suhuInput));
                break;
            case 4:
                System.out.println("Hasil konversi:");
                System.out.println("Celcius: " + kelvinKeCelsius(suhuInput));
                System.out.println("Fahrenheit: " + kelvinKeFahrenheit(suhuInput));
                System.out.println("Reamur: " + kelvinKeReamur(suhuInput));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    public static double celsiusKeFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusKeReamur(double celsius) {
        return celsius * 4 / 5;
    }

    public static double celsiusKeKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitKeCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitKeReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }

    public static double fahrenheitKeKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double reamurKeCelsius(double reamur) {
        return reamur * 5 / 4;
    }

    public static double reamurKeFahrenheit(double reamur) {
        return (reamur * 9 / 4) + 32;
    }

    public static double reamurKeKelvin(double reamur) {
        return (reamur * 5 / 4) + 273.15;
    }

    public static double kelvinKeCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinKeFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static double kelvinKeReamur(double kelvin) {
        return (kelvin - 273.15) * 4 / 5;
    }
}


