class Calculator{ //객체화 결과
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator(); //->이것이 객체
        c1.setOprands(10, 20);			  //객체가 가지고 있는 로직을 클래스
        c1.sum();                         //실제 객체의 내용을 인스턴스
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}
//객체는 하나의 작은프로그램으로 볼 필요가있다