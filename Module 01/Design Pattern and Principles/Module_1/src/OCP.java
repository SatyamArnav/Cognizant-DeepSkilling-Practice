import java.security.InvalidParameterException;
import java.util.*;
public class OCP {
	public static class Addition implements ArithmeticOperation{
		private double operand1;
		private double operand2;
		private double result;
		public Addition(double operand1,double operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
		}
		public void setOp1(double operand1) {
			this.operand1=operand1;
		}
		public void setOp2(double operand2) {
			this.operand2=operand2;
		}
		public double getRes() {
			return result;
		}
		@Override
		public void operation() {
			// TODO Auto-generated method stub
			result=operand1+operand2;			
		}
		
	}
	public static class Subtraction implements ArithmeticOperation{
		private double operand1;
		private double operand2;
		private double result;
		public Subtraction(double operand1,double operand2) {
		this.operand1=operand1;
		this.operand2=operand2;
		}
		public void setOp1(double operand1) {
			this.operand1=operand1;
		}
		public void setOp2(double operand2) {
			this.operand2=operand2;
		}
		public double getRes() {
			return result;
		}
		@Override
		public void operation() {
			// TODO Auto-generated method stub
			result=operand1-operand2;			
		}
		
	}
	public static class Calculator {

	    public void calculate(ArithmeticOperation op) {
	        if (op == null) {
	            throw new InvalidParameterException("Cannot perform operation");
	        }
	        op.operation();
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition(10.5, 20.3);
		Subtraction sub = new Subtraction(10.5, 20.3);

        Calculator calc = new Calculator();
        calc.calculate(add);
        System.out.println("Result of addition: " + add.getRes());
        calc.calculate(sub);
        System.out.println("Result of subtraction: " + sub.getRes());

	}

}
