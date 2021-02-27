//https://www.hackerrank.com/challenges/strange-advertising/problem
static int viralAdvertising(int n) {
  int temp = 5;
  int result = 0;
  for(int i=1; i<=n; i++){
    result+= temp/2;
    temp = (temp/2) * 3;
  }
  return result;
}
