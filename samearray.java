class Main {
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,0};
        int b[]={1,1,0,1,1,0};
        int count=0;
        for(int i=0;i<a.length;i++){
                if(a[i]==b[i])
                {
                    count++;
                }
            }
        
        if(count==a.length)
        {
            System.out.println("a and b are the same");
        }
        else
        {
            System.out.println("a and b are not the same");
        }
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    