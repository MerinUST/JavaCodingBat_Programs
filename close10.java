public int close10(int a, int b) {
  int first=Math.abs(10-a);
  int sec=Math.abs(10-b);
  if(first<sec){
    return a;
  }
  else if(first==sec){
    return 0;
  }
  else{
    return b;
  }
}
