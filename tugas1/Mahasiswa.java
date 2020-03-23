public class Mahasiswa {
    // field/ atribut/ properties/ variabel

    String nim;
    String nama;
    String kelas; // 3 atribut kelas


    public Mahasiswa() {
        nama = "Rina Listiana";
        nim = "18090090";
        kelas = "4B";

    }
    

    // method / fungsi / prosedur 
    public String info() {
        return nim + ":" + nama + ":" + kelas;    
    }
    

}