package prak10.christian.jonathan.laimena.models;

// bingung mau pake tanda yang mana buat dijadiin generic, jadinya saya pake yang T.
public class Box<T> implements Printable {
    private T barang;

    public Box(T barang) {
        this.barang = barang;
    }

    public T getBarang() {
        return barang;
    }

    public void setBarang(T barang) {
        this.barang = barang;
    }

    @Override
    public String getPrintDetail() {
        return "Barang Di Dalam Box : " + barang.toString();
    }

    @Override 
    public String toString() {
        return barang.toString();
    }
}
