/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_8Juni2024;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AULIA SYFA
 */
public class BukuDao {
    private List<Buku> data = new ArrayList<>();

    public BukuDao() {
        data.add(new Buku("A001", "Buku A", "Pengarang A", "Penerbit A", "2020"));
        data.add(new Buku("A002", "Buku B", "Pengarang B", "Penerbit B", "2021"));
    }

    public void insert(Buku buku){
        data.add(buku);
    }

    public void update(int index, Buku buku){
        data.set(index, buku);
    }

    public void delete(int index){
        data.remove(index);
    }

    public Buku getBuku(int index){
        return data.get(index);
    }

    public List<Buku> getAll(){
        return data;
    }
}
