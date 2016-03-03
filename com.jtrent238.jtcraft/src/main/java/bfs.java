/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfs
/*    */   extends bex
/*    */ {
/* 12 */   private static final bqx u = new bqx("textures/gui/container/hopper.png");
/*    */   private rb v;
/*    */   private rb w;
/*    */   
/*    */   public bfs(yx paramyx, rb paramrb) {
/* 17 */     super(new aal(paramyx, paramrb));
/* 18 */     this.v = paramyx;
/* 19 */     this.w = paramrb;
/* 20 */     this.p = false;
/*    */     
/* 22 */     this.g = 133;
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 27 */     this.q.b(this.w.k_() ? this.w.b() : brp.a(this.w.b(), new Object[0]), 8, 6, 4210752);
/* 28 */     this.q.b(this.v.k_() ? this.v.b() : brp.a(this.v.b(), new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 33 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 34 */     this.k.P().a(u);
/* 35 */     int i = (this.l - this.f) / 2;
/* 36 */     int j = (this.m - this.g) / 2;
/* 37 */     b(i, j, 0, 0, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */