#include<stdio.h>

int main(int argc, char const *argv[])
{
	char ch[1];
	printf("I love C language\n");
	printf("Do you agree?\n");
	scanf("%s", ch);
	if(ch[0] == 'Y' || ch[0] == 'y'){
		printf("Maybe you can teach me more about C\n");
	}
	else{
		printf("Don't worry\n");
	}
	
	return 0;
}
