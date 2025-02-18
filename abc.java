class Main {
    public static void main(String[] args) {
       String a="abcabcabc";
       char[] b=a.toCharArray();
       int [] intArray=new int[b.length];
       int count=0;
       int index;
       boolean[] arr=new boolean[26];
       for(int i=0;i<6;i++){
           arr[i]=false;
       }
       for(int i=0;i<b.length;i++){
           index=(int)b[i]-97;
           arr[index]=true;
           
       }
       for(int i=0;i<26;i++){
           if(arr[i]==true)
           count++;
       }
       System.out.println(count);
    }
}