#include<stdio.h>
#include <stdbool.h>
int main(){
       float player_hieght =6.2f;
       double player_innings = 6.213;
       printf("player hieght : %.5f \n",player_hieght);
       printf("player innings : %lf\n",player_innings);

       char player_initial= 'J';
       char player_name[50] ="vijji";
       printf("player initial : %c\n", player_initial);
       printf("player name : %s\n ", player_name);

       const int max_limit = 10;
       printf("player max_limit : %d\n ",max_limit);

           bool is_active = true;                  // Boolean type for player's active status (true/false)
    printf("Is Player Active: %s\n", is_active ? "Yes" : "No");
return 0;
}