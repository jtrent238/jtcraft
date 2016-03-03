/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfg
/*    */   extends bex
/*    */ {
/* 14 */   private static final bqx u = new bqx("textures/gui/container/brewing_stand.png");
/*    */   private aov v;
/*    */   
/*    */   public bfg(yx paramyx, aov paramaov) {
/* 18 */     super(new zz(paramyx, paramaov));
/* 19 */     this.v = paramaov;
/*    */   }
/*    */   
/*    */   protected void b(int paramInt1, int paramInt2)
/*    */   {
/* 24 */     String str = this.v.k_() ? this.v.b() : brp.a(this.v.b(), new Object[0]);
/* 25 */     this.q.b(str, this.f / 2 - this.q.a(str) / 2, 6, 4210752);
/* 26 */     this.q.b(brp.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
/*    */   }
/*    */   
/*    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 31 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 32 */     this.k.P().a(u);
/* 33 */     int i = (this.l - this.f) / 2;
/* 34 */     int j = (this.m - this.g) / 2;
/* 35 */     b(i, j, 0, 0, this.f, this.g);
/*    */     
/* 37 */     int k = this.v.i();
/* 38 */     if (k > 0) {
/* 39 */       int m = (int)(28.0F * (1.0F - k / 400.0F));
/* 40 */       if (m > 0) {
/* 41 */         b(i + 97, j + 16, 176, 0, 9, m);
/*    */       }
/*    */       
/* 44 */       int n = k / 2 % 7;
/* 45 */       switch (n) {
/*    */       case 6: 
/* 47 */         m = 0;
/* 48 */         break;
/*    */       case 5: 
/* 50 */         m = 6;
/* 51 */         break;
/*    */       case 4: 
/* 53 */         m = 11;
/* 54 */         break;
/*    */       case 3: 
/* 56 */         m = 16;
/* 57 */         break;
/*    */       case 2: 
/* 59 */         m = 20;
/* 60 */         break;
/*    */       case 1: 
/* 62 */         m = 24;
/* 63 */         break;
/*    */       case 0: 
/* 65 */         m = 29;
/*    */       }
/*    */       
/*    */       
/* 69 */       if (m > 0) {
/* 70 */         b(i + 65, j + 14 + 29 - m, 185, 29 - m, 12, m);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */