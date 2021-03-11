import entities.Aluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Aluno> set = new HashSet<>();

        System.out.print("Quantos estudantes no curso A ?   ");
        Integer n = scanner.nextInt();

        for (int i = 1; i <= n;i++){
            Integer codigoAluno = scanner.nextInt();
            set.add(new Aluno(codigoAluno));
        }

        System.out.print("Quantos estudantes no curso B ?   ");
        Integer n1 = scanner.nextInt();

        for (int i = 1; i <= n1;i++){
            Integer codigoAluno = scanner.nextInt();
            set.add(new Aluno(codigoAluno));
        }

        System.out.print("Quantos estudantes no curso C ?   ");
        Integer n2 = scanner.nextInt();

        for (int i = 1; i <= n2;i++){
            Integer codigoAluno = scanner.nextInt();
            set.add(new Aluno(codigoAluno));
        }

        System.out.println("Total " + set.size());





    }
}
