public class Conversao {

    public static void main(String args[]){
        String st, st2;
        float real, real2;
        int int1, int2;

        // String para real
        st = "12";
        real = (float) (new Float(st).floatValue());
        System.out.println("String para real " + real);

        // Real para String
        real2 = 10;
        st2 = new Float(real2).toString();
        System.out.println("Real para String " + st2);

        // ou
        st2 = "" + real2;
        System.out.println("Real para String "+st2);

        // String para inteiro
        st2 = "13";
        int1 = Integer.parseInt(st2);
        System.out.println("String para inteiro" + int1);

        // Inteiro para String
        int2 = 5;
        st2 = Integer.toString(int2);
        System.out.println("Inteiro para String" + st2);
    
        Produto.valor1 = 10;
        Produto.valor2 = 20;

        System.out.println("valor 1: "+Produto.valor1);
        System.out.println("valor 2: "+Produto.valor2);

        Produto p = new Produto();
        p.valor3 = 30;
        System.out.println("valor 1: "+p.valor1);
        System.out.println("valor 3: "+p.valor3);


        Produto pr = new Produto();
        pr.valor3 = 35;
        System.out.println("valor 1: "+pr.valor1);
        System.out.println("valor 3: "+pr.valor3);
    }
}
