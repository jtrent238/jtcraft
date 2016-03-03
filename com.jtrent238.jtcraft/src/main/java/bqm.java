/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bqm
/*    */   extends bqd
/*    */ {
/*    */   public double i;
/*    */   public double j;
/*    */   
/*    */   public bqm(String paramString)
/*    */   {
/* 15 */     super(paramString);
/*    */   }
/*    */   
/*    */   public void j()
/*    */   {
/* 20 */     bao localbao = bao.B();
/*    */     
/* 22 */     if ((localbao.f != null) && (localbao.h != null)) {
/* 23 */       a(localbao.f, localbao.h.s, localbao.h.u, localbao.h.y, false, false);
/*    */     } else {
/* 25 */       a(null, 0.0D, 0.0D, 0.0D, true, false);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean1, boolean paramBoolean2)
/*    */   {
/* 32 */     if (this.a.isEmpty()) {
/* 33 */       return;
/*    */     }
/*    */     
/* 36 */     double d1 = 0.0D;
/* 37 */     if ((paramahb != null) && (!paramBoolean1)) {
/* 38 */       r localr = paramahb.K();
/* 39 */       double d3 = localr.a - paramDouble1;
/* 40 */       double d4 = localr.c - paramDouble2;
/* 41 */       paramDouble3 %= 360.0D;
/* 42 */       d1 = -((paramDouble3 - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(d4, d3));
/* 43 */       if (!paramahb.t.d()) {
/* 44 */         d1 = Math.random() * 3.1415927410125732D * 2.0D;
/*    */       }
/*    */     }
/*    */     
/* 48 */     if (paramBoolean2) {
/* 49 */       this.i = d1;
/*    */     } else {
/* 51 */       double d2 = d1 - this.i;
/* 52 */       while (d2 < -3.141592653589793D)
/* 53 */         d2 += 6.283185307179586D;
/* 54 */       while (d2 >= 3.141592653589793D)
/* 55 */         d2 -= 6.283185307179586D;
/* 56 */       if (d2 < -1.0D) d2 = -1.0D;
/* 57 */       if (d2 > 1.0D) d2 = 1.0D;
/* 58 */       this.j += d2 * 0.1D;
/* 59 */       this.j *= 0.8D;
/* 60 */       this.i += this.j;
/*    */     }
/*    */     
/* 63 */     int k = (int)((this.i / 6.283185307179586D + 1.0D) * this.a.size()) % this.a.size();
/* 64 */     while (k < 0) {
/* 65 */       k = (k + this.a.size()) % this.a.size();
/*    */     }
/* 67 */     if (k != this.g) {
/* 68 */       this.g = k;
/* 69 */       bqi.a((int[][])this.a.get(this.g), this.e, this.f, this.c, this.d, false, false);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */