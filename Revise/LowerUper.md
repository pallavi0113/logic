When we Want to find out Lower bond in sorted array it will must follow 
arr[mid]>= x
ans=mid
high=mid-1    for find any number is left for  greater number or equal 

When we want to find out Upper bond in sorted array it will strictly follow  
arr[mid]>x
ans=mid
high= mid-1

else  low=mid+1

<!-- When to use: -->
Lower bound is useful when you want to find if target exists or its first position.

Upper bound is useful to count frequency or find range end.