public class Main {
    public static void main(String[] args) {
        ContaInteiros conta = new ContaInteiros();
        int[] data = {(int) 1.2, 3, (int) 4.5, 5, 6};
        int count = ContaInteiros.conta(4, data);
        System.out.println(count);
    }
}
