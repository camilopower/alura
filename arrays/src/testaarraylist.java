import  java.util.ArrayList;

public class testaarraylist {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("java");
        nomes.add("ruby");

        System.out.println(nomes.contains("java"));
        System.out.println(nomes.contains("c#"));

        boolean removido = nomes.remove("java");

        System.out.println(removido);
        System.out.println(nomes.contains("java"));

        System.out.println(nomes.size());

        Object[] objetos = nomes.toArray();


        String[] nomesArray = nomes.toArray(new String[nomes.size()]);
        String[] nomesArray2 = nomes.toArray(new String[nomes.size()]);


        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("coreia");

        ArrayList<String> tudo = new ArrayList<>();

        tudo.addAll(nomes);
        tudo.addAll(paises);

        System.out.println(tudo.size());

        System.out.println(nomes.get(0));

         }
}
