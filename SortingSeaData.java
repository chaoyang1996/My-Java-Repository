#Use bitmap to sorting 100M data in fastest time and lowest cost
#restriction: each element at least appears one time and has no connection with other element
private BitSet bits;

public void perform(String largeFileName, int total, String destLargeFileName, Castor<Integer> castor,
      int readerBufferSize, int writerBufferSize, boolean asc) throw IOException{

  System.out.println("BitmapSort Started.");
  long start = System.currentTimeMillis();
  bits = new BitSet(total);
  InputPart<Integer> largeIn = PartFactory.createCharBufferedInputPart(FileName, readerBufferSize);
  OutputPart<Integer> largeOut = PartFactory.createCharBuffferedOutputPart(destFileName, writerBufferSize);
  largeOut.delete();
  
  Integer data;
  int off = 0;
  try{
    while(true){
        data = largeIn.read();
        if(data==null)
          breakl
         int v = data;
         set(v);
         off++
      }
      largeIn.close();
      int size = bits.size();
      System.out.println(String.format("lines ; %d ,bits: %d",off,size));
      
      if (asc){
        for(int i=0;i<size;i++){
            if (get(i)){
                largeOut.write(i);
              }
          }
        }else{
          for (int i=size-1;i>=0;i--){
              if ((get(i)){
                  largeOut.write(i);
                }
            }
        }
        largeOut.close();
        long stop = System.currentTmeMllis();
        long elapsed = stop-start;
        System.out.println(String.format("BitmapSort Completed.elapsed: %dms",elapsed));
     } finally{
        largeIn.close();
        largeOut.close();
      }
}

private void set(int i){
  bits.set(i);
}

private boolean get(int v){
  return bits.get(v);
}
