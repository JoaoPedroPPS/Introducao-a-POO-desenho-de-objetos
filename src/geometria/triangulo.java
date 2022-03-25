package geometria;

public class triangulo {
        private double base;
        private double altura;
        
        public void setLados(double base, double altura) {
                if(base > 0 && altura >0) {
                        this.base =  base;
                        this.altura = altura;                
                }
                
        }
        public float calculoArea() {
                float area;
                area = (float) ((base * altura ) / 2);
                return area;
                
        }
        public void desenho(){
                
                for(int i=0;i<base+1;i++){
                        for(int j=0;j<i;j++){
                                System.out.print(". ");
                           }
                System.out.println("");
}
        
        
          
}
        
}
