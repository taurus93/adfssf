package entities;

import javax.persistence.*;

/**
 * Created by TungLeThanh on 16/06/2017.
 */
@Entity
@Table(name = "sinhvienk60", schema = "sinhvien", catalog = "")
public class Sinhvienk60Entity {
    private int mssv;
    private String ho;
    private String ten;
    private int diemthi;

    @Id
    @Column(name = "mssv")
    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    @Basic
    @Column(name = "ho")
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    @Basic
    @Column(name = "ten")
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "diemthi")
    public int getDiemthi() {
        return diemthi;
    }

    public void setDiemthi(int diemthi) {
        this.diemthi = diemthi;
    }

    @Override
    public boolean equals(Object o) {
      return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
