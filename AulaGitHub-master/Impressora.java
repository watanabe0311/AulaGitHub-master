public class Impressora {

    public float exibir(float a) {
        return a;
    }

    public float exibir(float a, float b) {
        return a + b; 
    }

    public float exibir(float a, String b) {
        return a + Integer.parseInt(b);
    }

    public float exibir(String a, float b) {
        return Integer.parseInt(a) + b;
    }

    public int exibir(String a, String b, String c) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n3 = Integer.parseInt(c);

        return n1 + n2 + n3;
    }

    public int exibir(int a, int b, String c) {
        int n1 = Integer.parseInt(c);
        return a + b + n1;
    }


        
    
}
