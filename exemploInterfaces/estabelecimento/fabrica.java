package exemploInterfaces.estabelecimento;

import exemploInterfaces.equipamentos.copiadora.copiadora;
import exemploInterfaces.equipamentos.digitalizadora.digitalizadora;
import exemploInterfaces.equipamentos.impressora.impressora;
import exemploInterfaces.equipamentos.multifuncional.equipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        equipamentoMultifuncional em= new equipamentoMultifuncional();
        impressora impressora= em;
        digitalizadora digitalizadora= em;
        copiadora copiadora= em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
