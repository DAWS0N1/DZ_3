package Sweets;

import java.util.ArrayList;

public class SweetBox implements forSweets{
    private ArrayList<Sweets> sweetBox = new ArrayList<Sweets>();

    public ArrayList<Sweets> getSweetBox() {
        return sweetBox;
    }


    public void add(Sweets s) {
        sweetBox.add(s);
    }

    public void del() {
        sweetBox.remove(sweetBox.size()-1);
    }

    public float genWeight() {
        float w = 0;
        for (int i = 0; i < sweetBox.size(); i++) {
            w += sweetBox.get(i).weight;
        }
        return w;
    }

    public float genPrice() {
        float p = 0;
        for (int i = 0; i < sweetBox.size(); i++) {
            p += sweetBox.get(i).price;
        }
        return p;
    }

    public String genInfo() {
        String info = "Информация: \n";
        for (int i = 0; i < sweetBox.size(); i++) {
            info += sweetBox.get(i).getInfo();
        }
        return info;
    }

    public void maxWeight(float max) {
        while (this.genWeight() > max)
            this.optimization();
    }

    //Создает массив десятичных чисел из стоимости за 1 кг каждой сладости из коробки и удаляет наименьший из коробки
    public void optimization() {
        float[] newarray = new float[sweetBox.size()];
        float minValue = newarray[0];
        int minIndex = 0;
        for (int i = 0; i < sweetBox.size(); i++) {
            newarray[i] = sweetBox.get(i).price/sweetBox.get(i).weight;
        }
        for (int i = 1; i < newarray.length; i++) {
            if (newarray[i] < minValue) {
                minValue = newarray[i];
                minIndex = i;
            }
        }
        sweetBox.remove(minIndex);
    }
}
