/*    */ import java.awt.image.BufferedImage;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpq
/*    */   extends bpp
/*    */ {
/*    */   private final int[] b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public bpq(BufferedImage paramBufferedImage)
/*    */   {
/* 14 */     this(paramBufferedImage.getWidth(), paramBufferedImage.getHeight());
/*    */     
/* 16 */     paramBufferedImage.getRGB(0, 0, paramBufferedImage.getWidth(), paramBufferedImage.getHeight(), this.b, 0, paramBufferedImage.getWidth());
/*    */     
/* 18 */     a();
/*    */   }
/*    */   
/*    */   public bpq(int paramInt1, int paramInt2) {
/* 22 */     this.c = paramInt1;
/* 23 */     this.d = paramInt2;
/* 24 */     this.b = new int[paramInt1 * paramInt2];
/*    */     
/* 26 */     bqi.a(b(), paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(bqy parambqy) {}
/*    */   
/*    */ 
/*    */   public void a()
/*    */   {
/* 35 */     bqi.a(b(), this.b, this.c, this.d);
/*    */   }
/*    */   
/*    */   public int[] d() {
/* 39 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */