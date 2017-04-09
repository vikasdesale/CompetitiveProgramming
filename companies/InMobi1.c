#include <stdio.h>
void sort(int* arr, int n)
{
	int temp = 0;
	for(int i  = 0; i < n ; i++)
	{
		for(int j=1; j < n-i; j++)
		{
			if(arr[j-1] > arr[j])
			{
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}	
		}		
	}
}
int main()
{
	int test, n,flag;
	long diff;
    scanf("%d",&test);
    
    for(int i = 0; i < test; i++)
    {
    	flag = 1;
    	diff = 0;
    	scanf("%d",&n);
    	int * arr = (int*)malloc(n*sizeof(int));
    	for(int j = 0; j < n; j++)
    		scanf("%d",&arr[j]);
    	if(flag)
    	{
    	sort(&arr[0], n);
    	diff = 1000000;
    	/*for(int k = 1; k < n; k++)
    		if((arr[k]-arr[k-1])<diff)
    			diff = (arr[k]-arr[k-1]);*/
    	}
    	int *newarr = (int*)malloc((n/2)*sizeof(int));
    	
    	for(int z = 0;z < n/2; z++ )
    		newarr[z] = arr[z]+arr[n-1-z];
    	sort(&newarr[0],n/2);
    	diff = newarr[n/2-1] - newarr[0];
       	printf("%d\n",diff);    	
    }
    //}
    return 0;
}