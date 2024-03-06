
public class CalculadoraTest {

    public static void main(String[] args) {
       Calculadora calc = new Calculadora();
       

        //Cenário de teste  1: Soma de dois valores
        double soma = calc.somar(1, 3);
        System.out.println(soma);
        
        
        
        //Cenário de teste  2: Soma de dois valores sendo um zero
        soma = calc.somar(1, 0);
        System.out.println(soma);
        
        
        
        
        //Cenário de teste  3: Soma de dois valores sendo que ambos são zero
        soma = calc.somar(0, 0);
        System.out.println(soma);
        
        
        
        
        //Cenário de teste  4: Soma de dois valores sendo um negativo
        soma = calc.somar(1, -3);
        System.out.println(soma);
        
        
        
        //Cenário de teste  5: Soma de dois valores sendo um número quebrado
        soma = calc.somar(1, 3.3);
        System.out.println(soma);
        
        //Cenário de teste  6: Soma de dois valores sendo ambos números quebrados
        soma = calc.somar(1.2, 3.3);
        System.out.println(soma);
        
        
        //Cenário de teste  7: Multiplicação de dois valores
        double mult = calc.multiplicar(1,3);
        System.out.println(mult);
        
        //Cenário de teste  8: Multiplicação de dois valores sendo um zero
        mult = calc.multiplicar(0,30);
        System.out.println(mult);
        
        
        //Cenário de teste  9: Multiplicação de dois valores sendo que ambos são zero
        mult = calc.multiplicar(0,0);
        System.out.println(mult);
        
        
        
        //Cenário de teste  10: Multiplicação de dois valores sendo um negativo
        mult = calc.multiplicar(10,-5);
        System.out.println(mult);
        
        
        
        
        //Cenário de teste  11: Multiplicação de dois valores sendo que ambos são negativos
        mult = calc.multiplicar(-20,-2);
        System.out.println(mult);
        
        
        
        //Cenário de teste  12: Multiplicação de dois valores sendo um número quebrado
        mult = calc.multiplicar(3,2.5);
        System.out.println(mult);
        
        
        //Cenário de teste  13: Multiplicação de dois valores sendo que ambos são números quebrados
        mult = calc.multiplicar(2.5,1.5);
        System.out.println(mult);
      
       
        //Cenário de teste  14: Subtração de dois valores
        double sub = calc.subtrair(5, 3);
        System.out.println(sub);
        
        
        
        //Cenário de teste  15: Subtração de dois valores sendo um zero
        sub = calc.subtrair(0, 3);
        System.out.println(sub);
        
        
        
        
        //Cenário de teste  16: Subtração de dois valores sendo que ambos são zero
        sub = calc.subtrair(0, 0);
        System.out.println(sub);
        
        
        
        
        //Cenário de teste  17: Subtração de dois valores sendo um negativo
        sub = calc.subtrair(10, -3);
        System.out.println(sub);
        
        
        
        //Cenário de teste  18: Subtração de dois valores sendo um número quebrado
        sub = calc.subtrair(1.5, 1);
        System.out.println(sub);
        
        //Cenário de teste  19: Subtração de dois valores sendo ambos números quebrados
        sub = calc.subtrair(5.5, 1.4);
        System.out.println(sub);
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Cenário de teste  1: Divisão de dois valores
        double div = calc.dividir(10, 2);
        System.out.println(div);
        
        
        
        //Cenário de teste  2: Divisão de dois valores sendo um zero
        div = calc.dividir(1, 0);
        System.out.println(div);
        
        
        
        
        //Cenário de teste  3: Divisão de dois valores sendo que ambos são zero
        div = calc.dividir(0, 0);
        System.out.println(div);
        
        
        
        
        //Cenário de teste  4: Divisão de dois valores sendo um negativo
        div = calc.dividir(-12, 4);
        System.out.println(div);
        
        
        
        //Cenário de teste  5: Divisão de dois valores sendo um número quebrado
        div = calc.dividir(2.5, 2);
        System.out.println(div);
        
        //Cenário de teste  6: Divisão de dois valores sendo ambos números quebrados
        div = calc.dividir(7.5, 2.5);
        System.out.println(div);
        
        
        
    }
    
}
