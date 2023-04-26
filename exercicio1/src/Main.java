public class Main {
    public static void main(String[] args) {
       float nota1 = 5;
       float nota2 = 10;
       float nota3 = 3;
       float nota4 = 7;
       float media = (nota1+nota2+nota3+nota4)/4;

       if(media < 7){
           System.out.println("Aluno Reprovado");
       } else System.out.println("Aluno Aprovado");
    }
}