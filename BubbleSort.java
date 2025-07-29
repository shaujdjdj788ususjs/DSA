class BubbleSort{
    public static void printArray(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.println(arra[i]);
        }
    }
    public static void main(String arr[]){
        int arra[]={1,2,4,6,8,3,5};
        //bubble sort
        for(int i=0;i<arra.length-1;i++){
            for(int j=0;j<arra.length-i-1;j++){
                if(arra[j]>arra[j+1]){
                    int temp=arra[j];
                    arra[j]=arra[j+1];
                    arra[j+1]=temp;
                }
            }
        }
        printArray(arra);
    }
}