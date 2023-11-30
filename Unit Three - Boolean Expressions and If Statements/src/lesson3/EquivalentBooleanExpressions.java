package lesson3;
public class EquivalentBooleanExpressions {
    public static void main(String[] args) {
        int quant = 20;

        int unitPrice = 4;
        
        int ship = 8;
        
        int total;
        
        if (quant > 10)
        
        {
        
        unitPrice = 3;
        
        }
        
        if (quant > 20)
        
        {
        
        ship = 0;
        
        }
        
        total = quant * unitPrice + ship;

        System.out.println(total);
    }
}
