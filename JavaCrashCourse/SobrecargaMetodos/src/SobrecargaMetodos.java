public class SobrecargaMetodos {
    public static void main(String[] args){
        System.out.println(Operaciones.sumar(2, 3));
        System.out.println(Operaciones.sumar(2, 3.1));
        System.out.println(Operaciones.sumar(2.0, 3));
        System.out.println(Operaciones.sumar(2.1, 3.1));

        System.out.println(Operaciones.sumar(2, 3L));
        System.out.println(Operaciones.sumar(2F, 3));
        System.out.println(Operaciones.sumar(2F, 'a'));
    }
}

/*
                      char
                       |
                       |
                       v
 byte ---> short ---> int   ---> long
                    |   \     /   |
                    |    \   /    |
                    |     \ /     |
                    |      .      |
                    |     / \     |
                    |    /   \    |
                    v  </     \>  v
                    float ---> double
 */