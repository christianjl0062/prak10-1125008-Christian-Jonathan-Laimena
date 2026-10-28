package prak10.christian.jonathan.laimena.models;

import java.util.ArrayList;

public class BelajarPBOList<T> extends ArrayList<T> {
    public void printList() {
        System.out.print("[");
        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.get(i).toString());
            if (i < this.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printListSorted() {
        ArrayList<T> newListPBO = new ArrayList<T>();
        for (int i = 0; i < this.size(); i++) {
            newListPBO.add(this.get(i));
        }

        for (int i = 0; i < newListPBO.size() - 1; i++) {
            for (int j = 0; j < newListPBO.size() - i - 1; j++) {
                int nilaiKiri = Integer.parseInt(newListPBO.get(j).toString());
                int nilaiKanan = Integer.parseInt(newListPBO.get(j + 1).toString());
                
                if (nilaiKiri > nilaiKanan) {
                    T temp = newListPBO.get(j);
                    newListPBO.set(j, newListPBO.get(j + 1));
                    newListPBO.set(j + 1, temp);
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < newListPBO.size(); i++) {
            System.out.print(newListPBO.get(i).toString());
            if (i < newListPBO.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
