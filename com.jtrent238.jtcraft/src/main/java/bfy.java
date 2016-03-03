/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfy
/*    */   extends bex
/*    */ {
/* 12 */   private static final bqx v = new bqx("textures/gui/container/dispenser.png");
/*    */   public apb u;
/*    */   
/*    */   public bfy(yx paramyx, apb paramapb) {
/* 16 */     super(new aaz(paramyx, paramapb));
/* 17 */     this.u = paramapb;
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     String str = this.u.k_() ? this.u.b() : brp.a(this.u.b(), new Object[0]);
/* 23 */     this.q.b(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/* 24 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 29 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 30 */     this.k.P().a(v);
/* 31 */     int i = (this.l - this.f) / 2;
/* 32 */     int j = (this.m - this.g) / 2;
/* 33 */     b(i, j, 0, 0, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */