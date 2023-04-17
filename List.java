import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("like you do");
        listaParaIlhaDeserta.add("TICK TOCK");
        listaParaIlhaDeserta.add("die for you");
        listaParaIlhaDeserta.add("glimps of us");
        listaParaIlhaDeserta.add("Window");
        listaParaIlhaDeserta.add("gimmy love");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove("Window");
        System.out.println(listaParaIlhaDeserta);

        listaParaIlhaDeserta.remove(1);
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());

        int indexA= 3;
        int indexB= 0;

        String temp = listaParaIlhaDeserta.get(indexA);
        listaParaIlhaDeserta.set(3, listaParaIlhaDeserta.get(indexB));
        listaParaIlhaDeserta.set(indexB, temp);
        System.out.println(listaParaIlhaDeserta);



    }

}
