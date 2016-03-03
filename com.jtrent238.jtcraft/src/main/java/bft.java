/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bft
/*    */   extends bex
/*    */ {
/* 12 */   private static final bqx u = new bqx("textures/gui/container/horse.png");
/*    */   private rb v;
/*    */   private rb w;
/*    */   private wi x;
/*    */   private float y;
/*    */   private float z;
/*    */   
/* 19 */   public bft(rb paramrb1, rb paramrb2, wi paramwi) { super(new aam(paramrb1, paramrb2, paramwi));
/* 20 */     this.v = paramrb1;
/* 21 */     this.w = paramrb2;
/* 22 */     this.x = paramwi;
/* 23 */     this.p = false;
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 28 */     this.q.b(this.w.k_() ? this.w.b() : brp.a(this.w.b(), new Object[0]), 8, 6, 4210752);
/* 29 */     this.q.b(this.v.k_() ? this.v.b() : brp.a(this.v.b(), new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 34 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 35 */     this.k.P().a(u);
/* 36 */     int i = (this.l - this.f) / 2;
/* 37 */     int j = (this.m - this.g) / 2;
/* 38 */     b(i, j, 0, 0, this.f, this.g);
/*    */     
/* 40 */     if (this.x.ck()) {
/* 41 */       b(i + 79, j + 17, 0, this.g, 90, 54);
/*    */     }
/* 43 */     if (this.x.cB()) {
/* 44 */       b(i + 7, j + 35, 0, this.g + 54, 18, 18);
/*    */     }
/*    */     
/* 47 */     bfu.a(i + 51, j + 60, 17, i + 51 - this.y, j + 75 - 50 - this.z, this.x);
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 52 */     this.y = paramInt1;
/* 53 */     this.z = paramInt2;
/*    */     
/* 55 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */