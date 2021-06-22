import java.util.Date;

public class Kasir {
    private int id;
    private String kode;
    private String namalengkap;
    private String namapanggilan;
    private Date tanggallahir;
    private String jabatan;
    private int lamabekerja;
    private String pendidikanterakhir;

    public Kasir(int id, String kode, String namalengkap, String namapanggilan, Date tanggallahir, String jabatan, int lamabekerja, String pendidikanterakhir) {

        this.id = id;
        this.kode = kode;
        this.namalengkap = namalengkap;
        this.namapanggilan = namapanggilan;
        this.tanggallahir = tanggallahir;
        this.jabatan = jabatan;
        this.lamabekerja = lamabekerja;
        this.pendidikanterakhir = pendidikanterakhir;

        public  void  shiftkerja() {
            System.out.println("dari jam berapa sampai berapa");
    }
        public void bekerja(){
            System.out.println("untuk memenuhi kebutuhan");
        }
        public void vimi (){
            System.out.println("ramah terhadap pembeli");
        }


}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getNamapanggilan() {
        return namapanggilan;
    }

    public void setNamapanggilan(String namapanggilan) {
        this.namapanggilan = namapanggilan;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getLamabekerja() {
        return lamabekerja;
    }

    public void setBekerjadaritahun(int bekerjadaritahun) {
        this.bekerjadaritahun = bekerjadaritahun;
    }

    public String getPendidikanterakhir() {
        return pendidikanterakhir;
    }

    public void setPendidikanterakhir(String pendidikanterakhir) {
        this.pendidikanterakhir = pendidikanterakhir;
    }
