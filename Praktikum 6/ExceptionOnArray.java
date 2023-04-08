
/*
 * File		: AngkaSial.java/24/Maret/2023
 * Penulis	: Mustafa Iswardana/24060121149117
 * Deskripsi	: Program penggunaan eksepsi menggunakan class library Java
*/




public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
}