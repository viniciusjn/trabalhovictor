public class Endereco {
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String uf;
    
    
    
    public Endereco(String cep, String logradouro, Integer numero, String complemento, String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }

    public void imprimir() {
        System.out.println("Endereco: ");
        System.out.println(" - Logradouro: " + logradouro);
        System.out.println(" - Numero: " + numero);
        System.out.println(" - Complemento: " + complemento);
        System.out.println(" - Cidade: " + cidade);
        System.out.println(" - Unidade Federal: " + uf);
        System.out.println(" - Cep: " + cep);
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
}