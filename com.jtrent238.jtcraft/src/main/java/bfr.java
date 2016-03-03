/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfr
/*    */   extends bex
/*    */ {
/* 12 */   private static final bqx u = new bqx("textures/gui/container/furnace.png");
/*    */   private apg v;
/*    */   
/*    */   public bfr(yx paramyx, apg paramapg) {
/* 16 */     super(new aaj(paramyx, paramapg));
/* 17 */     this.v = paramapg;
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     String str = this.v.k_() ? this.v.b() : brp.a(this.v.b(), new Object[0]);
/* 23 */     this.q.b(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/*    */     
/* 25 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 30 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 31 */     this.k.P().a(u);
/* 32 */     int i = (this.l - this.f) / 2;
/* 33 */     int j = (this.m - this.g) / 2;
/* 34 */     b(i, j, 0, 0, this.f, this.g);
/* 35 */     if (this.v.i()) {
/* 36 */       int k = this.v.e(13);
/* 37 */       b(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
/* 38 */       k = this.v.d(24);
/* 39 */       b(i + 79, j + 34, 176, 14, k + 1, 16);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */