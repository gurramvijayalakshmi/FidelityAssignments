#include<stdio.h>

int main(){
    int a=10, b=3;
    float res1= a/b;
    printf("without typecasting : %f\n",res1);

    float res2 = (float) a/b;
    printf("with typecasting :%f\n",res2);
    return 0;
}