public class EBOB {
    public static int ebob(int num1,int num2)
    {
        int böl=2;
        int ebob=0;

        while(böl<=num1 && böl<=num2){

            if(num1%böl==0 && num2%böl==0){
                ebob=böl;
            }
            böl++;
        }

        return ebob;

    }
}
