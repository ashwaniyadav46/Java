   public class jaggedarray{
   

     public static void main(String[] args) {
        int [][] jagged= new int [2][]; //if we declare here columns also like new int [2][3] it will create a rectangular array not jagged array
        // rectangular array also means fixed 2D array
        jagged[0]= new int [2];   // taking 2 elements in 0 row and 3 elements in 1 row 
        jagged[1]=new int[3];
        //assign value
         //jagged array is an array of arrays which can have different number of elements in each row
    //initialize jagged array only with number of rows and then assign values to each row separately  we cam assign only with columns also but it is not recommended because it will create a rectangular array and we will not be able to assign different number of elements in each row
        jagged[0][0]=10;
        jagged[0][1]=20;
        jagged[1][0]=30;
        jagged[1][1]=40;
        jagged[1][2]=50;
  System.out.println("jagged array");
    for (int[] row : jagged){
    
    for(int value : row){
        System.out.println(value);
    }
    System.out.println();
}

}

     }
 
