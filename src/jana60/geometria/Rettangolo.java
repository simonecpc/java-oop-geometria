package jana60.geometria;

public class Rettangolo {

	int base;
	int altezza;
	
	int perimetro() {
		int x = base * 2 + altezza * 2;
		return x;
	}
	
	int area () {
		int y = base * altezza;
		return y;
	}
	
}
