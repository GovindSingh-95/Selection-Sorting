#include<stdio.h>
void main(){
    int arr[]={1,6,3,2,4,5,1,2,23,63,2,23};
    int n=12;
    printf("Entered Array is:\n");
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
    //process
    int limit=0;
    for(int round=0;round<n;round++){
        for(int i=limit+1;i<n;i++){
            if(arr[limit]>=arr[i]){
                int temp=arr[i];
                arr[i]=arr[limit];
                arr[limit]=temp;
            }
        }
        limit++;
    }
    printf("\nSorted Array is:\n");
    for(int i=0;i<n;i++)
        printf("%d ",arr[i]);
}