class largestrectangel {
    public int largestRectangleArea(int[] h) {
         
            int area=0;
            int ma=0;
        for(int i=0;i<h.length;i++){
           int l=i;
            int r=i;
            while(l>=0 && h[l]>=h[i]){
                l--;
            }
            while(r<=h.length-1 && h[r]>=h[i] ){
                r++;
            }
  area=(r-l-1)*h[i];
  if(area>ma){
    ma=area;
  }
        }
return ma;
    }
}