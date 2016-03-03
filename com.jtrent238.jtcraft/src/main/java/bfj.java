/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfj
/*    */   extends bex
/*    */ {
/* 12 */   private static final bqx u = new bqx("textures/gui/container/crafting_table.png");
/*    */   
/*    */   public bfj(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 15 */     super(new aaf(paramyx, paramahb, paramInt1, paramInt2, paramInt3));
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     this.q.b(brp.a("container.crafting", new Object[0]), 28, 6, 4210752);
/* 21 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 26 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 27 */     this.k.P().a(u);
/* 28 */     int i = (this.l - this.f) / 2;
/* 29 */     int j = (this.m - this.g) / 2;
/* 30 */     b(i, j, 0, 0, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */