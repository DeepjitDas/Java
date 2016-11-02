class Exc1{
  public static void main(String args[])
  { int d,a;
    try
    { d=0;
      a=42/d;
    }
    catch(ArithmeticException e)
    { System.out.println("Division by Zero");
    }
  }
 }
