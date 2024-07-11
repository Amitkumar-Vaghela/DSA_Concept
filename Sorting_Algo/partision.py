partision(A,i,j)
{
pivot = a[i];
i=0;
j=n-1;

while(i<j)
 {
      while(a[i] <= pivot )
  {
     i++;
  }
     while(a[j]>pivot)
  {
    j++;
  }
    if(i<j)
 {
   swap(a[i] ,a[j]);
 }
swap(a[pivot] , a[j]);
return j:
  }
}


// Time complaxsity
// best case is 0(n logn)
// worst case is 0(n2)
