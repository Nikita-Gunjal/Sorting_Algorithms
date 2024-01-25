public class Sortingex {
    //Bubble Sort
   /* public static void main(String[]args){
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        int n=10;
        for(int iteration=0;iteration<n; iteration++){
            for(int index=0; index<n-1; index++){
                if(arr[index]<arr[index+1]){
                    int temp= arr[index+1];
                    arr[index+1]= arr[index];
                    arr[index]=temp;
                }
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
            System.out.print("");
        }
    }*/

    //SELECTION SORT
    /*public static void main(String[]args){
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        int n=10;
        for(int index=0; index<n; index++){
             int  max_elem = arr[index];
            int max_index = index;
            for(int i=index+1;i<n;i++){
                if(arr[i]>max_elem){
                    max_elem = arr[i];
                    max_index=i;
                }
            }
            int temp=arr[index];
            arr[index]=arr[max_index];
            arr[max_index]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print("  "+arr[i]);
            System.out.print("");
        }
    }*/


    //BUBBLE SORT SHRADHA MAM
    public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={5,4,1,3,2};
        
        BubbleSort(arr);
        printarray(arr);
    }

}


