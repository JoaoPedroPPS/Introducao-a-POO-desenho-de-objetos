package geometrica;

public class Main {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                // TODO Auto-generated method stub
                                // Teste da classe Quadrado
                                Quadrado primeiroQuadrado = new Quadrado();
                                primeiroQuadrado.setLado(12);
                                
                                double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
                                System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
                                
                                System.out.println("Desenho quadrado: ");
                                primeiroQuadrado.desenhar();
                                
                                //retangulo
                                Retangulo primeiroRetangulo = new Retangulo();
                                primeiroRetangulo.setLado(15, 10);
                                double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
                                System.out.println("Area quadrado: " + areaPrimeiroRetangulo);
                                System.out.println("Desenho Retangulo: ");
                                primeiroRetangulo.desenhar();
                                
                                //circulo
                                Circulo circulo = new Circulo();
                                circulo.setRaio(25);
                                double areaCirculo = circulo.calculoArea();
                                System.out.println("Area circulo: " + areaCirculo);
                                System.out.println("Desenho Retangulo: ");
                                
                                //TRIANGULO
                                
                                triangulo Triangulo = new triangulo();
                                Triangulo.setLados(10, 15);
                                System.out.println("A area triangulo: " + Triangulo.calculoArea());
                                System.out.println("O desenho do triangulo é: ");
                                Triangulo.desenho();
                        }
        }
