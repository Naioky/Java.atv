package src.br.com.POO.upcastdowncast.motheri;

public class Workapp {

    public static void main(String[] args) {
        mother[] classes = new mother[] { new dau(), new dau2(), new mother() };

        for (mother classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (mother classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        dau2 dau2 = new dau2();
        dau2.metodo2();
    }

}
