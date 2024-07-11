quickSort(A,i,j){
  if (i<j){
    loc = partition(A,i,j);
    quickSort(A,i,loc-1);   // In Array  from Start elemnt
    quickSort(A,loc+1,j);   // In Array  from (loctation-1) to  Last element 
  }
}
