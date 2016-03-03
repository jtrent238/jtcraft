/*    */ 
/*    */ 
/*    */ 
/*    */ public class bbr
/*    */ {
/*    */   float a;
/*    */   private double f;
/*    */   public int b;
/*    */   public float c;
/* 10 */   public float d = 1.0F;
/*    */   
/*    */   public float e;
/*    */   private long g;
/*    */   private long h;
/*    */   private long i;
/* 16 */   private double j = 1.0D;
/*    */   
/*    */   public bbr(float paramFloat) {
/* 19 */     this.a = paramFloat;
/* 20 */     this.g = bao.K();
/* 21 */     this.h = (System.nanoTime() / 1000000L);
/*    */   }
/*    */   
/*    */   public void a() {
/* 25 */     long l1 = bao.K();
/* 26 */     long l2 = l1 - this.g;
/* 27 */     long l3 = System.nanoTime() / 1000000L;
/* 28 */     double d1 = l3 / 1000.0D;
/*    */     
/* 30 */     if ((l2 > 1000L) || (l2 < 0L)) {
/* 31 */       this.f = d1;
/*    */     } else {
/* 33 */       this.i += l2;
/* 34 */       if (this.i > 1000L) {
/* 35 */         long l4 = l3 - this.h;
/*    */         
/* 37 */         double d3 = this.i / l4;
/* 38 */         this.j += (d3 - this.j) * 0.20000000298023224D;
/*    */         
/* 40 */         this.h = l3;
/* 41 */         this.i = 0L;
/*    */       }
/* 43 */       if (this.i < 0L) {
/* 44 */         this.h = l3;
/*    */       }
/*    */     }
/* 47 */     this.g = l1;
/*    */     
/* 49 */     double d2 = (d1 - this.f) * this.j;
/* 50 */     this.f = d1;
/*    */     
/* 52 */     if (d2 < 0.0D) d2 = 0.0D;
/* 53 */     if (d2 > 1.0D) { d2 = 1.0D;
/*    */     }
/* 55 */     this.e = ((float)(this.e + d2 * this.d * this.a));
/*    */     
/* 57 */     this.b = ((int)this.e);
/* 58 */     this.e -= this.b;
/* 59 */     if (this.b > 10) this.b = 10;
/* 60 */     this.c = this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */