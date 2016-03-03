/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ 
/*    */ public class bmc implements blx
/*    */ {
/*    */   private int[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public BufferedImage a(BufferedImage paramBufferedImage)
/*    */   {
/* 12 */     if (paramBufferedImage == null) { return null;
/*    */     }
/* 14 */     this.b = 64;
/* 15 */     this.c = 32;
/*    */     
/* 17 */     BufferedImage localBufferedImage = new BufferedImage(this.b, this.c, 2);
/* 18 */     Graphics localGraphics = localBufferedImage.getGraphics();
/* 19 */     localGraphics.drawImage(paramBufferedImage, 0, 0, null);
/* 20 */     localGraphics.dispose();
/*    */     
/* 22 */     this.a = ((java.awt.image.DataBufferInt)localBufferedImage.getRaster().getDataBuffer()).getData();
/*    */     
/* 24 */     b(0, 0, 32, 16);
/* 25 */     a(32, 0, 64, 32);
/* 26 */     b(0, 16, 64, 32);
/*    */     
/* 28 */     return localBufferedImage;
/*    */   }
/*    */   
/*    */ 
/*    */   public void a() {}
/*    */   
/*    */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 36 */     if (c(paramInt1, paramInt2, paramInt3, paramInt4)) { return;
/*    */     }
/* 38 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 39 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 40 */         this.a[(i + j * this.b)] &= 0xFFFFFF;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 46 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 47 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 48 */         this.a[(i + j * this.b)] |= 0xFF000000;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 54 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 55 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 56 */         int k = this.a[(i + j * this.b)];
/* 57 */         if ((k >> 24 & 0xFF) < 128) return true;
/*    */       }
/*    */     }
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */