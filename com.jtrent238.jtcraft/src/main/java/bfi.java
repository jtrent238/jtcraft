/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfi
/*    */   extends bex
/*    */ {
/* 11 */   private static final bqx u = new bqx("textures/gui/container/generic_54.png");
/*    */   private rb v;
/*    */   private rb w;
/*    */   private int x;
/*    */   
/*    */   public bfi(rb paramrb1, rb paramrb2)
/*    */   {
/* 18 */     super(new aad(paramrb1, paramrb2));
/* 19 */     this.v = paramrb1;
/* 20 */     this.w = paramrb2;
/* 21 */     this.p = false;
/*    */     
/* 23 */     int i = 222;
/* 24 */     int j = i - 108;
/* 25 */     this.x = (paramrb2.a() / 9);
/*    */     
/* 27 */     this.g = (j + this.x * 18);
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 32 */     this.q.b(this.w.k_() ? this.w.b() : brp.a(this.w.b(), new Object[0]), 8, 6, 4210752);
/* 33 */     this.q.b(this.v.k_() ? this.v.b() : brp.a(this.v.b(), new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 38 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 39 */     this.k.P().a(u);
/* 40 */     int i = (this.l - this.f) / 2;
/* 41 */     int j = (this.m - this.g) / 2;
/* 42 */     b(i, j, 0, 0, this.f, this.x * 18 + 17);
/* 43 */     b(i, j + this.x * 18 + 17, 0, 126, this.f, 96);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */