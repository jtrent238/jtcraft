/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class bql
/*    */   extends bqd
/*    */ {
/*    */   private double i;
/*    */   private double j;
/*    */   
/*    */   public bql(String paramString)
/*    */   {
/* 12 */     super(paramString);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void j()
/*    */   {
/* 19 */     if (this.a.isEmpty()) {
/* 20 */       return;
/*    */     }
/*    */     
/* 23 */     bao localbao = bao.B();
/*    */     
/* 25 */     double d1 = 0.0D;
/* 26 */     if ((localbao.f != null) && (localbao.h != null)) {
/* 27 */       float f = localbao.f.c(1.0F);
/* 28 */       d1 = f;
/* 29 */       if (!localbao.f.t.d()) {
/* 30 */         d1 = Math.random();
/*    */       }
/*    */     }
/*    */     
/* 34 */     double d2 = d1 - this.i;
/* 35 */     while (d2 < -0.5D)
/* 36 */       d2 += 1.0D;
/* 37 */     while (d2 >= 0.5D)
/* 38 */       d2 -= 1.0D;
/* 39 */     if (d2 < -1.0D) d2 = -1.0D;
/* 40 */     if (d2 > 1.0D) d2 = 1.0D;
/* 41 */     this.j += d2 * 0.1D;
/* 42 */     this.j *= 0.8D;
/*    */     
/* 44 */     this.i += this.j;
/*    */     
/* 46 */     int k = (int)((this.i + 1.0D) * this.a.size()) % this.a.size();
/* 47 */     while (k < 0) {
/* 48 */       k = (k + this.a.size()) % this.a.size();
/*    */     }
/* 50 */     if (k != this.g) {
/* 51 */       this.g = k;
/* 52 */       bqi.a((int[][])this.a.get(this.g), this.e, this.f, this.c, this.d, false, false);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */