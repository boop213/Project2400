import java.util.Scanner; 

public class Main {

   public static void exactChange (int change,int[] value){



      /*for(int i =0; i < value.length; i++) {
         System.out.println(value[i]);
      }*/



      String[]output = new String [4];
      int remaining = change;
      int[] num=new int [4];
      String[] plural = new String[4];
      plural[0]="pennies";
      plural[1]="nickels";
      plural[2]="dimes";
      plural[3]="quarters";
      String[] singular = new String [4];
      singular[0]="penny";
      singular[1]="nickelss";
      singular[2]="dime";
      singular[3]="quarter";
      for (int k=3;k>0;k--){
         //System.out.println(value[k]);
         num[k]=remaining/value[k];
         remaining=remaining%value[k];
         if (num[k]>0){
            if (num[k]==1){
               output[k]=(num[k]+" "+singular[k]);
               //System.out.println(num[k]+ " "+singular[k]);
            }else{
               output[k]=(num[k]+" "+plural[k]);
               //System.out.println(num[k]+ " " + plural[k]);
            }
         }
         if (remaining==0){
            break;
         }else{
            continue;
         }
      }
      if (remaining>0){
         if (remaining==1){
            System.out.println(remaining+" penny");
         }else{
            System.out.println(remaining+" pennies");
         }
      }
      for (int a=0;a<output.length;a++){
         if (num[a]>0){
            System.out.println(output[a]);
         }
      }
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      int userchange=scnr.nextInt();
      if (userchange<=0){
         System.out.println("no change");
         System.exit(0);
      }
      int[] coinVals = new int[4];

      coinVals[0]=1;
      coinVals[1]=5;
      coinVals[2]=10;
      coinVals[3]=25;

      exactChange(userchange,coinVals);

   }
}