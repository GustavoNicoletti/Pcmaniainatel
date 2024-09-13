public class Cliente {
    String nome;
    private int matricula;
    private long cpf;
    private float totalCompra;

    public Cliente() {
        this.nome = nome;
    }

    public float calculaTotalCompra(float valorCompra) {
        this.totalCompra += valorCompra;
        return this.totalCompra;
    }


    public int getMatricula() {
        return matricula;
    }

    public int setMatricula(int matricula) {
        return this.matricula = matricula;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}
