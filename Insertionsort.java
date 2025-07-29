class Insertionsort{
    public static void printArray(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.println(arra[i]);
        }
    }
    public static void main(String arr[]){
        int arra[]={1,2,4,6,8,3,5};
        //Insertionsort
        for(int i=1;i<arra.length;i++){
            int current=arra[i];
            int j=i-1;
            while(j>=0 && current<arra[j]){
                //j is +ve and 0
                arra[j+1]=arra[j];
                j--;
            }
            //placement
            arra[j+1]=current;
        }
        printArray(arra);
    }
}