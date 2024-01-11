package projetoBanco;
import java.util.List;
import projetoBanco.contas.Contas;

public class banco{
    String nomeBanco;
    private List<Contas> Contas;


    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public List<Contas> getContas() {
        return Contas;
    }

    public void setContas(List<Contas> contas) {
        Contas = contas;
    }
    
}
