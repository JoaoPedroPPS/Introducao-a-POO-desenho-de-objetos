package geometria;

public class triangulo {
	private double base;
	private double altura;
	private double meio;
	
	public void setLados(double base, double altura) {
		if(base > 0 && altura >0) {
			this.base =  base;
			this.altura = altura;
			
			
		}
		meio = base / 2;
		
	}
	public float calculoArea() {
		float area;
		area = (float) ((base * altura ) / 2);
		return area;
		
	}
	public void desenho(){
		
		for (int i = 0; i < base; i++) {
			System.out.print(". ");
	}
		for (int x=0; x<meio;x++) {
			for (int i = x; i < base; i++) {
				System.out.print(". ");
		}
}
	}
}
