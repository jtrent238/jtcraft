/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xf
/*    */   extends qw
/*    */ {
/*    */   private final add b;
/*    */   private float c;
/*    */   private boolean d;
/*    */   
/*    */   public xf(add paramadd, int paramInt)
/*    */   {
/* 15 */     super(paramInt);
/* 16 */     this.b = paramadd;
/*    */   }
/*    */   
/*    */   public add a(Random paramRandom) {
/* 20 */     add localadd = this.b.m();
/*    */     
/* 22 */     if (this.c > 0.0F) {
/* 23 */       int i = (int)(this.c * this.b.l());
/* 24 */       int j = localadd.l() - paramRandom.nextInt(paramRandom.nextInt(i) + 1);
/* 25 */       if (j > i) j = i;
/* 26 */       if (j < 1) j = 1;
/* 27 */       localadd.b(j);
/*    */     }
/*    */     
/* 30 */     if (this.d) {
/* 31 */       afv.a(paramRandom, localadd, 30);
/*    */     }
/*    */     
/* 34 */     return localadd;
/*    */   }
/*    */   
/*    */   public xf a(float paramFloat) {
/* 38 */     this.c = paramFloat;
/* 39 */     return this;
/*    */   }
/*    */   
/*    */   public xf a() {
/* 43 */     this.d = true;
/* 44 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */