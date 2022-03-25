package geometria;

public class Circulo {
        private double raio;
        private double pi = 3.1416;
        
        public void setRaio(double raio){
                if(raio > 0){
                        this.raio = raio;
                }
        }
        public double calculoArea() {
                double area;
                area = pi * raio * raio;
                return area;
        }
        
}
