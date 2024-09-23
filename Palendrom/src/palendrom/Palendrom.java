package palendrom;


public class Palendrom {
    public static void main(String[] args) {
        int levels=4;
        int[][]pyramid=new int[levels][];
       for(int i=0;i<levels;i++){
           pyramid[i]=new int[i+1];
           int num=2;
           for(int j=0;j<=i;j++){
               pyramid[i][j]=num;
               num=num*10+2;
           }
       }
       for(int[]row:pyramid){
           for(int num:row){
               System.out.print(num+" ");
           }
           System.out.println();
       }
    }
    
}
