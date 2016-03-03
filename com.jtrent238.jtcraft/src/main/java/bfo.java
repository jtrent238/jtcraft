/*    */ import java.util.Collection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bfo
/*    */   extends bex
/*    */ {
/*    */   private boolean u;
/*    */   
/*    */   public bfo(zs paramzs)
/*    */   {
/* 15 */     super(paramzs);
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 20 */     super.b();
/*    */     
/* 22 */     if (!this.k.h.aQ().isEmpty()) {
/* 23 */       this.i = (160 + (this.l - this.f - 200) / 2);
/* 24 */       this.u = true;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 30 */     super.a(paramInt1, paramInt2, paramFloat);
/* 31 */     if (this.u) {
/* 32 */       a();
/*    */     }
/*    */   }
/*    */   
/*    */   private void a() {
/* 37 */     int i = this.i - 124;
/* 38 */     int j = this.r;
/*    */     
/* 40 */     int k = 166;
/*    */     
/* 42 */     Collection localCollection = this.k.h.aQ();
/*    */     
/* 44 */     if (localCollection.isEmpty()) {
/* 45 */       return;
/*    */     }
/*    */     
/* 48 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 49 */     GL11.glDisable(2896);
/*    */     
/* 51 */     int m = 33;
/* 52 */     if (localCollection.size() > 5) {
/* 53 */       m = 132 / (localCollection.size() - 1);
/*    */     }
/*    */     
/* 56 */     for (rw localrw : this.k.h.aQ()) {
/* 57 */       rv localrv = rv.a[localrw.a()];
/*    */       
/* 59 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 60 */       this.k.P().a(a);
/*    */       
/* 62 */       b(i, j, 0, 166, 140, 32);
/*    */       
/* 64 */       if (localrv.d()) {
/* 65 */         int n = localrv.e();
/* 66 */         b(i + 6, j + 7, 0 + n % 8 * 18, 198 + n / 8 * 18, 18, 18);
/*    */       }
/*    */       
/* 69 */       String str1 = brp.a(localrv.a(), new Object[0]);
/*    */       
/* 71 */       if (localrw.c() == 1) {
/* 72 */         str1 = str1 + " " + brp.a("enchantment.level.2", new Object[0]);
/* 73 */       } else if (localrw.c() == 2) {
/* 74 */         str1 = str1 + " " + brp.a("enchantment.level.3", new Object[0]);
/* 75 */       } else if (localrw.c() == 3) {
/* 76 */         str1 = str1 + " " + brp.a("enchantment.level.4", new Object[0]);
/*    */       }
/*    */       
/* 79 */       this.q.a(str1, i + 10 + 18, j + 6, 16777215);
/*    */       
/* 81 */       String str2 = rv.a(localrw);
/* 82 */       this.q.a(str2, i + 10 + 18, j + 6 + 10, 8355711);
/*    */       
/* 84 */       j += m;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */