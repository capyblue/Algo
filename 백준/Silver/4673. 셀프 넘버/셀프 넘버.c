#include<stdio.h>

int self(int su){
    int sum=su;
    while(su>0){
        sum+=su%10;
        su/=10;
    }
    return sum;
}

int main(){
    int arr[12000]={0};
    for(int i=1;i<10000;i++){
        if(self(i)<10001)
            arr[self(i)]=1;
    }
    for(int i=1;i<10000;i++){
        if(arr[i]==0) printf("%d\n",i);
    }
}