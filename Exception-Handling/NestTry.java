//Example of nested try
class NestTry{
    public static void main(String args[])
    {   try{
            int a = args.length;
            int b = 42/a; 
            int c[] = {1};
            
            System.out.println("a= "+a); //If no command line args are present the given command will generate Division-by-Zero Exception
            try{
                if(a==1)
                    a=a/(a-a); //Division-by-Zero Exception if one command line arg is used
                if(a==2)
                    c[42]=99; //ArrayIndexOutOfBoundsException
            }  //End of second try block
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index Out Of Bounds Exception: "+e);
            }
        } //End of first try block
        catch(ArithmeticException e)
        {   
            System.out.println("Divide by Zero: "+e);
        }
    }
}
