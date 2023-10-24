package stacks.array;

public class Stack {
    private static final int RealSize =20;
    private int Sommet;
    private int [] StackArray = new int[RealSize];       //init arry


    public int push(int sommet)
    {
        if (this.Sommet == RealSize){
                 throw new StackOverflowError();
            }
        return this.StackArray[sommet ++] =Sommet;
    }

    public int peek()
    {
        if (this.Sommet!=0)
        {
            return this.StackArray[Sommet -1];
        }
        throw new StackOverflowError();
    }

    public int pop()
    {
        if (this.Sommet == 0)
        {
            return this.StackArray[Sommet--];
        }
        throw new StackOverflowError();
    }

    public boolean isEmpty()
    {
        return this.Sommet==0;
    }
    /*public String ToString(){

    }*/

}
