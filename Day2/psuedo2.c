#include <stdio.h>

int main() {
    int x = 0;
    for (int I = 0; I <= 2; I++) {
        x ^= 1 << I;
    }
    printf("%d\n", x);
    return 0;
}
// ans-7