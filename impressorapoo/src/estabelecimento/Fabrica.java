package estabelecimento;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.LaserJet;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
	
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
