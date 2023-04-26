public class Main {
    public static void main(String[] args) {
        String nomeTime1 = "Uberlândia";
        int golsTime1 = 3;

        String nomeTime2 = "Belo Horizonte";
        int golsTime2 = 0;

        if(golsTime1 > golsTime2){
            System.out.println(nomeTime1);
        } else if (golsTime2 > golsTime1){
            System.out.println(nomeTime2);
        } else System.out.println("EMPATE");

    }
}