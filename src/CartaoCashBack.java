
public class CartaoCashBack extends CartaoPrePago{
	private int tipo;

	public CartaoCashBack(String ncartao, String ntitutlar, int vano, int vmes, double saldo,int tipo) {
		super(ncartao, ntitutlar,vano, vmes, saldo);
		this.tipo = tipo;
	}

	public int gettipo() {
		return tipo;
	}

	public void settipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if( valor <= super.saldo) {
			super.saldo =super.saldo -  valor;
			if(tipo == 1) {
				super.saldo = super.saldo + (valor * 0.2);
			}
			else if(tipo == 2) {
				super.saldo = super.saldo + (valor * 0.5);
			}
			else if(tipo == 3) {
				super.saldo = super.saldo +( valor * 0.8);
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "CartaoCashBack [ncartao=" + ncartao + ", ntitutlar=" + ntitutlar + ", vano=" + vano
				+ ", vmes=" + vmes + ", saldo=" + saldo +", tipo=" + tipo+" ]";
	}


	
}

