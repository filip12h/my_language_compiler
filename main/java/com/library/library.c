#include <stdio.h>
#include <stdlib.h>

int print_int(int n) {
    printf("%d", n);
    return 0;
}

int print_char(char character) {
    printf("%c", character);
    return 0;
}

int read_int() {
    int n;
    scanf("%d", &n);
    return n;
}

char read_char() {
    char character;
    scanf("%c", &character);
    return character;
}