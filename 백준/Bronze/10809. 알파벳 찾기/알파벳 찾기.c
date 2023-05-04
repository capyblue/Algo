#include<stdio.h>
#include<string.h>
int main(){
    int check[26];
    memset(check,-1,sizeof(check));
    char alphabet[100];
    
    scanf("%s",&alphabet);
    for(int i=0;i<strlen(alphabet);i++){
        switch(alphabet[i]){
            case 'a': if(check[0]==-1)check[0]=i; break;
            case 'b': if(check[1]==-1)check[1]=i; break;
            case 'c': if(check[2]==-1)check[2]=i; break;
            case 'd': if(check[3]==-1)check[3]=i; break;
            case 'e': if(check[4]==-1)check[4]=i; break;
            case 'f': if(check[5]==-1)check[5]=i; break;
            case 'g': if(check[6]==-1)check[6]=i; break;
            case 'h': if(check[7]==-1)check[7]=i; break;
            case 'i': if(check[8]==-1)check[8]=i; break;
            case 'j': if(check[9]==-1)check[9]=i; break;
            case 'k': if(check[10]==-1)check[10]=i; break;
            case 'l': if(check[11]==-1)check[11]=i; break;
            case 'm': if(check[12]==-1)check[12]=i; break;
            case 'n': if(check[13]==-1)check[13]=i; break;
            case 'o': if(check[14]==-1)check[14]=i; break;
            case 'p': if(check[15]==-1)check[15]=i; break;
            case 'q': if(check[16]==-1)check[16]=i; break;
            case 'r': if(check[17]==-1)check[17]=i; break;
            case 's': if(check[18]==-1)check[18]=i; break;
            case 't': if(check[19]==-1)check[19]=i; break;
            case 'u': if(check[20]==-1)check[20]=i; break;
            case 'v': if(check[21]==-1)check[21]=i; break;
            case 'w': if(check[22]==-1)check[22]=i; break;
            case 'x': if(check[23]==-1)check[23]=i; break;
            case 'y': if(check[24]==-1)check[24]=i; break;
            case 'z': if(check[25]==-1)check[25]=i; break;
            default: break;

        }
    }
    for(int i=0;i<26;i++){
        printf("%d ",check[i]);
    }
    
    return 0;
}