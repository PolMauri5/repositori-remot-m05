package com.polmauri.method;

public class m05practica {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Canvi pol");
        System.out.println("Canvi pol 2");
        System.out.println("Canvi pol 3");

    }














    public static void carlaFlores() {
        System.out.println("Frase de prova");
        System.out.println("Commit 2");
        System.out.println("Commit 3");
    }



    /**
     * Crea un Menu a través d'un String "picat a pedra" i retorna un boolean  <br>
     * Utilitza String equals per saber la resposta
     * @return Retora un true o un false depenent del input
     */
    private static boolean MenuBoolVerif (){
        Scanner llegir = new Scanner(System.in);
        boolean esAfirmatiu = true;
        boolean valorsIntroduitsLegals;


        System.out.println("Canvi 1");
        System.out.println("Canvi 2");
        System.out.println("""
                 Vols comprar un altre billet?\s
                     ╔══════╗   ╔══════╗  \s
                     ║  Si  ║   ║  No  ║  \s
                     ╚══════╝   ╚══════╝  \s
                Seleciona una opcio: \s""");

        String resposta = llegir.next();
        do {
            valorsIntroduitsLegals = true;
            llegir.nextLine();
            if (resposta.equalsIgnoreCase("SI")){
                esAfirmatiu = true;

            } else if (resposta.equalsIgnoreCase("NO")) {
                esAfirmatiu = false;

            } else {
                valorsIntroduitsLegals = VarInvalid(); // Donara misatge de error i convertira el boolean en false
            }
        }while (!valorsIntroduitsLegals);
        return esAfirmatiu;
    }
}

