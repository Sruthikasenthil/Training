class Main{
public static void main(String[] args){
        
        int arr[]={1,1,0,1,1,0,1,1,0,1};
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[x];
                arr[x]=temp;
                x++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        
        }
}
}