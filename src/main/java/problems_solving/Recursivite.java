package problems_solving;

public class Recursivite {
    // public Double Sum;

    // factor 3*2*1
    public Double factor(int num){
        if (num ==1)
        {
            return 1.0;
        }
        return num * factor(num -1);   //factor(3) = 3 * 2 * factor(1)      factor(3) = 3 * factor(2)
    }

    /*Écrivez une méthode récursive en Java pour calculer la factorielle d'un nombre entier positif n. La factorielle de
    n est le produit de tous les entiers positifs inférieurs ou égaux à n. La formule de
    la factorielle est définie comme suit : n! = n * (n-1) * (n-2) * ... * 1.*/

    public static Double CalculFact(int number) {
        if (number ==1 || number ==0)
        {
            return 1.0;
        }else {
            return number * CalculFact(number-1);
        }
    }

}
