package NivelIntermediario.DesafioLinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        listaNinjas.add(new Ninja("Naruto Uzumaki", "Konohagakure", 17));
        listaNinjas.add(new Ninja("Sasuke Uchiha", "Konohagakure", 18));
        listaNinjas.add(new Ninja("Sakura Haruno", "Konohagakure", 18));
        listaNinjas.add(new Ninja("Gaara do deserto", "Sunagakure", 19));
        listaNinjas.add(new Ninja("Temari Nara", "Sunagakure", 18));
        listaNinjas.add(new Ninja("Killer B", "Kumogakure", 28));
        listaNinjas.add(new Ninja("Deidara", "Iwagakure", 26));



        while (contador != 7){
            System.out.println("================= Menu LinkedList =================");
            System.out.println("Escolha uma opção abaixo para prosseguir:");
            System.out.println("1. Remover o primeiro ninja da lista");
            System.out.println("2. Adicionar um novo ninja ao inicio da lista");
            System.out.println("3. Exibir lista completa");
            System.out.println("4. Exibir um ninja específico");
            System.out.println("5. Ordenar a lista");
            System.out.println("6. Buscar ninja por nome");
            System.out.println("7. Sair");

            contador = sc.nextInt();
            sc.nextLine();

            switch (contador){
                case 1 -> {
                    if (!listaNinjas.isEmpty()){
                        listaNinjas.removeFirst();
                        System.out.println("Ninja removido com sucesso!!");
                    } else {
                        System.out.println("A lista está vazia!");
                    }
                }

                case 2 -> {
                    System.out.print("Insira o nome do ninja: ");
                    String nome = sc.nextLine();
                    System.out.print("Insira a aldeia do ninja: ");
                    String aldeia = sc.nextLine();
                    System.out.print("Insira a idade do ninja: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    listaNinjas.addFirst(new Ninja(nome, aldeia, idade));
                    System.out.println("Ninja adicionado com sucesso!!");

                }

                case 3 -> {
                    System.out.println("Exibindo nijas da lista: ");
                    NinjaUtils.imprimirLista(listaNinjas);
                }


                case 4 -> {
                    boolean posicaoValida = false;
                    System.out.println("Digite a posição do ninja que deseja ver mais informações:");

                    while (posicaoValida != true){
                        int index = sc.nextInt();
                        sc.nextLine();
                        if (index<1 || index >listaNinjas.size()){
                            System.out.println("Posição inválida, tente novamente!");
                        } else {
                            System.out.println(listaNinjas.get(index-1));
                            posicaoValida = true;
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Como deseja ordenar sua lista?");
                    System.out.println("1. Por nome");
                    System.out.println("2. Por aldeia");
                    System.out.println("3. Por idade");
                    boolean opcaoValida = false;
                    while (opcaoValida != true){
                        int opcaoEscolhida = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoEscolhida) {
                            case 1 -> {
                                Collections.sort(listaNinjas, Comparator.comparing(Ninja::getNome));
                                NinjaUtils.imprimirLista(listaNinjas);
                                opcaoValida = true;
                            }
                            case 2 -> {
                                Collections.sort(listaNinjas, Comparator.comparing(Ninja::getVila));
                                NinjaUtils.imprimirLista(listaNinjas);
                                opcaoValida = true;
                            }
                            case 3 -> {
                                Collections.sort(listaNinjas, Comparator.comparingInt(Ninja::getIdade));
                                NinjaUtils.imprimirLista(listaNinjas);
                                opcaoValida = true;
                            }
                            default -> System.out.println("Por favor, escolha uma das opções apresentadas!");
                        }
                    }
                }


                case 6 -> {
                    System.out.print("Digite o nome do ninja que deseja buscar: ");
                    String busca = sc.nextLine().toLowerCase();
                    boolean econtrado = false;
                    for (Ninja n: listaNinjas){
                        if (n.getNome().toLowerCase().contains(busca)){
                            System.out.println("Resultado encontrado: " + n);
                            econtrado = true;
                        }
                    }
                    if (!econtrado){
                        System.out.println("Nenhum ninja encontrado com esse nome!");
                    }
                }

                case 7 -> {
                    System.out.println("Encerrando programa...");
                }

                default ->
                    System.out.println("Por favor, escolha uma das opções apresentadas!");
            }
        }
        sc.close();
    }
}
