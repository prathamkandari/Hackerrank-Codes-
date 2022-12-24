#include <stdio.h>
#include <math.h>
void update(int *a,int *b) 
{
    // Complete this function
    int p= *a + *b;
    printf("%d\n", p);
    int q;
    if(*a > *b)
    {
         q= *a - *b;
         printf("%d", q);
         
    }
    else if (*a < *b) 
    {
         q= *b - *a;
         printf("%d", q);
    }

}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d",&a);
    scanf("%d",&b);
    update(pa, pb);

    return 0;
}
