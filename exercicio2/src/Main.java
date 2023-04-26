public class Main {
    public static void main(String[] args) {
        double peso = 50.0;
        double altura = 1.60;
        double imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.println("Magreza");
        } else if((imc >= 18.5) && (imc <= 24.9)){
            System.out.println("Normal");
        } else if((imc >= 25.0) && (imc <= 29.9)){
            System.out.println("Sobrepeso");
        } else if((imc >= 30.0) && (imc <= 39.9)){
            System.out.println("Obesidade");
        } else System.out.println("Obsidade Grave");

    }
}