
package Ejercicio09;


public class Matematica {
    private double num1;
    private double num2;
    
    public Matematica(){}
    
    public Matematica(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
    
    public double getNum2(){
        return num2;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }
    
    public double devolverMayor(){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    
    public double calcularPotencia(){
        double num;
       num1 = Math.round(num1);
       num2 = Math.round(num2);
         if(num1 > num2){
           num = Math.pow(num1, num2);
        }else{
            num = Math.pow(num2, num1);
        }
      return num;
    }
    
    public double calcularRaiz(){
        double r2;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        
        if(num1 < num2){
            r2 = Math.sqrt(num1);
        }else{
            r2 = Math.sqrt(num2);
        }
        
        return r2;
    }
}
