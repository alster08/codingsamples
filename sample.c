/*Code written by Al Nafea
 * Purpose: Using Loops to build a staircase
 *I found this challenge on hacker rank which
 *a website I used to impove my coding abilities
 *espcially when I was teaching myself C
 */

#include <stdio.h>
void createStaircase(int);

int main()
{
    //defines variable n to represent row. Initializes with user input
    int n; 
    printf("Please Enter the Desired Size of the Staircase: \n");
    scanf("%d",&n);
    createStaircase(n);
    return 0;
}

//function to build the staircase using nested loops with an integer as an argument to represent
//number of rows.
void createStaircase(int n)
    {
    
    //outer for loop represents rows of the stair case
    for (int i= 1; i<=n; i++)
        {
        //for loop to print spaces depending upon the row
        for(int j = n - i; j >0; j --)
            {
            printf(" ");
            }
        //for loop to print a character depending upon the row
        for (int k = n-i; k <n; k ++)
            {
            printf("#");
        }
        printf("\n");
    }
}

/* Sample Output
 
 Please Enter the Desired Size of the Staircase: 
 5
 #
 ##
 ###
 ####
 #####
 
 */
    
