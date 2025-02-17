class Main {
    public static void main(String[] args) {
        int arr[]={3,2,3,1,2,9};
        int i;
        int j=0;
        for ( i = 0; i < arr.length; i++)
        {
            for (j =j+1; j<arr.length;j++)
            {
                if (arr[i] == arr[j])
                {
                  
                   break;
                }
                else
                {
                    System.out.print(arr[i]);
                }
          }
      }
   }
}


