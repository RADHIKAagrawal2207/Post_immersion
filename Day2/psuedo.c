#include <stdio.h>

int main() {
    int a = 7;
    int b = a << 31;
    printf("%d\n",b);
    if (b < 0)
        printf("1\n");
    else
        printf("0\n");

    return 0;
}