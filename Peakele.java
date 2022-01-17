public class Peakele {
    static int peakElement(int[] arr,int n)
    {
        int j=-1;
        for(int i=0; i<n; i++){
           if(n==1){
               j = n-1;
               return j;
            }else if(n==2){
                   if(arr[0]>arr[1]){
                        j = 0;
                        return j;
                   }else{
                       j = 1;
                       return j;
                   }
                        
            }else{
                if(i==0){
                    if(arr[0]>arr[1]){
                        j = 0;
                        return j;
                    }else{
                        continue;
                    }
                }else if(i==n-1){
                    if(arr[i]>=arr[i-1]){
                        j = i;
                        return i;
                    }
                }else if((arr[i] >= arr[i-1]) && (arr[i]>= arr[i+1])){
                    j = i;
                    return j;
                }
                   
            }
                    
        }
       return j;
    }

    public static void main(String[] args){
        int arr[] = {17,19,9,5,3,6,17,7,18,16,18,11,3,15,2};
        int n=15;
        System.out.println(peakElement(arr,n));
    }

    
}
