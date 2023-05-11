package pengguna;

 public class Mhs {

    private String nama ;
    private String nim ;
    private int smt ;
    
    public Mhs (String nama, String nim, int smt) {
        this.nama = nama ;
        this.nim = nim ;
        this.smt = smt ;
    }
   
    public void setNama(String nama){
            this.nama = nama ;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return this.nim;
    }
    public void setSmt(int smt){
        this.smt = smt;
    }
    public int getSmt(){
        return this.smt;
    }

}
