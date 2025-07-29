class Selectionsort{
    public static void printArray(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.println(arra[i]);
        }
    }
    public static void main(String arr[]){
        int arra[]={1,2,4,6,8,3,5};
        //Selection sort
        for(int i=0;i<arra.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arra.length;j++){
                if(arra[smallest]>arra[j]){
                    smallest=j;
                }
            }
            int temp=arra[smallest];
            arra[smallest]=arra[i];
            arra[i]=temp;
        }
        printArray(arra);
    }
}