public class HardwareBasico {
    private String marca;
    private float capacidade;
    private String processador;
    private int ram;

    // Constructor
    public HardwareBasico(String marca, float capacidade, String processador, int ram) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.processador = processador;
        this.ram = ram;
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getProcessador() {
        return processador;
    }

    // Corrected setProcessador method
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    }

