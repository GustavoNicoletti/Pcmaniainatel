public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB musb;
    private SistemaOperacional sistema;
    private HardwareBasico hardware;

    // Construtor
    public Computador(String marca, float preco, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.musb = null; // Inicializando como null
        this.hardware = null; // Inicializando como null
    }

    // Método para mostrar as configurações do PC
    void mostraPCconfigs() {
        System.out.println("Marca do PC é: " + marca);
        System.out.println("O preço do PC é: " + preco + " Reais");
        System.out.println("O PC possui: " + musb.getNome() + " de memória USB");
        System.out.println("O sistema operacional do PC é: " + sistema.getNome());
        System.out.println("O hardware do PC é: " + hardware.getProcessador() + " com " + hardware.getRam() + "GB de RAM");
    }


    // Método para adicionar Memória USB
    void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public MemoriaUSB getMusb() {
        return musb;
    }

    public void setMusb(MemoriaUSB musb) {
        this.musb = musb; // Corrigido para aceitar MemoriaUSB
    }

    public SistemaOperacional getSistema() {
        return sistema; // Corrigido para não ter parâmetros
    }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public HardwareBasico getHardware() {
        return hardware;
    }

    public void setHardware(HardwareBasico hardware) {
        this.hardware = hardware; // Método para definir o hardware
    }
}
