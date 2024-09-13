import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNome("Gustavo");
        cliente.setMatricula(2069);

        Computador computador1 = new Computador("Positivo", cliente.getMatricula(), new SistemaOperacional("Sistema Operacional Linux Ubuntu (32 bits)"));
        Computador computador2 = new Computador("Acer", cliente.getMatricula() + 1234, new SistemaOperacional("Sistema Operacional Windows 8 (64 bits)"));
        Computador computador3 = new Computador("Vaio", cliente.getMatricula() + 5678, new SistemaOperacional("Sistema Operacional Windows 10 (64 bits)"));

        computador1.setPreco(cliente.getMatricula());
        computador2.setPreco(cliente.getMatricula() + 1234);
        computador3.setPreco(cliente.getMatricula() + 5678);

        computador1.setHardware(new HardwareBasico("Positivo", 500, "Pentium core i3 2200 Mhz", 8));
        computador2.setHardware(new HardwareBasico("Acer", 1000, "Pentium core i5 3370 Mhz", 16));
        computador3.setHardware(new HardwareBasico("Vaio", 2000, "Pentium core i7 4500 Mhz", 32));

        computador1.setMusb(new MemoriaUSB("16 GB"));
        computador2.setMusb(new MemoriaUSB("32 GB"));
        computador3.setMusb(new MemoriaUSB("1 Tera"));

        System.out.println(" ");
        System.out.println("Olá, seja bem-vindo à loja PC Mania!!");
        System.out.println("Aqui estamos com 3 promoções imperdíveis, senhor. Vou lhe apresentar:");

        System.out.println(" ");
        computador1.mostraPCconfigs();
        System.out.println(" ");
        computador2.mostraPCconfigs();
        System.out.println(" ");
        computador3.mostraPCconfigs();
        System.out.println(" ");

        int[] contador = new int[3];
        int i = 0;
        int continua;
        float total = 0;
        System.out.println("Qual deles você deseja escolher? Lembrando que você pode comprar mais de um kkkk");

        while (i < 3) {
            System.out.print("Escolha uma opção (1, 2, 3): ");
            contador[i] = input.nextInt();

            if (contador[i] < 1 || contador[i] > 3) {
                System.out.println("Essa opção não é válida, escolha de novo.");
                continue;
            }

            System.out.print("Deseja continuar? 1 para sim, 2 para não: ");
            continua = input.nextInt();
            if (continua == 2) {
                break;
            }
            i++;
        }

        for (int j = 0; j < i; j++) {
            if (contador[j] == 1) {
                total += computador1.getPreco();
            } else if (contador[j] == 2) {
                total += computador2.getPreco();
            } else if (contador[j] == 3) {
                total += computador3.getPreco();
            }
        }

        System.out.println("O total deu: " + total + " Reais.");
        input.close();
    }
}
