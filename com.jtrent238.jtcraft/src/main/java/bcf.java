/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bcf
/*    */   extends bcb
/*    */ {
/*    */   public bcf(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 11 */     super(paramInt1, paramInt2, paramInt3, 20, 20, "");
/*    */   }
/*    */   
/*    */   public void a(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 16 */     if (!this.m) { return;
/*    */     }
/* 18 */     parambao.P().a(bcb.a);
/* 19 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 21 */     int i = (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g) ? 1 : 0;
/* 22 */     int j = 106;
/* 23 */     if (i != 0) {
/* 24 */       j += this.g;
/*    */     }
/*    */     
/* 27 */     b(this.h, this.i, 0, j, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */