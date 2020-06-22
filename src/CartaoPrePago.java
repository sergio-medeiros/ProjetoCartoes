
public class CartaoPrePago {
	protected String ncartao;
	protected String ntitutlar;
	protected int vano;
	protected int vmes;
	protected double saldo;
	
	public CartaoPrePago(String ncartao, String ntitutlar, int vano, int vmes, double saldo) {
		super();
		this.ncartao = ncartao;
		this.ntitutlar = ntitutlar;
		this.vano = vano;
		this.vmes = vmes;
		this.saldo = saldo;
	}

	public String getncartao() {
		return ncartao;
	}

	public void setncartao(String ncartao) {
		this.ncartao = ncartao;
	}

	public String getntitutlar() {
		return ntitutlar;
	}

	public void setntitutlar(String ntitutlar) {
		this.ntitutlar = ntitutlar;
	}

	public int getvano() {
		return vano;
	}

	public void setvano(int vano) {
		this.vano = vano;
	}

	public int getvmes() {
		return vmes;
	}

	public void setvmes(int vmes) {
		this.vmes = vmes;
	}

	public double getsaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "CartaoPrePago [NCartao=" + ncartao + ", NTitutlar=" + ntitutlar + ", VAno=" + vano + ", Vmes=" + vmes
				+ ", Saldo=" + saldo + "]";
	}
	
	public void adicionarcredito(double valor) {
		saldo = valor + saldo;
		//return true;
	}
	public boolean comprar (double valor) {
		if( valor < saldo) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
