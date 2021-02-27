//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignerPDF{
  static int designerPdfViewer(int[] h, String word) {
      int max = 0;
      for(int i=0; i<word.length(); i++){
          if(h[word.charAt(i) - 'a'] > max){
              max = h[word.charAt(i) - 'a'];
          }
      }
      return max * word.length();
  }
}
