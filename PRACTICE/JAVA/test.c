#include <stdio.h>
int main() {

    char s[]={'c','h','a','\n','c','\0'};

    char *p,*str,*str1;

    p=&s[1]; str=p; str1=s;

    printf("%d", (++*p+++*str1-32)%120);

    return 0;

}