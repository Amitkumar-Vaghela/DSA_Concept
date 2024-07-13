## using recursssion 
 binarySearchSort(a,i,j,x){
   mid=(i+j)/2;
  if(mid=x)
  {
    return x;
  }

  elseif(a[mid]>x)
    {
    binarySearchSort(a,i,mid-1,x);
    }
  else{
    binarySearchSort(a,mid+1,j,x);
     }
  
