import java.util.*;

public class Main{
  public static void main(String[] args){
   String title = "戦艦ゲーム";
   System.out.println(title);
   int[][] array;
   array = new int[5][5];

   //配列の初期化
for(int i=0;i<array.length;i++){
 for(int s=0;s<array.length;s++){
 array[i][s] = 0;   
 }
}
int fune1 = 0;
int fune2 = 0;
int fune3 = 0;
//船の配置
Random random = new Random();
int random1 = random.nextInt(5);
int random2 = random.nextInt(5);
int random3 = random.nextInt(5);
int random4 = random.nextInt(5);
int random5 = random.nextInt(5);
int random6 = random.nextInt(5);
   array[random1][random2] = 1;
   array[random3][random4] = 2;
   array[random5][random6] = 3;

//確認のための表示

   for(int i=0;i<array.length;i++){
    for(int s=0;s<array.length;s++){
    System.out.print(array[i][s]);
        
    }
    System.out.println();
   }

while(fune1<=3&&fune2<=3&&fune3<=3){

   int X = new java.util.Scanner(System.in).nextInt();
   int Y = new java.util.Scanner(System.in).nextInt();

   if(array[X][Y]==0){
    if(array[X-1][Y]!=0){
      System.out.println("波高し！");
    }else if(array[X+1][Y]!=0){
      System.out.println("波高し！");
    }else if(array[X][Y-1]!=0){
      System.out.println("波高し！");
    }else if(array[X][Y+1]!=0){
      System.out.println("波高し！");
    }else{
      System.out.println("ハズレ");
    }


   }else if(array[X][Y]==1){
    fune1++;
    System.out.println("命中だがまだ沈まない移動します。");
   }else if(array[X][Y]==2){
     fune2++;
     System.out.println("命中だがまだ沈まない移動します。");
   }else if(array[X][Y]==3){
     fune3++;
     System.out.println("命中だがまだ沈まない移動します。");
   }
  }

 }
}