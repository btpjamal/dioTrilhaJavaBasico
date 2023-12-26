package exemploInterfaces.equipamentos.multifuncional;

import exemploInterfaces.equipamentos.copiadora.copiadora;
import exemploInterfaces.equipamentos.digitalizadora.digitalizadora;
import exemploInterfaces.equipamentos.impressora.impressora;

public class equipamentoMultifuncional implements copiadora,digitalizadora,impressora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
   
}
