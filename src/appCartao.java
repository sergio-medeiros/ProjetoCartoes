
public class appCartao{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
	
		CartaoPrePago c1, c2;
		c1 = new CartaoPrePago("1234", "Sergio", 2027, 04, 1000);
		c2 = new CartaoCashBack("5678", "Mario", 2028, 05, 1000,1);
	
		c1.comprar(900);
		c2.comprar(100);
	
		System.out.println(c1);
		System.out.println(c2);
	}

}
